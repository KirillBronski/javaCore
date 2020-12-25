package lesson01.homeWork01;

public class HomeWork01 {
    // 01
    public static double expression(int a, int b, int c, int d){
        return a * (b + ((double)c / d));
    }

    // 02
    public static boolean sum(int a, int b){
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 03
    public static void posOrNegNumber(int a){
        if (a >= 0){
            System.out.println("Решение №3: 'a' имеет положительное значение: " + a);
        } else System.out.println("Решение №4: 'a' имеет отрицательное значение: " + a);
    }

    // 04
    public static void helloName(String name){

        System.out.println("Решение №4: Привет, " + name + "!");
    }

    // 05
    public static void leapYear(int year){
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("Решение №5: " + year + "-й год високосный!");
        } else {
            System.out.println("Решение №5: " + year + "-й год не високосный!");

        }
    }

    public static void main(String[] args) {

        System.out.println("Решение №1: " + expression(7,9,25,62));

        System.out.println("Решение №2: " + sum(9,7));

        posOrNegNumber(1);

        helloName("Александр Гладков");

        leapYear(100);
        leapYear(400);
        leapYear(1987);
        leapYear(2020);
    }

}
