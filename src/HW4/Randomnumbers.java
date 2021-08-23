package HW4;

import java.util.Random;

public class Randomnumbers {

    public static void math(int[] args) {
        Random rand = new Random();
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10) + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int arg = 0;
        for (int i = 0; i < arr.length; i++) {
            arg += arr[i];
        }
        arg /= arr.length;
        arg.toString();
        main(arg);


    }
    public static void main(String[] arg ) {
        System.out.println("Среднее арифметическое:"+ arg);

    }
}








