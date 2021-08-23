package HW3;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фразу:");
        String a = sc.nextLine();
        String b = a.replaceAll("\\s+", "");
        char[] parray = b.toCharArray();
        System.out.println(isPalindrom(parray));
    }

    public static boolean isPalindrom(char[] b){
        int i1 = 0;
        int i2 = b.length - 1;
        while (i2 > i1) {
            if (b[i1] != b[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}



