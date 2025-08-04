package step_1_LearnTheBasics;

import java.util.Scanner;

public class L5_Q9_FibonacciNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the term : ");
        int num = scanner.nextInt();
        
        // O(2^n)
        int feb_num = recursiveFebonacci(num);
        System.out.println(feb_num);

        scanner.close();
    }
    
    public static int recursiveFebonacci(int num){
        if(num == 1 || num == 0) return num;
        return recursiveFebonacci(num - 1) + recursiveFebonacci(num - 2);
    }
}
