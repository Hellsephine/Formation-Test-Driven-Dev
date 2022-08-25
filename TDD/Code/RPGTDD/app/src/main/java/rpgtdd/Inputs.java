package rpgtdd;

import java.util.Scanner;

public class Inputs {
    Scanner scanner;
    Character character;
    public Inputs(Scanner scanner, Character character){
        this.scanner = scanner;
        this.character = character;
    }

    public void processNextInput(){
        String str = scanner.next();
        
        if(str.equals("1"))
            character.hit(2);
        else if(str.equals("2"))
            System.out.println(character.display());
    }
}
