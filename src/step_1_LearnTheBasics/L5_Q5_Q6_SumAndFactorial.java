package step_1_LearnTheBasics;

import java.util.Scanner;

public class L5_Q5_Q6_SumAndFactorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();

        int sum = sumFxn(num , 0);
        System.out.println("Sum of 1 to " + num + " is : " + sum);
        int factorial = factorialFxn(num , 1);
        System.out.println("factorial of " + num + " is : " + factorial);

    }

    public static int sumFxn(int n , int sum){
        if(n == 0) return sum;
        sum += n;
        return sumFxn(n-1 , sum);
    }

    public static int factorialFxn(int n, int factorial){
        if(n == 1) return factorial;
        factorial *= n;
        return factorialFxn(n-1 , factorial);
    }
}
