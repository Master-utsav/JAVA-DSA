package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L2_Q14_CountSubArraysWithSumK {
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

        int total_sub_array = countSubArrayWithSumK(array_list, k);
        System.out.println("total subarray from the array : " + array_list + " whose sum is : " + k + " is : " + total_sub_array);
        scanner.close();
    }

//    Enter the length of array : 4
//    Enter the elements of an array : 3 2 1 4
//    Enter the sum value : 3
//    total subarray from the array : [3, 2, 1, 4] whose sum is : 3 is : 2

    public static int countSubArrayWithSumK(List<Integer> array_list , int k){
        int count = 0;
        int sum = 0;

        Map<Integer , Integer> map = new HashMap<>();
        for(int i = 0; i < array_list.size(); i++){
            sum += array_list.get(i);
            if(sum == k) count++;
            int rem_sum = sum - k;
            if(map.containsKey(rem_sum)) count++;
            if(!map.containsKey(sum)) map.put(sum , i);
        }

        return count;
    }
}
