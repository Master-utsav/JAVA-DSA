package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q22_ConcentricNumberSquare {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < 2*rows - 1; i++){
            for(int j = 0; j < 2*rows - 1; j++){
                int right = 2*rows - 2 - j;
                int bottom = 2*rows - 2 - i;
                int val = rows - Integer.min(Integer.min(i , j) , Integer.min(right , bottom));
                System.out.print(" " + val + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
