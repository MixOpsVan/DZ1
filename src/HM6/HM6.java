package HM6;

public class HM6 {
    public static void main(String[] args) {



        Bobik dog = new Bobik();
        Animal cat = new Cat();

        dog.run(500);
        cat.run(200);
        dog.jump(0.2);
        cat.jump(2);

        dog.swim(5);

    }
}
