package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q11_BinaryStairs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < rows; i++){
            int digit = 0;
            if(i % 2 == 0) digit = 1;
            for(int j = 0; j <= i; j++){
                System.out.print(digit + " ");
                digit = 1 - digit;
            }
            System.out.println();
        }

        scanner.close();
    }
}
