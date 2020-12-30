package lesson05.online.heros;

import lesson05.online.heros.Paladin;

public class Titan extends Paladin {

    public Titan(String name, int hp, int mp, int atk, int dex) {
        super(name, hp, mp, atk, dex);
    }

    public void bigAttack(){
        System.out.println(name + " has big Attack");
    }

    @Override
    public void block() {
        super.block();
    }
    @Override
    public void heal(int hp){
        System.out.println(name + " don't heal self");
    }
}
