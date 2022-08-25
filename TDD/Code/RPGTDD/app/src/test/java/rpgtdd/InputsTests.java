package rpgtdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;
import org.mockito.Mockito;

public class InputsTests {
    @Test
    public void testAttack(){
        Scanner scanner = Mockito.mock(Scanner.class);

        Mockito.when(scanner.next()).thenReturn("1");

        Character character = Mockito.mock(Character.class);

        Inputs inputs = new Inputs(scanner, character);
        inputs.processNextInput();

        Mockito.verify(character, Mockito.never()).display();
        Mockito.verify(character, Mockito.times(1)).hit(2);
    }

    @Test
    public void testDisplay(){
        Scanner scanner = Mockito.mock(Scanner.class);

        Mockito.when(scanner.next()).thenReturn("2");

        Character character = Mockito.mock(Character.class);

        Inputs inputs = new Inputs(scanner, character);
        inputs.processNextInput();

        Mockito.verify(character, Mockito.never()).hit(2);
        Mockito.verify(character, Mockito.times(1)).display();
    }
}
