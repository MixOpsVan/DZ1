package HM1;

public class Road extends Barrier {
    private int lenght;

    public Road(String name, int lenght){
        super(name);

        this.lenght = lenght;
    }

    public int getLenght(){
        return lenght;
    }

    @Override
    protected boolean moving(Action action) {
        System.out.println("The Road " + super.getName() + " lenght: " + this.lenght);
        action.run();

        if (getLenght() <= action.getRunDistance()){
            System.out.println("run success");

            return true;
        }else {
            System.out.println("run unsuccessfully");

            return false;
        }
    }
}
