package lesson05.homeWork05;

import lesson05.homeWork05.animals.Bird;
import lesson05.homeWork05.animals.Cat;
import lesson05.homeWork05.animals.Dog;
import lesson05.homeWork05.animals.Horse;


public class Main {

    static String nameString;
    static String eventName;
    static String eventResult;

    private static void run(Animal animal, float distance){

    }

    public static void main(String[] args) {
        Dog dog = new Dog("dog","Wick",500,10,0.5f);
        Cat cat = new Cat("Cat","Marvel",200,1,2);
        Horse horse = new Horse("Horse", "Spirit",1500,100,3);
        Bird bird = new Bird("Bird", "Angry",5,1,0.2f);

        Animal[] animals = {dog, cat, horse, bird};
        float doRun = 400;
        float doSwim = 9;
        float doJump = 2.5f;

        for (int i = 0; i < animals.length; i++) {
            nameString = animals[i].getType() + " " + animals[i].getName() + " may: ";

            eventName = String.format("run %.2f m. Trying to run ", animals[i].getRunLim());
            eventResult = animals[i].run(doRun) ? " it worked" : " it didn't work";
            System.out.println(nameString + eventName + doRun + " m and" + eventResult);

            int swimResult = animals[i].swim(doSwim);
            eventName = String.format("swim %.2f m. Trying to swim ", animals[i].getSwimLim());
            eventResult = (swimResult == Animal.SWIM_YES) ? " it worked" : " it didn't work";
            if (swimResult == Animal.CANT_SWIM)
                eventResult = " it didn't work, because he can't swim";
            System.out.println(nameString + eventName + doSwim + " m and" + eventResult);

            eventName = String.format("jump %.2f m. Trying to jump ", animals[i].getJumpLim());
            eventResult = animals[i].jump(doJump) ? " it worked" : " it didn't work";
            System.out.println(nameString + eventName + doJump + " m and" + eventResult);

            System.out.println();
        }

//        for (int i = 0; i < animals.length; i++) {
//            animals[i].run();
//            animals[i].jump();
//            animals[i].swim();
//            System.out.println();
//        }

    }
}
