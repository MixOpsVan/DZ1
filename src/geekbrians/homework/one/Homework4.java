package geekbrians.homework.one;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    private static final char[][] map = new char[SIZE][SIZE];


    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        intializeGame();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkEndGame(DOT_X)){
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw");
                break;
            }

            computerTurn();
            printMap();
            if (checkEndGame(DOT_O)){
                break;
            }
        }

    }

    private static boolean checkEndGame(char symbol) {
        if (checkWin(symbol)) {
            System.out.println(isHumanTurn(symbol) ? "Human Win!" : "Computer Win!");
            return true;
        }
        if (isMapFull()) {
            System.out.println("Draw");
            return true;
        }
        return false;
    }

    public static boolean isMapFull () {
        for (char[] row : map) {
            for (char cellvalue : row) {
                if (cellvalue == DOT_EMPTY) {
                    return false;
                }

            }

        }

        return true;
    }

    private static boolean checkWin(char symbol){
        if (checkRowsAndCols(symbol)) return true;
        return checkDiagonal(symbol);
    }

    public static boolean checkDiagonal(char symbol){
        int mainDiagCounter = 0;
        int sideDiagCounter = 0;
        for (int i = 0; i < SIZE; i++) {
            mainDiagCounter = (map[i][i] == symbol) ? mainDiagCounter + 1 : 0;
            sideDiagCounter = (map[i][map.length - 1 - i] == symbol) ? sideDiagCounter + 1 : 0;
            if (mainDiagCounter == DOTS_TO_WIN || sideDiagCounter == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkRowsAndCols(char symbol){
        for (int i = 0; i < SIZE; i++) {
            int rowCounter = 0;
            int colCounter = 0;
            for (int j = 0; j < SIZE; j++) {
                rowCounter = (map [i][j] == symbol) ? rowCounter + 1 : 0;
                colCounter = (map [j][i] == symbol) ? colCounter + 1 : 0;
                if (rowCounter == DOTS_TO_WIN || colCounter == DOTS_TO_WIN){
                    return true;
                }

            }
        }
        return false;
    }

    private static void humanTurn() {
        int rowIndex;
        int colIndex;
        do {

            System.out.print("Введите номер строки: ");
            rowIndex = SCANNER.nextInt() - 1;

            System.out.print("Введите номер столбца: ");
            colIndex = SCANNER.nextInt() - 1;
        } while (!isCellValid(rowIndex, colIndex, DOT_X));

        map [rowIndex][colIndex] = DOT_X;
    }

    private static void computerTurn() {
        int rowIndex ;
        int colIndex ;
        Random rand = new Random();
        do {
           rowIndex = rand.nextInt(SIZE);
           colIndex = rand.nextInt(SIZE);
        } while (!isCellValid(rowIndex, colIndex, DOT_O));

        map [rowIndex][colIndex] = DOT_O;
    }

    private static boolean isCellValid(int rowIndex, int colIndex, char symbol) {
        if (!isArrayIndexValid(rowIndex) | !isArrayIndexValid(colIndex)){
            if (isHumanTurn(symbol)) {
                System.out.println("Индексы строки и колонки должны быть от 0 до " + SIZE);
            }
            return false;
        }
        if (map[rowIndex][colIndex] != DOT_EMPTY){
            if (isHumanTurn(symbol)) {
                System.out.println("Ячейка занята");
            }
            return false;
        }

        return true;
    }

    private static boolean isHumanTurn(char symbol) {
        return symbol == DOT_X;
    }

    private static boolean isArrayIndexValid(int index) {
        return index >= 0 && index < SIZE;
    }

    private static void printMap() {
        printHeader();
        printMapState();
        System.out.println();
    }

    private static void printMapState() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            System.out.print((rowIndex+1) + " ");

            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                System.out.print(map [rowIndex][colIndex]+ " ");
            }
            System.out.println();
        }
    }

    private static void printHeader() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void intializeGame() {
        for (int rowIndex = 0; rowIndex < SIZE; rowIndex++) {
            for (int colIndex = 0; colIndex < SIZE; colIndex++) {
                map [rowIndex][colIndex] = DOT_EMPTY;
            }
        }
    }

}
