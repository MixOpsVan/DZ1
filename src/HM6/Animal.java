package HM6;

abstract class Animal {
    protected int _lenght;
    protected double _height;

    abstract void run (int lenght);
    abstract void jump (double height);

    static void showResult (Object obj, boolean result){
        System.out.println(obj.getClass().getName() + " : " + result);
    }
}
