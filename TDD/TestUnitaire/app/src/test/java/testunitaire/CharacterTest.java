package testunitaire;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class CharacterTest {

    @Test
    public void TestHit(){
        Character character = new Character(10, "Paul",0);

        character.hit(5);

        Assertions.assertTrue(character.isAlive());
    }
    
    @Test
    public void TestHitWithDeath(){
        Character character = new Character(10, "Paul",0);

        character.hit(10);

        Assertions.assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoHitWithDeath(){
        Character character = new Character(10,"Paul",0);

        character.hit(5);
        character.hit(5);

        Assertions.assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoHitWithNoDeath(){
        Character character = new Character(10, "Paul",0);

        character.hit(4);
        character.hit(5);

        Assertions.assertTrue(character.isAlive());
    }

    @Test
    public void TestOfFighting(){
        Character character1 = new Character(10, "Paul", 10);
        Character character2 = new Character(3, "Jacque", 10);
        Random rand = Mockito.mock(Random.class);

        character1.setRand(rand);

        Mockito.when(rand.nextInt(20)).thenReturn(20);
        Mockito.when(rand.nextInt(6)).thenReturn(6);

        character1.fight(character2);

        Assertions.assertFalse(character2.isAlive());
    }
}
