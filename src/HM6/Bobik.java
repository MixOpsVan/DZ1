package HM6;

public class Bobik extends Animal{
    private int _lenghtSwim;
    private int maxLenght;

    Bobik(){
        maxLenght = Math.random() > 0.5 ? 200 : 500;
    }
    int getMaxLenght(){
        return maxLenght;
    }
    void swim(int lenght){
        boolean result = lenght <= 10;
        if (result) _lenghtSwim = lenght;
        showResult(this,result);
    }

    @Override
    void run(int lenght) {
        boolean result = lenght <= maxLenght;
        if (result) _lenght = lenght;
        showResult(this,result);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 0.5;
        if (result) _height = height;
        showResult(this,result);


    }
}
