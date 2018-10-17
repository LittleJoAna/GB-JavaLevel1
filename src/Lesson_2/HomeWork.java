package Lesson_2;

import java.util.Arrays;

public class HomeWork {
    /*
7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен циклически сместить все элементы массива на n позиций.
8 **** Не пользоваться вспомогательным массивом при решении задачи 7. */
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int[] arrTask1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arrTask1));
        replacingZeroWithOne(arrTask1);
        System.out.println(Arrays.toString(arrTask1) + "\n");

        System.out.println("Задание №2");
        int[] arrTask2 = new int[8];
        System.out.println(Arrays.toString(arrTask2));
        fillingArray(arrTask2);
        System.out.println(Arrays.toString(arrTask2)  + "\n");

        System.out.println("Задание №3");
        int[] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrTask3));
        numbersLessThanSixAreDoubled(arrTask3);
        System.out.println(Arrays.toString(arrTask3)  + "\n");

        System.out.println("Задание №4");
        System.out.println(Arrays.toString(arrTask3)  +
                "\nМинимальный элемент массива - " + minElementOfTheArray(arrTask3) +
                "\nМаксимальный элемент массива - " + maxElementOfTheArray(arrTask3) + "\n");

        System.out.println("Задание №5");
        int[][] arrTask5 = new int[6][6];
        printingATwoDimensionalArray(arrTask5);
        fillingDiaganal(arrTask5);
        printingATwoDimensionalArray(arrTask5);

        System.out.println("Задание №6");
        int[] arrTask6 = {1, 1, 1, 2, 1}; //true
        int[] arrTask6_1 = {2, 1, 1, 2, 1}; //false
        int[] arrTask6_2 = {10, 1, 2, 3, 4}; //true
        System.out.println(Arrays.toString(arrTask6));
        System.out.println(checkBalance(arrTask6));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_1));
        System.out.println(checkBalance(arrTask6_1));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_2));
        System.out.println(checkBalance(arrTask6_2));
        System.out.println();

        System.out.println("Задание №7");
        /*int[] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrTask3));
        numbersLessThanSixAreDoubled(arrTask3);
        System.out.println(Arrays.toString(arrTask3)  + "\n");

        System.out.println("Задание №8");
        int[] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrTask3));
        numbersLessThanSixAreDoubled(arrTask3);
        System.out.println(Arrays.toString(arrTask3)  + "\n");*/
    }
    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    public static void replacingZeroWithOne (int [] arr) {
        /* программа идет по массиву с помощью цикла for, перебирая все его элементы,
        при нахождении элемента равного 0 заменяет его значение на 1, во всех остальных случаях
        заменяет значение элемента массива на 0
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
    }

    /*
    2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями
1 4 7 10 13 16 19 22;
     */
    public static void fillingArray (int[] arr) {
        /*
        программа проходит по массиву с помощью цикла и заполняет элементы массива значениями, вычисляемыми с помощью формулы
         */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i * 3) + 1;
        }
    }
    /*
    3 Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ], написать метод, принимающий на вход массив и умножающий
числа меньше 6 на 2;
     */
    public static void numbersLessThanSixAreDoubled (int[] arr) {
        /*
        программа перебивает элементы массива с помощью цикла и принахождении элемента меньше 6 удваивает его значение
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    /*
    4 Задать одномерный массив. Написать методы поиска в нём минимального и максимального элемента;
     */
    public static int minElementOfTheArray (int[] arr) {
        /*
        программа перебирает элементы массива и сравнивает их между собой. при нахождении элемента меньше чем значение
        специально созданной для этого переменной, которой в самом начале присуждается значение первого элемента массива,
        программа заменяет значение переменной на значение меньшего элемента, после прохождения всего массива, программа
        возвращает значение переменной
         */
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int maxElementOfTheArray (int[] arr) {
        /*
        программа перебирает элементы массива и сравнивает их между собой. при нахождении элемента больше чем значение
        специально созданной для этого переменной, которой в самом начале присуждается значение первого элемента массива,
        программа заменяет значение переменной на значение большего элемента, после прохождения всего массива, программа
        возвращает значение переменной
         */
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    5 * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), заполнить его диагональные
элементы единицами, используя цикл(ы);
     */
    public static void fillingDiaganal (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            //внешний цикл заполняет главную диагональ по направлению слева/сверху - справа/вниз
            arr[i][i] = 1;
            for (int j = arr.length - 1; j < arr[i].length; j++) {
                //внутренний цикл заполняет обратную диагональ по направлению справа/сверху - слева/вниз
                arr[i][j - i] = 1;
            }


        }
    }

    public static void printingATwoDimensionalArray (int[][] arr) {
        /*
        метод распечатывает в консоль двумерный заданный массив
         */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
    6 ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true если в
    массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([1, 1, 1, || 2, 1]) → true,
    checkBalance ([2, 1, 1, 2, 1]) → false, checkBalance ([10, || 1, 2, 3, 4]) → true. Абстрактная граница показана символами ||,
    эти символы в массив не входят.
    */

    public static boolean checkBalance (int[] arr) {
        int leftBalance = arr[0], rightBalance = arr.length, count = arr.length;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j < arr.length; j++) {

            }

            /*if (leftBalance != rightBalance) {
            leftBalance += arr[i];
            rightBalance += arr.length - i;
            }*/
        }
        return false;
    }
}
