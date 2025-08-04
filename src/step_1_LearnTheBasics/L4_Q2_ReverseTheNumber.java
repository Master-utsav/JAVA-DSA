package step_1_LearnTheBasics;

import java.util.Scanner;

public class L4_Q2_ReverseTheNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        int reverse_num = 0;
        while(num != 0){
            int digit = num % 10;
            reverse_num = reverse_num * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number is : " + reverse_num);
        scanner.close();
    }
}
