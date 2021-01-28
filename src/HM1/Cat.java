package HM1;

public class Cat implements Action  {
    private String name;
    private  int runDistance;
    private  int jumpHeingt;

    public Cat (String name, int runDistance, int jumpHeingt){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeingt = jumpHeingt;
    }

    @Override
    public void run (){
        System.out.println("Cat " + this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public void jump (){
        System.out.println("Cat " + this.name + " прыгает " + this.getJumpHeight());
    }

    @Override
    public int getRunDistance(){
        return this.runDistance;
    }

    @Override
    public int getJumpHeight(){
        return this.jumpHeingt;
    }
}
