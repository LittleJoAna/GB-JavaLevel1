package Lesson_6;

/*
1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
4. ** Написать метод, проверяющий, есть ли указанное слово в папке
 */

import java.io.*;
import java.util.Scanner;

public class HomeWord {
    public static void main(String[] args) {
        try {
            String file1 = "text1.txt";
            String file2 = "text2.txt";
            String file3 = "text3.txt";

            PrintStream psText1 = new PrintStream(new FileOutputStream(file1, true));
            PrintStream psText2 = new PrintStream(new FileOutputStream(file2, true));
            PrintStream psText3 = new PrintStream(new FileOutputStream(file3, true));
            psText1.print("A glooming peace this morning with it brings.\n" +
                    "The sun for sorrow will not show his head.\n" +
                    "Go hence, to have more talk of these sad things;\n");
            psText2.print("Some shall be pardon'd, and some punished;\n" +
                    "For never was a story of more woe\n" +
                    "Than this of Juliet and her Romeo.\n");

            uniteFile(file1, file3);
            uniteFile(file2, file3);






            psText1.close();
            psText2.close();
            psText3.close();
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует!");
        }
    }

    public static void uniteFile(String file1, String file2) throws FileNotFoundException{
        Scanner sc = new Scanner(new FileInputStream(file1));
        PrintStream ps = new PrintStream(new FileOutputStream(file2, true));
        while (sc.hasNext()) {
            ps.println(sc.nextLine());
        }
    }







}
