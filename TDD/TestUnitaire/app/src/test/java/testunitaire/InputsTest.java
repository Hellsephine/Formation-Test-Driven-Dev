package testunitaire;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import org.mockito.Mockito;

public class InputsTest {

    @Test
    public void testAttack(){
        // Create a fake scanner
        Scanner scan = Mockito.mock(Scanner.class);
        // That will return "1" when next() is called
        Mockito.when(scan.next()).thenReturn("1");

        // Create a fake character
        Character character = Mockito.mock(Character.class);
        
        // The true Test code
        Inputs inputs = new Inputs(scan, character);
        inputs.processNextInput();

        // Check that the character took 2 damage
        Mockito.verify(character, Mockito.never()).display();
        Mockito.verify(character, Mockito.times(1)).hit(2);
    }

    @Test
    public void testDisplay(){

        Scanner scan = Mockito.mock(Scanner.class);

        Mockito.when(scan.next()).thenReturn("2");

        Character character = Mockito.mock(Character.class);

        Inputs inputs = new Inputs(scan, character);
        inputs.processNextInput();

        Mockito.verify(character, Mockito.never()).hit(2);
        Mockito.verify(character, Mockito.times(1)).display();
    }
}