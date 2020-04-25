import java.util.List;
import java.util.ArrayList;

public class Squad {
    private String Name;
    private int squadID;
    private String cause;
    private int squadSize;
    private ArrayList<Hero>  squadMembers = new ArrayList<>();
    private static ArrayList<Squad> instances = new ArrayList<>();

    public Squad(String name, int squadSize, String cause) {
        Name = name;
        cause = this.cause;
        squadSize = this.squadSize;
        squadID = instances.size();
        instances.add(this);
        this.squadMembers = new ArrayList<>();
    }

    public String getName() {
        return Name;
    }

    public int getSquadID() {
        return squadID;
    }

    public int getSize() {
        return squadSize;
    }

    public String getCause() {
        return cause;
    }

    public ArrayList<Hero> getSquadMembers() {
        return squadMembers;
    }

    public static ArrayList<Squad> getInstances() {
        return instances;
    }
    public void setSquadMembers(Hero newMember) {
        squadMembers.add(newMember);
    }
    public static void clearAllSquads(){ instances.clear(); }
    public void clearAllSquadMembers(){ getSquadMembers().clear(); }

    public static Squad setUpNewSquad(){return new Squad("Galacticos",3,"UEFA");}
    public static Squad setUpNewSquad1(){return new Squad("Blaugrana",3,"La Liga");}
}
