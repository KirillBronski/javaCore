package lesson02.homeWork02;

import java.util.Arrays;

public class HomeWork02 {
    //01
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 0 ? 1 : 0;
        }
        printArray(arr);
        System.out.println();
    }

    //02
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3 + 1;
        }
        printArray(arr);
        System.out.println();
    }

    //03
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        printArray(arr);
        System.out.println();
    }

    //04
    public static void crossFill(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][arr.length - 1 -i] = 1;
        }

    }

    //05
    public static void minMax() {
        int[] arr = {8, 22, 45, 68, 3, 4, 7, 9, 11, 18};

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
            min = arr[i];
            }
        }
        System.out.println("Мнимальное число массива: " +  min + "\nМаксимальное число массива: " + max);
    }

    //06
    public static boolean checkBalance(int[] arr) {
        int lSide = 0;
        int rSide = 0;
        for (int i = 0; i < arr.length + 1; i++) {
                lSide += arr[i];
                for (int j = i + 1; j < arr.length; j++)
                rSide += arr[j];
            if (lSide == rSide) return true;
            rSide = 0;
        }
        return false;
    }

    //07
    private static void shifter(int[] array, int value) {
        boolean direction;
        if (value < 0) {
            direction = true;
            value = -value;
        } else {
            direction = false;
        }
        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            for (int j = 0; j < lastIndex; j++) {
                if (direction)
                    array[j] = array[j + 1];
                else
                    array[lastIndex - j] = array[lastIndex - j - 1];
            }
            if (direction)
                array[lastIndex] = temp;
            else
                array[0] = temp;
        }
    }

    private static void shifter2(int[] array, int value) {
        boolean direction = value < 0;
        if (direction) value = -value;

        value %= array.length;
        int lastIndex = array.length - 1;
        for (int i = 0; i < value; i++) {
            int temp = (direction) ? array[0] : array[lastIndex];
            if (direction) {
                System.arraycopy(array, 1, array, 0, lastIndex);
                array[lastIndex] = temp;
            } else {
                System.arraycopy(array, 0, array, 1, lastIndex);
                array[0] = temp;
            }
        }
    }


        private static void printArray ( int[] array){
            for (int value : array) {
                System.out.print(value + " ");
            }
            System.out.println();
        }


        public static void main (String[]args){

            //01
            invertArray();

            //02
            fillArray();

            //03
            changeArray();

            //04 - совершенно ничего не понял, что тут происходит, даже глядя на уже готовое решение.
            int[][] crFill = new int[5][5];
            crossFill(crFill);
            for (int i = 0; i < crFill.length; i++) {
                for (int j = 0; j < crFill[i].length; j++) {
                    System.out.print(crFill[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();

            //05
            minMax();

            //06
            System.out.println();
            System.out.println(checkBalance(new int[]{10,2,4,4,}));

            //07
            int[] shiftArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
            System.out.println("7. " + Arrays.toString(shiftArray));
            shifter(shiftArray, -3);
            System.out.println("-3 " + Arrays.toString(shiftArray));
            shifter2(shiftArray, 6);
            System.out.println("+6 " + Arrays.toString(shiftArray));
        }
}
