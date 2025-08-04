package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class L4_Q6_PrintAllDivisors {
    public static void main(String[] args){
        // travel to sqrt(n)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        List<Integer> divisor_list = new ArrayList<>();

        for(int i = 1; i * i <= num ; i++){
            if(num % i == 0){
                divisor_list.add(i);
                if(num / i  != i) divisor_list.add(num / i);
            }
        }

        divisor_list.sort(Comparator.naturalOrder());
        System.out.println("Divisors are : " + divisor_list);

    }
}
