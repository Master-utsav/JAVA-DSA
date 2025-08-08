package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q13_LongestSubArrayPositivesAndNegativesSumK {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len != 0) {
            array_list.add(scanner.nextInt());
            len--;
        }
        System.out.print("Enter the sum value : ");
        int k = scanner.nextInt();

        int sub_array_length =  longestSubArrayPositivesAndNegativesLengthSumK(array_list , k);
        System.out.println("Longest subarray from the array : " + array_list + " whose sum is : " + k + " has of length : " + sub_array_length);
        scanner.close();
    }

//    Example 1:
//    Input Format: N = 3, k = 5, array[] = {2,3,5}
//    Result: 2
//    Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
//
//    Example 2:
//    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
//    Result: 3
//    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

    public static int longestSubArrayPositivesAndNegativesLengthSumK(List<Integer> array_list , int k){
        return -1;
    }
}
