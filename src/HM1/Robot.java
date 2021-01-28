package HM1;

public class Robot implements Action {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot (String name, int runDistance, int jumpHeight){
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }


    @Override
    public void jump() {
        System.out.println("Robot " + this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public void run() {
        System.out.println("Robot " + this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
