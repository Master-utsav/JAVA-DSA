package step_1_LearnTheBasics;

import java.util.Scanner;

public class L2_Q20_Butterfly {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows : ");
        int rows = scanner.nextInt();

        for(int i = 0; i < 2*rows; i++){
            int stars = i + 1;
            int spaces = 2*(rows - i - 1);

            if(i >= rows) {
                stars = 2*rows - i - 1;
                spaces = 2*(i - rows + 1);
            }

            // stars
            for(int j = 0; j < stars; j++){
                System.out.print(" * ");
            }

            // spaces
            for(int j = 0; j < spaces; j++){
                System.out.print("   ");
            }

            // stars
            for(int j = 0; j < stars; j++){
                System.out.print(" * ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
