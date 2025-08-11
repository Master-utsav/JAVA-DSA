package step_3_SolveProblemsOnArrays;

import java.util.*;

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

        int sub_array_length = longestSubArrayPositivesAndNegativesLengthSumK(array_list, k);
        System.out.println("Longest subarray from the array : " + array_list + " whose sum is : " + k + " has of length : " + sub_array_length);
        scanner.close();
    }

//    Enter the length of array : 3
//    Enter the elements of an array : -1 1 1
//    Enter the sum value : 1
//    Longest subarray from the array : [-1, 1, 1] whose sum is : 1 has of length : 3
//
//    Example 2:
//    Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
//    Result: 3
//    Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

    public static int longestSubArrayPositivesAndNegativesLengthSumK(List<Integer> array_list, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int max_len = 0;

        for (int i = 0; i < array_list.size(); i++) {
            sum += array_list.get(i);

            if (sum == k) max_len = Integer.max(max_len, i + 1);

            int rem_sum = sum - k;

            if (map.containsKey(rem_sum)) {
                int len = i - map.get(rem_sum);
                max_len = Integer.max(max_len, len);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max_len;
    }
}
