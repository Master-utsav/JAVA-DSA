package step_1_LearnTheBasics;

import java.util.Scanner;

public class L4_Q4_GcdEuclideanAlgorithm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the numbers a and b : ");
        int org_a = scanner.nextInt();
        int org_b = scanner.nextInt();
        int a = org_a;
        int b = org_b;

        while(a > 0 && b > 0){
            if(a > b) a %= b;
            else b %= a;
        }

        System.out.println("GCD of (" + org_a + "," + org_b + ") is : " + ((a == 0) ? b : a));
        scanner.close();
    }
}
