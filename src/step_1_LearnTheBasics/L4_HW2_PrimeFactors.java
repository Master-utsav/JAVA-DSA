package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_HW2_PrimeFactors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = scanner.nextInt();
        List<Integer> prime_factor = new ArrayList<>();

        for(int i = 2; i * i <= num ; i++){
            if(num % i == 0){
                while(num % i == 0){
                    prime_factor.add(i);
                    num /= i;
                }
            }
        }
        if(num > 1) prime_factor.add(num);

        System.out.println("Prime factors are : " + prime_factor);

        scanner.close();
    }
}
