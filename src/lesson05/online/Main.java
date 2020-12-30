package lesson05.online;

import lesson05.online.heros.Archer;
import lesson05.online.heros.Druid;
import lesson05.online.heros.Paladin;
import lesson05.online.heros.Titan;
import lesson05.online.models.Hero;

public class Main {
    public static void main(String[] args) {
//        int i =100;
//        byte b = (byte) i;

        Archer archer = new Archer("Archer",100,20,15);
        Paladin paladin = new Paladin("Paladin", 150,50,50);
        Druid druid = new Druid ("Druid",75,150,40);

        Paladin paladinDex = new Paladin("PaladinDex", 200,100,100,100);
        Titan titan = new Titan("Titan",200,100,300,200);

        //Hero hero = new Hero("Our hero",50,50,50);

        Hero[] attackGroup = {archer, paladin, druid, paladinDex, titan};
//        for (int i = 0; i < attackGroup.length; i++) {
//            attackGroup[i].attack();
//            attackGroup[i].block();
//            if(attackGroup[i] instanceof Titan) {
////                Titan titan1 = (Titan) attackGroup[i];
////                titan1.bigAttack();
//                ((Titan)attackGroup[i]).bigAttack();
//            }
//        }

//        archer.attack();
//        paladin.attack();
//        druid.attack();
//        paladinDex.attack();
//        titan.bigAttack();
//        druid.block();
//        titan.block();
//
//        archer.heal(15);
//        paladin.heal(20);
        int a = 5;
        String str = "Hello";
        str.length();

//        String[] arrStr = new String[2];
//        arrStr[0] = a;

        Object[] arr = new Object[3];
        arr[0] = a;
        arr[1] = str;
        arr[2] = archer;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof String) {
                System.out.println(((String) arr[i]).length());
            }
        }


    }
}
