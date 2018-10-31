package TicTacToe;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class GameClass {
    /*
    Полностью разобраться с кодом;
Переделать проверку победы, чтобы она не была реализована просто набором условий.
* Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4.
*** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока, и пытаться выиграть сам.
     */
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = 'O';
    private static final char DOT_EMPTY = '.';
    private static int fieldSizeY;
    private static int fieldSizeX;
    private static int lineLengthForWin;
    private static int coordinateX;
    private static int coordinateY;
    private static char[][] field;

    private static void initMap() {
        fieldSizeX = 5;
        fieldSizeY = 5;
        lineLengthForWin = 3;
        field = new char[fieldSizeY][fieldSizeX];
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                field[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.println("-------");
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print("|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("-------");
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y (от 1 до " + fieldSizeX + ") через пробел >>>");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidCell(x, y) || !isEmptyCell(x, y));
//        System.out.println("игрок " + y + " " + x);
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isValidCell(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isEmptyCell(int x, int y) {
        return field[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x, y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);

        } while (!isEmptyCell(x, y));
//        System.out.println("компьютер " + y + " " + x);
        field[y][x] = DOT_AI;
    }

    private static boolean checkCoordinate(char c) {
        int countGorizontal = 0, countVertical = 0, countDiagonalDown = 0, countDiagonalUp = 0;
        int a = field.length - 1;
        for (int i = coordinateX, j = coordinateY, n = 0; j <= a && n < lineLengthForWin; j++, n++) { //проверка горизонтали
            if (field[i][j] == c) {
                countGorizontal++;
            }
            if (countGorizontal == lineLengthForWin) {
                return true;
            }

        }
        for (int i = coordinateX, j = coordinateY, n = 0; i <= a && n < lineLengthForWin; i++, n++) { //проверка вертикали
            if (field[i][j] == c) {
                countVertical++;
            }
            if (countVertical == lineLengthForWin) {
                return true;
            }

        }
        for (int i = coordinateX, j = coordinateY, n = 0; (j <= a && i >= 0) && n < lineLengthForWin; i--, j++, n++) { //проверка диагонали
            if (field[i][j] == c) {
                countDiagonalUp++;
            }
            if (countDiagonalUp == lineLengthForWin) {
                return true;
            }

        }
        for (int i = coordinateX, j = coordinateY, n = 0; (i <= a && j <= a) && n < lineLengthForWin; i++, j++, n++) { //проверка диагонали

            if (field[i][j] == c) {
                countDiagonalDown++;
            }
            if (countDiagonalDown == lineLengthForWin) {
                return true;
            }

        }

        return false;
    }

    private static boolean checkWin(char c) {
        for (int i = 0; i < field.length; i++) { //цикл для поиска первой поставленной точки на поле
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == c) {
                    coordinateX = i;
                    coordinateY = j;
                    if (checkCoordinate(c)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean isMapFull() {
        for (int i = 0; i < fieldSizeY; i++) {
            for (int j = 0; j < fieldSizeX; j++) {
                if (field[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();

        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_HUMAN)) {
                System.out.println("Выиграл игрок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_AI)) {
                System.out.println("Выиграл компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        SCANNER.close();

    }
}
