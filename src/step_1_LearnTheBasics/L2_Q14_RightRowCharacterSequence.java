package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q14_RightRowCharacterSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        // approach 1
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }

        // approach 2
        for(int i = 0; i < rows; i++){
            for(char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
