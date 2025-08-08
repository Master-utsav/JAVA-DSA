package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q4_Q5_MaximumSubArraySum {
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

        int max_sum = maximumSubArraySum(array_list);
        System.out.println("Maximum Sub Array sum (kadane's Algo) in an array : " + array_list + " is : " + max_sum);
        scanner.close();
    }

//    kadane's Algo
    public static int maximumSubArraySum(List<Integer> array_list){
        int max_sum = Integer.MIN_VALUE;
        int current_sum = 0;
        int start = -1; int end = -1;

        for (int i = 0; i < array_list.size(); i++) {
            if(current_sum == 0) start = i;
            current_sum += array_list.get(i);
            if (current_sum > max_sum) {
                max_sum = current_sum;
                end = i;
            }
            if (current_sum < 0) current_sum = 0;
        }
        System.out.println("start index : " + start + " end index : " + end);
        return max_sum;
    }
}
