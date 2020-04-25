import static org.junit.Assert.*;
import org.junit.*;

public class HeroTest {
    @Test
    public void newHero_getName_String() {
        Hero newHero = Hero.generateNewHero();
        assertEquals("CR7",newHero.getName());
    }

    @Test
    public void newHero_getAge_Int() {
        Hero newHero = Hero.generateNewHero();
        assertEquals(35,newHero.getAge());
    }
    @Test
    public  void newHero_getPower_String(){
        Hero newHero = Hero.generateNewHero();
        assertEquals("Rocket Shots", newHero.getPower());
    }
    @Test
    public void newHero1_fetchName_String() {
        Hero newHero = Hero.generateNewHero1();
        assertEquals("LM-10", newHero.getName());
    }
//    @Test
//    public void newHero2_getName_String
    @Test
    public void newHero3_getName_String(){
        Hero newHero = Hero.generateNewHero3();
        assertEquals("Bale-11", newHero.getName());
    }
    @Test
    public void newHero3_getPower_String(){
        Hero newHero = Hero.generateNewHero3();
        assertEquals("Pace", newHero.getPower());
    }
}

