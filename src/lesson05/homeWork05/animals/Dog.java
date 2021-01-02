package lesson05.homeWork05.animals;

import lesson05.homeWork05.Animal;

public class Dog extends Animal {

    public Dog(String type, String name, float runLim, float swimLim, float jumpLim){
        super("dog", name, runLim, swimLim, jumpLim);
    }

//    @Override
//    public void swim() {
//        System.out.println("The " +  type + " " + name + " " + "swam " + swimLim + " m");
//    }
}
