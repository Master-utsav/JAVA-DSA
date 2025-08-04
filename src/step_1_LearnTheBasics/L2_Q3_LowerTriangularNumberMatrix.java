package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q3_LowerTriangularNumberMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print(j + 1);
            }
            System.out.println();
        }

        scanner.close();
    }
}
