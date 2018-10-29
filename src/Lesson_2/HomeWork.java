package Lesson_2;

import java.util.Arrays;

public class HomeWork {
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
        System.out.println(Arrays.toString(arrTask2) + "\n");

        System.out.println("Задание №3");
        int[] arrTask3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arrTask3));
        numbersLessThanSixAreDoubled(arrTask3);
        System.out.println(Arrays.toString(arrTask3) + "\n");

        System.out.println("Задание №4");
        System.out.println(Arrays.toString(arrTask3) +
                "\nМинимальный элемент массива - " + minElementOfTheArray(arrTask3) +
                "\nМаксимальный элемент массива - " + maxElementOfTheArray(arrTask3) + "\n");

        System.out.println("Задание №5");
        int[][] arrTask5 = new int[6][6];
        printingATwoDimensionalArray(arrTask5);
        fillingDiaganal(arrTask5);
        printingATwoDimensionalArray(arrTask5);

        System.out.println("Задание №6. Решение 1");
        int[] arrTask6 = {1, 1, 1, 2, 1}; //true
        int[] arrTask6_1 = {2, 1, 1, 2, 1}; //false
        int[] arrTask6_2 = {10, 1, 2, 3, 4}; //true
        int[] arrTask6_3 = {2, 1, 5};
        System.out.println(Arrays.toString(arrTask6));
        System.out.println(checkBalance_part1(arrTask6));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_1));
        System.out.println(checkBalance_part1(arrTask6_1));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_2));
        System.out.println(checkBalance_part1(arrTask6_2));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_3));
        System.out.println(checkBalance_part1(arrTask6_3));
        System.out.println();

        System.out.println("Задание №6. Решение 2");
        System.out.println(Arrays.toString(arrTask6));
        System.out.println(checkBalance_part2(arrTask6));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_1));
        System.out.println(checkBalance_part2(arrTask6_1));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_2));
        System.out.println(checkBalance_part2(arrTask6_2));
        System.out.println();
        System.out.println(Arrays.toString(arrTask6_3));
        System.out.println(checkBalance_part2(arrTask6_3));
        System.out.println();

        System.out.println("Задание №7");
        int[] arrTask7 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrTask7_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n1 = 2;
        int n2 = -2;
        System.out.println(Arrays.toString(arrTask7) + " заданное число сдвига " + n1);
        moveArrayElementsTask7(arrTask7, n1);
        System.out.println(Arrays.toString(arrTask7));
        System.out.println(Arrays.toString(arrTask7_1) + " заданное число сдвига " + n2);
        moveArrayElementsTask7(arrTask7_1, n2);
        System.out.println(Arrays.toString(arrTask7_1)  + "\n");

        System.out.println("Задание №8");
        int[] arrTask8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrTask8_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n3 = 47, n4 = -7;
        System.out.println(Arrays.toString(arrTask8) + " заданное число сдвига " + n3);
        moveArrayElementsTask8(arrTask8, n3);
        System.out.println(Arrays.toString(arrTask8));
        System.out.println(Arrays.toString(arrTask8_1) + " заданное число сдвига " + n4);
        moveArrayElementsTask8(arrTask8_1, n4);
        System.out.println(Arrays.toString(arrTask8_1));
        System.out.println("\nДомашнее задание закончено!");
    }

    /*
    1 Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
     */
    public static void replacingZeroWithOne(int[] arr) {
        /* программа идет по массиву с помощью цикла for, перебирая все его элементы,
        при нахождении элемента равного 0 заменяет его значение на 1, во всех остальных случаях
        заменяет значение элемента массива на 0
         */
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    /*
    2 Задать пустой целочисленный массив размером 8. Написать метод, который помощью цикла заполнит его значениями
1 4 7 10 13 16 19 22;
     */
    public static void fillingArray(int[] arr) {
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
    public static void numbersLessThanSixAreDoubled(int[] arr) {
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
    public static int minElementOfTheArray(int[] arr) {
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

    public static int maxElementOfTheArray(int[] arr) {
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
    public static void fillingDiaganal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            //внешний цикл заполняет главную диагональ по направлению слева/сверху - справа/вниз
            arr[i][i] = 1;
            for (int j = arr.length - 1; j < arr[i].length; j++) {
                //внутренний цикл заполняет обратную диагональ по направлению справа/сверху - слева/вниз
                arr[i][j - i] = 1;
            }


        }
    }

    public static void printingATwoDimensionalArray(int[][] arr) {
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

    public static boolean checkBalance_part1(int[] arr) {
        /*
        метод создает две переменные, в которые будет складывать правую и левую часть. в цикле берется первый элемент
        массива и записывается его значение в переменную "слева", далее входим во второй цикл и складываем значения всех
        остальных элементов массива, кроме первого и записываем это значение в переменную "справа", после этого сравниваем
        значения переменных, в случае если они равны - баланс найдем, возвращаем true. В случае, если значения не равны,
        обнуляем значение переменной "справа" и считаем далее, на этот раз прибавляя к первому элементу в переменной "слева"
        значение второго элемента, далее заходим во внутренний цикл и складываем там все элементы массива, за исключением
        двух тех, которые сложили в внешнем цикле, далее повторяется проверка на равно и так цикл крутится до тех пор пора
        не будет найден баланс, либо пока не закончится массив, в этом случае будет возвращено значение false
         */
        int leftBalance = 0, rightBalance = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            leftBalance += arr[i];
            for (int j = arr.length - 1; j > i; j--) {
                rightBalance += arr[j];
            }
            System.out.println(leftBalance + " == " + rightBalance);
            if (leftBalance == rightBalance) return true;
            else rightBalance = 0;

        }
        return false;
    }

    public static boolean checkBalance_part2(int[] arr) {
        /*
        метод создает переменную, в которую считает сумму всех элементов массива. если она не делится на 2 без остатка -
        значит баланса нет, возвращается false. Если сумма делится на 2 без остатка, тогда берется вторая переменная,
        к которой прибавляются последовательно значения элементов массива и сравниваются с общей суммой поделенной на 2,
        в случае, если найдено такое значение, которое равно сумме поледенной на 2, баланс найден и возвращается true,
        иначе возвращается false
        Алгоритм решения придумал Сергей Александров @sergei2018a
        */
        int sum = 0, balance = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if (sum % 2 != 0) return false;

        for (int i = 0; i < arr.length; i++) {
            balance += arr[i];
            if (balance == (sum / 2)) return true;
        }

        return false;
    }

    public static int formatN (int[] arr, int n) {
        /*
        метод создан для того, чтобы привести число N в упражнениях 7 и 8 к рабочему виду, в связи с тем, что данный код
        используется в этих 2 методах. Если число положительное и больше длинны массива - с помощью цикла из заданного
        числа вычитается длина массива, пока число не станет меньше или равно длине массива. если число отрицательное -
        к нему прибавляется длина массива до тех пор пока оно не станет положительным и в то же время меньше длины массива,
        после этого к длине массива прибавляется вычисленное число N. После всех вычислений число N возвращается в метод
         */
        if (n > 0) {
            while (!(n >= 0 && n <= arr.length)) {
                n -= arr.length;
            }

        } else if (n < 0) {
            while (n < arr.length * -1) {
                n += arr.length;
            }
            n = arr.length + n;
        }
        return n;
    }


    /*
    7 *** Написать метод, которому на вход подаётся одномерный массив и число n (может быть положительным, или отрицательным),
при этом метод должен циклически сместить все элементы массива на n позиций.
     */
    public static void moveArrayElementsTask7(int[] arr, int n) {
        /*
        метод получает на вход массив и число. Сначала метод создает второй массив, куда копирует данные из первого
        массива без изменений. Далее с помощью вспомогательного метода число N приводится к рабочему виду - меньше длины
        массива и больше 0. Метод переходит к циклу, в котором берет значения элементов и переносит их в конечный массив,
        в соответствии со сдвигом. При положительном числе - сдвигается влево, при отрицательном - вправо.
         */
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        n = formatN(arr, n);
        for (int i = 0, j = n; j < arr.length; i++, j++) {
            arr[i] = arr2[j];
        }
        for (int i = arr.length - n, j = 0; i < arr.length; i++, j++) {
            arr[i] = arr2[j];
        }
    }
    /*
    8 **** Не пользоваться вспомогательным массивом при решении задачи 7.
     */
    public static void moveArrayElementsTask8 (int[] arr, int n) {
        /*
        метод производит сдвиг элементов массива без вспомогательного массива. Для этого создается число А, в которое
        записывается значение крайнего справа элемента, далее последовательно с каждой итерацией элементы сдвигаются
        в соответствии со своим значением. Количество итераций зависит от заданного числа N. В конце каждой итерации
        внешнего цикла на место первого элемента ставится значение из вспомогательной переменной А, куда после этого
        снова записывается крайнее правое значение.
         */
        int a;
        n = formatN(arr, n);
        for (int i = 0; i < n; i++) {
            a = arr[arr.length - 1];
            for (int j = 1; j < arr.length; j++) {
                arr[(arr.length - 1) - (j - 1)] = arr[(arr.length - 1) - j];
            }
            arr[0] = a;
        }
    }
}
