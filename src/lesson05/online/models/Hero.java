package lesson05.online.models;

public abstract class Hero {

    protected String name;
    protected int hp;
    protected int mp;
    protected int atk;


    public Hero(String name, int hp, int mp, int atk) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
        this.atk = atk;
    }

    public void attack(){
        System.out.println(name + " Has Attack " + atk);
    }
    public void block(){
        System.out.println(name + " Has blocked");
    }
    abstract protected void heal(int hp);

//    public void heal(int hp){
//        System.out.println(name + " up hp to " + hp);
//    }
}
