package HeroesSquad;

import java.util.ArrayList;
import java.util.List;

public class Hero {
    private String name;
    private int age;
    private String power;
    private String weakness;
    private int id;
    private static ArrayList<Hero> instances = new ArrayList<>();

    public Hero(String name, Integer age, String power, String weakness) {
        this.name = name;
        this.age = age;
        this.power = power;
        this.weakness = weakness;
        instances.add(this);
        this.id = instances.size();
    }
// getters

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String power() {
        return power;
    }

    public String getWeakness() {
        return weakness;
    }

    public String getPower() {
        return power;
    }

    public int getId() {
        return id;
    }
    public static Hero findById(int id) {
        return instances.get(id -1);
    }

    // Generate My heroes

    public static Hero generateNewHero(){
        return new Hero("CR7",35,"Rocket Shots","Curling");
    }
    public static Hero generateNewHero1(){
        return new Hero("LM-10",33,"Dribbling","Long Shots");
    }
    public static Hero generateNewHero2(){
        return new Hero("Kroos (German Sniper",30,"Accuracy","Pace");
    }
    public static Hero generateNewHero3(){
        return new Hero ("Bale-11", 30, "Pace", "Injury-Prone");
    }
}
