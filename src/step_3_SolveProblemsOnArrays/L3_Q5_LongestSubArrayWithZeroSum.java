package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L3_Q5_LongestSubArrayWithZeroSum {
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

        List<Integer> sub_array_list = new ArrayList<>(longestSubArrayWithZeroSum(array_list));
        System.out.println("Longest subarray in an array : " + array_list + " whose sum is zero is : " + sub_array_list);
        scanner.close();
    }

    public static List<Integer> longestSubArrayWithZeroSum(List<Integer> array_list){
        List<Integer> subArray = new ArrayList<>();
        Map<Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int max_length = 0;
        int start = -1, end = -1;

        for(int i = 0; i < array_list.size(); i++){
            sum += array_list.get(i);
            if(sum == 0) {
                if(max_length < i + 1){
                    max_length = i + 1;
                    start = i;
                    end = 0;
                }
            }
            System.out.println(map);
            if(map.containsKey(sum)){
                int len = i - map.get(sum);
                if(max_length < len){
                    max_length = len;
                    start = map.get(sum) + 1;
                    end = i;
                }
            }
            else{
                map.put(sum , i);
            }
        }

        if(start != -1) {
            for (int i = start; i <= end; i++) {
                subArray.add(array_list.get(i));
            }
        }

        return subArray;
    }
}
