package step_1_LearnTheBasics;

import java.util.Scanner;
import java.lang.Math;

public class L4_Q1_CountTheDigits {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("enter the number for counting digits : ");
        double num = scanner.nextDouble();

        double digit = Math.ceil(Math.log10(num));

        System.out.println("digits are : " + digit);
        scanner.close();


    }
}
