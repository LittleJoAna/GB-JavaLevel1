package Lesson_1;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(equation(1, 2, 3, 4));
        System.out.println(limits(10, 5));
        System.out.println(positiveOrNegative(50));
        System.out.println(positiveOrNegative(-50));
        name("Анастасия");
        int a = 2100;
        System.out.println("Год " + a + " -" + (bissextile(a) ? "  " : " не") + "високосный!");
    }

    //1 Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат с плавающей точкой,
//    где a, b, c, d – целочисленные входные параметры этого метода;
    public static float equation(int a, int b, int c, int d) {
        return a * (b + (c * 1.0f / d));
    }

    //2 Написать метод, принимающий на вход два целых числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
// если да – вернуть true, в противном случае – false;
    public static boolean limits(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }
    //3 Написать метод, которому в качестве параметра передается целое число, метод должен проверить положительное ли число передали,
// или отрицательное. Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль
    public static String positiveOrNegative(int a) {
        if (a >= 0) {
            return "Число " + a + " положительное";
        } else {
            return "Число " + a + " отрицательное";
        }
    }
    //4 Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вернуть приветственное сообщение
// «Привет, переданное_имя!»; Вывести приветствие в консоль.
    public static void name (String name) {
        System.out.println("Привет, " + name + "!");
    }
    //5 *Написать метод, который определяет является ли год високосным. Каждый 4-й год является високосным, кроме каждого 100-го,
// при этом каждый 400-й – високосный. Для проверки работы вывести результаты работы метода в консоль
    public static boolean bissextile(int a) {
        return ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
    }
}
