package lesson05.homeWork05.animals;

import lesson05.homeWork05.Animal;

public class Cat extends Animal {

    public Cat(String type, String name, float runLim, float swimLim, float jumpLim){
        super("cat", name, runLim, swimLim, jumpLim);
    }

    @Override
    protected int swim(float distance) {
        return Animal.CANT_SWIM;
    }

    //    @Override
//    public void swim() {
//        System.out.println("The " +  type + " " + name + " " + "can't swim, he was saved");
//
//    }

}
