package rpgtdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CharacterTest {
    @Test
    public void TestHit(){
        Character character = new Character(10, "test");

        character.hit(5);

        assertTrue(character.isAlive());
    }

    @Test
    public void TestHitWithDeath(){
        Character character = new Character(10, "test");

        character.hit(10);

        assertFalse(character.isAlive());
    }

    @Test
    public void TestTwoHit(){
        Character character = new Character(10, "test");

        character.hit(5);
        character.hit(4);

        assertTrue(character.isAlive());
    }
    @Test
    public void TestTwoHitWithDeath(){
        Character character = new Character(10, "test");

        character.hit(5);
        character.hit(5);

        assertFalse(character.isAlive());
    }

    public void TestHitDefense(){
        Character character = new Character(10, "toto");

        character.setState(State.Defense);
        character.hit(10);

        assertTrue(character.isAlive());
    }
}
