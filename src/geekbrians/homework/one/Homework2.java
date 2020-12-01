package geekbrians.homework.one;

public class Homework2 {

    public static class Main {
        //Задание 1
        public static void main(String[] args) {

            int[] arr = {1, 0, 1, 0, 0, 1, 1, 0, 0, 1};
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] == 1 ? 0 : 1;
                System.out.print(arr[i] + "");
            }
            //Задание 2
            System.out.println("\r\n2 - задание");
            int[] arr2 = new int[8];
            for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
            for (int x : arr2) System.out.print(x + " ");

            //Задание 3
            System.out.println("\r\n3 - Задание");
            int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] < 6) arr3[i] *= 2;
                System.out.println(arr3[i] + "");
            }

            //Задание 4
            System.out.println("\r\n4.");
            int[][] arr4 = new int[8][8];
            for (int i = 0; i < arr4.length; i++) {
                for (int j = 0, j2 = arr4[i].length; j < arr4[i].length; j++, j2--) {
                    if (i == j || i == (j2 - 1)) arr4[i][j] = 1;
                    System.out.print(arr4[i][j] + " ");
                }
                System.out.print("\r\n");
            }
        }
    }
}