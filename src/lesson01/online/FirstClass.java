package lesson01.online;

public class FirstClass {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("Hello world!");
        System.out.print("Hello Java!!!");

        //Целочисленный
        byte vByte = 50; //-128..127 (1byte)
        short vShort = 500; //-32768..32767 (2byte)
        int vInt = 500000; //-2.1*10^5...+2.1 (4byte)
        long vLong = 3000000000L; //-2^64...+2^63 (8byte)

        //С плавающей точкой
        float vFloat = 1.004123456f; //(4byte)
        double vDouble = 1.004123456; // (8byte)

//        System.out.println(vFloat);
//        System.out.println(vDouble);
        //Symbols

        char vChar = 'q';//(2 byte)

        boolean vBoolean = true; // false (1 byte)

        //+,-,*,/,%

        int i1 = 10;
        int i2 = 3;
//        System.out.println("Result int: " + i1 / i2 + " qwert"); //3

        double f1 = 10.0;
        float f2 = 3;
        System.out.println("Result float: " + f1 / f2); //3.333333

        //int a = 12;

        if (a > 100) {
            System.out.println("a > 100");
        } else {
            System.out.println("a < 100");
        }

        if (a > 100) {
            System.out.println("a > 100");
        }

        int age = 20;

        if (age < 18) {
            System.out.println("No smoking");
        } else if (age > 65) {
            System.out.println("Go to home! You old! We have COVID-19");
        } else {
            System.out.println("go smoke");
        }

        System.out.println("Hello");
        doSomething(a);
        System.out.println(doSomething2());
        int b = doSomething2();
        System.out.println(b);
        System.out.println("end");


    }

    public static void doSomething(int inputValue) {
        System.out.println();
        System.out.println("Hello " + inputValue);
    }

    public static int doSomething2() {
        int b = 6;
        int c = 4;
       return b+c;
    }
        int a = 100;
        int b = 67;

//        System.out.println(myMath(a, b));
//        a++; // a = a + 1;
//        System.out.println(myMath(a, b));
//        b++; // b = b + 1;
//        System.out.println(myMath(a, b));
//        a++; // a = a + 1;
//        System.out.println(myMath(a, b));
//
//        System.out.println(a);
//    }

    public static int myMath(int valueA, int valueB) {
        return valueA * 120 + valueB;
    }



}

    /*
1) Написать метод вычисляющий выражение a * (b + (c / d)) и
    возвращающий результат с плавающей точкой, где a, b, c, d – целочисленные входные параметры этого метода;

2) Написать метод, принимающий на вход два целых числа,
и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
если да – вернуть true, в противном случае – false;

3) Написать метод, которому в качестве параметра передается целое число,
метод должен проверить положительное ли число передали, или отрицательное.
Замечание: ноль считаем положительным числом. Результат работы метода вывести в консоль

4) Написать метод, которому в качестве параметра передается строка, обозначающая имя,
метод должен вернуть приветственное сообщение «Привет, переданное_имя!»; Вывести приветствие в консоль.

5)*Написать метод, который определяет является ли год високосным.
Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
Для проверки работы вывести результаты работы метода в консоль
     */

