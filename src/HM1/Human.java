package HM1;

import javax.swing.*;

public class Human implements Action {
    private String name;
    private int jumpHeight;
    private int runDistance;

    public Human(String name, int jumpHeight, int runDistance){
        this.name = name;
        this.jumpHeight = runDistance;
        this.runDistance = jumpHeight;
    }

    @Override
    public void jump(){
        System.out.println("Human " + this.name + " прыгает " +  this.getJumpHeight());
    }

    @Override
    public void run (){
        System.out.println("Human " + this.name + " бежит " + this.getRunDistance());
    }

    @Override
    public int getRunDistance(){
        return this.runDistance;
    }

    @Override
    public int getJumpHeight(){
        return this.jumpHeight;
    }
}
