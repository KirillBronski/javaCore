package lesson05.online.heros;

import lesson05.online.models.Hero;

public class Archer extends Hero {

//    private String name;
//    private int hp;
//    private int mp;
//    private int atk;

    public Archer(String name, int hp, int mp, int atk) {
//        this.name = name;
//        this.hp = hp;
//        this.mp = mp;
//        this.atk = atk;
        super(name, hp, mp, atk);
    }

    @Override
    public void heal(int hp){
        System.out.println(name + " has heal self to " + hp);
    }

//    void attack(){
//        System.out.println(name + " Has Attack " + atk);
//    }
//    void block(){
//        System.out.println(name + " Has blocked");
//    }
}
