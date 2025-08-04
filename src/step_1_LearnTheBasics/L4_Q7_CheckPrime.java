package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_Q7_CheckPrime {
    public static void main(String[] args){
        // most optimal way pre computation based by using sieve-of-eratosthenes
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scanner.nextInt();
        int digit = (int) Math.ceil(Math.log10(num));
        int end = (int) Math.pow(10 , digit);
        int [] primes = getSieve(end);

        System.out.println(primes[num] == 1 ? "Number is prime" : "Number is not prime");

        int no_of_primes = countPrime(2, num);
        System.out.println("Total prime numbers = " + no_of_primes);

        scanner.close();
    }

    public static int countPrime(int left, int right){
        int digit = (int) Math.ceil(Math.log10(right));
        int end = (int) Math.pow(10 , digit);
        int [] primes = getSieve(end);
        List<Integer> prime_list = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i <= end; i++) {
            if(primes[i] == 1 && i <= right) prime_list.add(i);
            sum += primes[i];
            primes[i] = sum;
        }
        System.out.println("Prime numbers are : " + prime_list);
        return primes[right] - primes[left - 1];
    }

    public static int[] getSieve(int end){
        int[] primes = new int[end + 1];

        for(int i = 2; i < end ; i++) primes[i] = 1;
        // mark for primes
        for(int i = 2; i * i <= end; i++) {
            for (int j = i * i; j <= end; j += i) {
                primes[j] = 0;
            }
        }
        return primes;
    }
}
