package geekbrians.homework.one;

public class Homework3 {

/*
    2.Создать переменные типов: byte, short, int, long, float, double, char, boolean;
 */

/*
    3.
*/

    private static int calculate(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

/*
    4.
*/

    private static boolean task10and20(int x, int y) {
        int sum = x + y;
        return sum >= 10 && sum <= 20;
    }

/*
    5.
*/

    private static boolean positiveOrNegative(int num) {
        return num >= 0;
    }

/*
    6.
*/

    private static boolean isNegative(int number) {
        return number < 0;
    }

/*
    7.
*/

    private static String Hello(String name) {
        return "Привет, " + name;
    }

    /*
        8.
    */
    private static boolean isLeapYearBool(int x) {
        return x % 4 == 0 && x % 100 != 0 || x % 400 == 0;
    }

    public static void main(String[] args) {

/*
    2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
*/

        System.out.println("Задание 2.\n");

        byte b1 = -12;
        short s1 = 85;
        int i1 = 2020;
        long l1 = 5555555556L;
        float pi1 = 23.598f;
        double pi2 = 3.14;
        char c1 = '2';

        String strHello = "Hello, World!";

        System.out.println("Значение инициализированных переменных:");
        System.out.println("byte b1 = " + b1 + ";\n" + "short s1 = " + s1 + ";");
        System.out.println("int i1 = " + i1 + ";\n" + "long l1 = " + l1 + ";\n");
        System.out.println("float pi1 = " + pi1 + ";\n" + "double pi2 = " + pi2 + ";\n");
        System.out.println("char c1 = \'" + c1 + "\';\n" +  "String str1 = \"" + strHello + "\";\n");

        // Задание 3
        System.out.println("Задание 3.\n");

        int a = 10;
        int b = 25;
        int c = 40;
        int d = 4;
        System.out.println("Значения инициализированных переменных:");
        System.out.println("a = " + a + ";" + "\tb = " + b + ";" + "\tc = " + c + ";" + "\td = " + d + ";");
        System.out.println("Результат вычисления выражения: a * (b + (c / d)) = " + calculate(a, b, c, d) + ".\n");

        // Задание 4
        System.out.println("Задание 4.\n");

        int x = 10;
        int y = 16;
        System.out.println("Значения инициализированных переменных:");
        System.out.println("x = " + x + "; " + "y = " + y + ";");
        System.out.printf("Сумма заданных значений равна %d. ", x + y);
        System.out.printf("Метод возвращает значение %s.\n\n", task10and20(x, y));

        // Задание 5
        System.out.println("Задание 5.\n");

        int num = 3;
        System.out.printf("Значение переменной = %d. ", num);
        System.out.printf("Число %s.\n\n", positiveOrNegative(num) ? "положительное" : "отрицательное");

        // Задание 6
        System.out.println("Задание 6.\n");

        int number = -17;
        System.out.printf("Значение переменной = %d. Метод возвращает значение %s.\n\n", number, isNegative(number));

        // Задание 7
        System.out.println("Задание 7.\n");

        String name = "Alexey ";
        System.out.println(Hello(name) + "!\n");

        // Задание 8
        System.out.println("Задание 8.\n");

        System.out.println("Решение. В високосном году 366 дней, т.е. он делится на 4 без остатка. \n" +
                "Однако, по условию, необходимо проверить не делится ли без остатка год на 100.\n" +
                "Если да, то это очередное столетие и его надо проверить на делимость на 400 без остатка.\n" +
                "Если остаток от деления есть, то год является невисокосным. Например, 2300 год хоть и\n" +
                "делится на 4 без остатка, но при делении на 400 получается остаток. Значит год невисокосный.\n");

        int x1 = 2016;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x1, (isLeapYearBool(x1)) ? "\b" : "не");
        int x2 = 2029;
        System.out.printf("Задан %d год. Он %s является високосным.\n", x2, (isLeapYearBool(x2)) ? "\b" : "не");
    }
}



