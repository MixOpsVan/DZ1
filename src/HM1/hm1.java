package HM1;

import java.util.Random;

public class hm1 {
    public static void main(String[] args) {

        Random rand = new Random();
        Action[] actions = new Action[3];

        int distance = rand.nextInt(10);
        int height = rand.nextInt(10);
        actions[0] = new Human("Misha", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[1] = new Robot("001111111", distance, height);

        distance = rand.nextInt(10);
        height = rand.nextInt(10);
        actions[2] = new Cat("Kyzia", distance, height);

        Barrier[] barriers = new Barrier[6];

        boolean isRoad;
        for (int i = 0; i < barriers.length; i++){
            distance = rand.nextInt(10);
            isRoad = rand.nextBoolean();
            if (isRoad){
                barriers[i] = new Road("Road " + i, distance);
            }else {
              barriers[i] = new Wall("Wall " + i, distance);
            }
        }

        for (int i = 0; i < actions.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result){
                    break;
                }

            }

            if (result) {
                System.out.println("Успешно");
            }else{
                System.out.println("Не успешно");
            }

        }
    }
}
