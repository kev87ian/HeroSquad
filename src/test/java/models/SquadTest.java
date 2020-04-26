package models;
import org.junit.Test;
import static org.junit.Assert.*;



public class SquadTest {

    public Squad setUpNewSquad(){
        return new Squad("Los Blancos",11,"UEFA");
    }


    @Test
    public void newSquadInstantiatesCorrectly_true() {
        Squad mySquad = setUpNewSquad();
        assertEquals( true,mySquad instanceof Squad);
    }
    @Test
    public void maxSizeInstantiatesCorrectly_Integer(){
        Squad mySquad = setUpNewSquad();
        assertEquals(11, mySquad.getMaxSize());
    }

    @Test
    public void newSquadCauseIsInstantiatedCorrectly_String() {
        Squad mySquad = setUpNewSquad();
        assertEquals("UEFA", mySquad.getSquadCause());
    }
    @Test
    public void addHeroes_addsHeroToHeroList_true() {
        Squad mySquad = setUpNewSquad();
        Hero testHero = new Hero("Zlatan", 38,"Height" ,"Discipline");
        mySquad.addHero(testHero);
        assertTrue(mySquad.getHeroes().contains(testHero));
    }
}