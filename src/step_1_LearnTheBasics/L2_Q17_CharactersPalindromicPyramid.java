package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q17_CharactersPalindromicPyramid {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < rows; i++){
            // spaces
            for(int j = 0; j < rows - i - 1; j++){
                System.out.print("   ");
            }

            // stars
            char ch = 'A';
            for(int j = 0 ; j < 2*i + 1; j++){
                System.out.print(" " + ch +" ");
                if(j >= i) ch--;
                else ch++;
            }

            // spaces
            for(int j = 0; j < rows - i - 1; j++) {
                System.out.print("   ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
