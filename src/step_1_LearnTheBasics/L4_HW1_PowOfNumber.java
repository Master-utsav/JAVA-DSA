package step_1_LearnTheBasics;

import java.util.Scanner;

public class L4_HW1_PowOfNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number and the exponent : ");
        int num = scanner.nextInt();
        int expo = scanner.nextInt();

        int result = 1;
        int n = num;
        int org_expo = expo;

        while(expo != 0) {
            if ((expo & 1) == 1) {
                result *= n;
                expo -= 1;
            } else {
                n *= n;
                expo /= 2;
            }
        }
        System.out.println("value of " + num + "^" + org_expo + " is : " + result);
        scanner.close();
    }
}
