import models.Hero;
import models.Squad;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");

        ProcessBuilder process = new ProcessBuilder();
        Integer port;

        // This tells our app that if Heroku sets a port for us, we need to use that port.
        // Otherwise, if they do not, continue using port 4567.

        if (process.environment().get("PORT") != null) {
            port = Integer.parseInt(process.environment().get("PORT"));
        } else {
            port = 4567;
        }

        port(port);
        staticFileLocation("/public");


        get("/heroes/new",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"addhero-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/heroes/new", (req,res)->{
            Map<String,Object> model = new HashMap<>();
            String name = req.queryParams("name");
            int age = Integer.parseInt( req.queryParams("age"));
            String specialPower = req.queryParams("powers");
            String weakness = req.queryParams("weakness");
            Hero hero = new Hero(name,age,specialPower,weakness);
            return new ModelAndView(model,"success.hbs");

        },new HandlebarsTemplateEngine());
        get("/squads/new",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            return new ModelAndView(model,"addSquad-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/squads/new", (req,res)->{
            Map<String,Object> model = new HashMap<>();
            String squadName = req.queryParams("squadName");
            int maxSize = Integer.parseInt( req.queryParams("maxSize"));
            String squadCause = req.queryParams("squadCause");
            Squad mySquad = new Squad(squadName,maxSize,squadCause);
            return new ModelAndView(model,"addSquadSuccess.hbs");

        },new HandlebarsTemplateEngine());

        get("/squads/:id",(req,res)->{
            Map<String, Object>model = new HashMap<>();
            int idOfSquadToFind = Integer.parseInt(req.params(":id"));
            Squad foundSquad =  Squad.findById(idOfSquadToFind);
            model.put("squad",foundSquad);
            return new ModelAndView(model,"squadDetails.hbs");

        }, new HandlebarsTemplateEngine());


        get("/heroes/:id",(req,res)->{
            Map<String, Object> model = new HashMap<>();
            int idOfHeroToFind = Integer.parseInt(req.params(":id"));
            Hero foundHero =  Hero.findById(idOfHeroToFind);
            model.put("hero",foundHero);
            return new ModelAndView(model,"heroDetails.hbs");

        }, new HandlebarsTemplateEngine());


        get("/",(req,res)->{
            Map<String,Object> model = new HashMap<>();
            List<Hero> heroes = Hero.all();
            List<Squad> squads = Squad.all();
            model.put("heroes",heroes);
            model.put("squads",squads);

            return new ModelAndView(model,"index.hbs");
        }, new HandlebarsTemplateEngine());
    }
}