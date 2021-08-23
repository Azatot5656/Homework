package HW3;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        int count = 0;
        int secret = 1 + (int) (Math.random() * 99);
        int guess = 0;

        System.out.println("Я загадал число от 1 до 100"
                + " ... угадай что за число?");

        while (guess != secret) {
            guess = keyboard.nextInt();
            count++;
            if (guess > secret) {
                System.out.println("Много!");
            } else if (guess < secret) {
                System.out.println("Мало!");
            }
        }
        System.out.println("Поздравляю, ты угадал число с  "
                + count + " попытки!");
    }
}
