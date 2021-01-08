package lesson06.online;

import java.io.*;
import java.util.Scanner;

public class MainClass extends Object {

    //static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String s0 = "Hello_World";
//        String s1 = "Hello";
//        s1 += "_World";
//        String s2 = scanner.nextLine();
//        String s3 = "Hello_World";
//
//        System.out.println(s0 == s1);
//        System.out.println(s0 == s2);
//        System.out.println(s0 == s3);
//
//        System.out.println(s0.equals(s3));

//        long starTime = System.nanoTime();
//        String example = "Example"; //String example = new String ("Example");
//
//        for (int i = 0; i < 50000; i++) {
//            example += i;
//        }
//        float deltaTime = System.nanoTime() - starTime;
//        System.out.println(example);
//        System.out.println("Work time string: " + deltaTime * 0.000001f + " millisec");
//
//
//        starTime = System.nanoTime();
//        StringBuilder example1 = new StringBuilder("Example");
//        for (int i = 0; i < 50000; i++) {
//            example1.append(i);
//        }
//
//        deltaTime = System.nanoTime() - starTime;
//        System.out.println(example1.toString());
//        System.out.println("Work time StringBuilder: " + deltaTime * 0.000001f + " millisec");
//        System.out.println(example.equals(example1.toString()));
//        String s0 = "Hello";
//        s0 += "_world";
//
//        StringBuilder s = new StringBuilder("Hello");
//        s.append("_world");
//        s.delete(0, s.length());
//        s.append("Hello!!!");

//
//        try{
//            System.out.println(10 / 0);
//        } catch (ArithmeticException exception) {
//            System.out.println("Error! Caught " + exception.getMessage());
//        }

//
//        int[] arr = new int[10];
//        arr[11] = 5;
//        System.out.println("Program start");
//
//        System.out.println("Program finish");
        //    private static void method1() throws IOException{
//        //try{
//            throw new IOException("Exception from method");
////        } catch (IOException exception){
////            System.out.println(exception.getCause());
////        }
//        InputStream io; // чтение из файла
//        OutputStream out; // запись в фаил
//
//        FileInputStream fis; // чтение
//        FileOutputStream fos; // запись
        try {
            FileOutputStream fos = new FileOutputStream("text.txt", true);
            PrintStream ps = new PrintStream(fos);
            byte[] str = "Hello world".getBytes();
//            ps.println("Hello");
//            ps.close();
            fos.write(str);
            fos.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
        } catch (IOException exception){
            exception.printStackTrace();
        }

        try{
            FileInputStream fis = new FileInputStream("text.txt");
            int outbox;
            while ((outbox = fis.read()) != -1){
                System.out.print((char) outbox);
            }
            //System.out.println((char)fis.read());
            fis.close();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }



}



