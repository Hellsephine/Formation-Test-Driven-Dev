package testunitaire;

import java.util.Scanner;

public class Inputs {
    Scanner scan;
    Character character;
    public Inputs(Scanner scan, Character character){
        this.scan = scan;
        this.character = character;
    }

    public void processNextInput(){
        String str = scan.next();

        if(str.equals("1"))
            character.hit(2);
        else if(str.equals("2"))
            System.out.println(character.display());
    }
}
