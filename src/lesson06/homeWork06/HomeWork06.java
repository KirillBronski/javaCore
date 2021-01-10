package lesson06.homeWork06;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class HomeWork06 {

    public static void main(String[] args) {

        try {
            FileInputStream fis1 = new FileInputStream("HW06_1.txt");
            FileInputStream fis2 = new FileInputStream("HW06_2.txt");
//            int readFile;
//            while ((readFile = fis1.read()) != -1 || (readFile = fis2.read()) != -1)
//                System.out.print((char) readFile);
            fis1.close();
            fis2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        combined(new String[]{"HW06_1.txt", "HW06_2.txt"}, "Combined.txt");

        System.out.println("File 'Combined.txt' successfully combined");

        searchWord("Combined.txt", "standard");
    }

    // 01
    public static void combined(String[] names, String combinedFile) {
        try {
            FileOutputStream fos = new FileOutputStream(combinedFile);
            for (String name : names) {
                FileInputStream fis = new FileInputStream(name);
                int i;
                do {
                    i = fis.read();
                    if (i != -1) {
                        fos.write(i);
                    }
                } while (i != -1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 02
    public static void searchWord(String file, String word) {
        try {
            FileInputStream fis = new FileInputStream(file);
            int symbol = 0;
            int index = 0;
            byte[] wordArr = word.getBytes();
            do {
                symbol = fis.read();
                if (wordArr[index] == symbol) {
                    index++;
                    if (index == wordArr.length) {
                        System.out.println("word found!");
                        break;
                    }
                } else {
                    index = 0;
                }
            } while (symbol != -1);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}