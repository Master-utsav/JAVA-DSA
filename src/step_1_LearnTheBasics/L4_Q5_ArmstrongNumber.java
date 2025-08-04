package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_Q5_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        long n = scanner.nextLong();
        List<Long> arms_list = new ArrayList<>();

        for (long i = 1; i <= n; i++) {
            int digits = (int) Math.ceil(Math.log10(i));
            long sum = 0;
            long temp = i;

            while (temp != 0) {
                long digit = temp % 10;
                sum += (int) Math.pow(digit, digits);
                temp /= 10;
            }
            if (sum == i) arms_list.add(i);
        }
        System.out.println("Armstrong Numbers are: " + arms_list);
        scanner.close();
    }

}
