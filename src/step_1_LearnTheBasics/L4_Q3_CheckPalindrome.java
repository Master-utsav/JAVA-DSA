package step_1_LearnTheBasics;

import java.util.Scanner;

public class L4_Q3_CheckPalindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of your choice : ");
        int num = scanner.nextInt();

        int reversed_num = 0;
        int original_num = num;
        while(num != 0){
            int digit = num % 10;
            reversed_num = reversed_num * 10 + digit;
            num /= 10;
        }

        System.out.println(reversed_num == original_num ? "number is palindrome" : "number is not a palindrome");
        scanner.close();
    }
}
