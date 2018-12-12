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
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            String file1 = "text1.txt";
            String file2 = "text2.txt";
            String file3 = "text3.txt";
            String dir = ".";

            createFile(file1);
            createFile(file2);
            createFile(file3);

            uniteFile(file1, file3);
            uniteFile(file2, file3);

            System.out.println("Введите слово для поиска в файле: ");
            String userWord = scan.nextLine();
            System.out.println(isFindInFile(file3, userWord));

            System.out.println("Введите слово для поиска в директории: ");
            userWord = scan.nextLine();
            System.out.println(isFindInDirectory(dir, userWord));

            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла не существует!");
        } catch (IOException e) {
            System.out.println("Что-то пошло не так");
        }
    }

    //1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
    private static void createFile(String file) throws FileNotFoundException {
        PrintStream psText = new PrintStream(new FileOutputStream(file, true));
        String flag = "Q";
        String inputUser;

        do {
            System.out.println("Введите текст в файл " + file + " (введите Q для окончания записи в файл): ");
            inputUser = scan.nextLine();
            if (!(inputUser.equals(flag))) {
                psText.println(inputUser);
            }
        } while (!(inputUser.equals(flag)));

        psText.flush();
        psText.close();
    }

    //2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
    private static void uniteFile(String file1, String file2) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(file1));
        PrintStream ps = new PrintStream(new FileOutputStream(file2, true));
        while (sc.hasNext()) {
            ps.println(sc.nextLine());
        }
        sc.close();
        ps.flush();
        ps.close();
    }

    //3. * Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
    private static boolean isFindInFile(String file, String word) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(file));
        String readWord;
        while (sc.hasNext()) {
            readWord = sc.next();
            if (readWord.equals(word)) {
                return true;
            }
        }
        sc.close();
        return false;
    }

    //4. ** Написать метод, проверяющий, есть ли указанное слово в папке
    private static boolean isFindInDirectory (String dir, String word) throws IOException{
        File file = new File(dir);
        if (!file.isDirectory()) return false;
        String[] arrFile = file.list();
        File fileArr;
        for (int i = 0; i < arrFile.length; i++) {
            fileArr = new File(arrFile[i]);
            System.out.println(fileArr);
            if (fileArr.isFile()) {
                if (isFindInFile(arrFile[i], word)) return true;
            }
        }
        return false;
    }
}
