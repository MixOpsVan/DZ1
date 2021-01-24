package HM6;

public class Cat extends Animal{
    @Override
    void run(int lenght) {
        boolean result = lenght <= 200;
        if (result) _lenght = lenght;
        showResult(this, result);
    }

    @Override
    void jump(double height) {
        boolean result = height <= 2;
        if (result) _height = height;
        showResult(this,result);
    }
}
