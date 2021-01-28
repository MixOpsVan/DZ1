package HM1;

public class Wall extends Barrier {
    private int height;

    public Wall (String name, int height){
        super(name);

        this.height = height;
    }
    public int getHeight (){
        return height;
    }

    @Override
    protected boolean moving(Action action) {
        System.out.println("The Wall " + super.getName() + "height: " + this.height);

        action.jump();

        if (getHeight() <= action.getJumpHeight()){
            System.out.println("jump success");

            return true;
        }else {
            System.out.println("jump unsuccessfully");

            return false;
        }
    }
}
