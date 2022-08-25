package rpgtdd;

public class Character {
    public String name = "";
    public int life = 0;
    public int mp = 0;
    public State state = State.Attaque;

    //region Get/Set
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

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    //endregion

    public Character(int life, String name){
        this.life = life;
    }

    public void hit(int damages){
        if(state == State.Defense)
            this.life -= damages / 2;
        else
            this.life -= damages;
    }

    public boolean isAlive(){
        if(life > 0)
            return true;
        else
            return false;
    }

    public String display(){
        return name+" : "+life+"PV";
    }
}
