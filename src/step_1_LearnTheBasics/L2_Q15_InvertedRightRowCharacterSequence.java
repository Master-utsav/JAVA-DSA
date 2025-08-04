package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q15_InvertedRightRowCharacterSequence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < rows; i++){
            for(char j = 'A'; j <= 'A' + (rows - i - 1); j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
