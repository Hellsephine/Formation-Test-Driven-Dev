package testunitaire;

import java.util.Random;

public class Character{
    private String name = "";
    private int life = 0;
    private int def = 0;
    Random rand = new Random();

    //#region GETER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }
    //#endregion

    
    public Character(int life, String name, int def){
        this.life = life;
        this.def = def;
    }

    public void hit(int damage){
        life = life-damage;
    }

    public void fight(Character character){
        int damage;
        int d20 = rand.nextInt(20)+1;
        System.out.println(d20);
        if(d20 < character.def){
            damage = 0;
        }
        else{
            int d6 = rand.nextInt(6)+1;
            if (d20 == 20)
                damage = d6*2;
            else
                damage = d6;
        }
        System.out.println(damage);
        character.life -= damage;
    }

    public boolean isAlive(){
        if(life > 0){
            return true;
        }
        return false;
    }

    public String display(){
        return name+" ; "+life+"PV";
    }
}