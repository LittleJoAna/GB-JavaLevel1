package Lesson_3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class HomeWorkQuessTheNumber {
    /*
1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    */
    private static boolean exit = false; //переменная для выхода из игры
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random(1);
    private static int count = 0, attempt, number, max, answer, countGame, countWin, countLose;

    public static void main(String[] args) {
        System.out.println("Приветствую тебя в игре <<Угадай число>>! " +
                "\nЖелаю удачи! Приступим!");
        do {
            System.out.println("\nВведи максимальное число для компьютера! " +
                    "\nОт 0 до этого числа компьютер загадает тебе число!");
            max = sc.nextInt();
            System.out.println("Введи количество попыток, с которых ты угадаешь это число!");
            attempt = sc.nextInt();
            number = random.nextInt(max);
            System.out.println("максимальное число: " + max + "\nзагаданное число: " + number + "\nколичество попыток: " + attempt);
            System.out.println("Игра началась! \nКомпьютер загадал число от 0 до " + max + "!\nТвой ход!\n");
            runTheGame();
            System.out.println("Хочешь сыграть еще раз? Введи 1 если хочешь продолжить, введи 0 если хочешь закончить игру!");
            answer = sc.nextInt();
            if (answer == 1) {
                exit = true;
            } else {
                exit = false;
            }
        } while (exit);
        System.out.println("Ты сыграл(а) в игру <<Угадай число>> " + countGame + " раз. Из них побед - " +
                countWin + ", поражений - " + countLose);
        System.out.println("Спасибо за игру! До новых встреч!");

        sc.close();
    }

    public static void runTheGame() {
        countGame++;
        count = 0;
        System.out.println("Попробуй угадать число! ");
        int a;
        for (int i = 0; i < attempt; i++) {
            a = sc.nextInt();
            count++;
            if (a == number) {
                System.out.println("Ты угадал(а) число с " + count + " попытки!");
                countWin++;
                break;

            } else if (a > 0 && a < number) {
                System.out.println("Ты не угадал(а)! \nЗагаданное число больше!");
            } else if (a > number) {
                System.out.println("Ты не угадал(а)! \nЗагаданное число меньше!");
            }
            if (count < attempt) {
                System.out.println("У тебя осталось еще " + (attempt - count) + " попыток!");
            } else {
                System.out.println("Попытки закончились! Ты проиграл(а)!");
                countLose++;
                break;
            }
        }
    }
}
