package lesson05.homeWork05;

public abstract class Animal {

    static final int SWIM_NO = 0;
    static final int SWIM_YES = 1;
    protected static final int CANT_SWIM = -1;


    private String type;
    private String name;
    private float runLim;
    private float swimLim;
    private float jumpLim;

   public Animal(String type, String name, float runLim, float swimLim, float jumpLim){
       this.type = type;
       this.name = name;
       this.runLim = runLim;
       this.swimLim = swimLim;
       this.jumpLim = jumpLim;
   }


    String getType() {
        return this.type;
    }
    String getName() {
        return this.name;
    }

    float getRunLim() {
        return this.runLim;
    }

    float getSwimLim() {
        return this.swimLim;
    }

    float getJumpLim() {
        return this.jumpLim;
    }


    protected boolean run(float distance) {
        return (distance <= runLim);
    }

    protected int swim(float distance) {
        return (distance <= swimLim) ? SWIM_YES : SWIM_NO;
    }

    protected boolean jump(float height) {
        return (height <= jumpLim);
    }

//    public Animal(String type, String name, float runLim, float jumpLim) {
//        this.type = type;
//        this.name = name;
//        this.runLim = runLim;
//        this.jumpLim = jumpLim;
//   }
//
//    protected void run() {
//        System.out.println("The " +  type + " " + name + " " + "ran " + runLim + " m");
//    }
//
//    protected void jump() {
//        System.out.println("The " +  type + " " + name + " " + "jumped " + jumpLim + " m");
//    }
//
//    protected abstract void swim();

}
