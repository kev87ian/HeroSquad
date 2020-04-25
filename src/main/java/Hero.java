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
    public static Hero findById(int id) {
        return instances.get(id -1);
    }

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
    // Generate My heroes

    public static Hero setUpNewHero(){
        return new Hero("CR7",35,"Rocket Shots","Curling");
    }
    public static Hero setUpNewHero1(){
        return new Hero("LM10",33,"Dribbling","Long Shots");
    }
    public static Hero setUpNewHero2(){
        return new Hero("Kroos",30,"Accuracy","Pace");
    }
}
