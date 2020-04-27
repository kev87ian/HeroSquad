package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {

    public Hero setUpNewHero(){
        return new Hero("Flash",25,"Superspeed","Alcohol");
    }

    @Test
    public void newHeroObjectIsCorrectlyCreated_true() throws Exception {
        Hero hero = setUpNewHero();
        assertEquals(true, hero instanceof Hero);

    }

    @Test
    public void heroInstantiatesWithHeroWeakness_String() throws Exception {
        Hero hero = setUpNewHero();
        assertEquals("Alcohol",hero.getWeakness());
    }
    @Test
    public void HeroInstantiateWithAge_Int () throws Exception {
        Hero hero = setUpNewHero();
        assertEquals(25,hero.getAge());
    }

    @Test
    public void HeroInstantiateWithName_String() throws Exception {
        Hero hero = setUpNewHero();
        assertEquals("Flash",hero.getName());
    }
}