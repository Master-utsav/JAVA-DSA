package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q10_LongestConsecutiveSequence {
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
        System.out.print("In an array : " + array_list);
        longestSubsequenceOfAnArrayUsingSort(array_list);
        System.out.print("  longest possible sub-sequence is : " + array_list);
        scanner.close();
    }

    // better solution
    public static void longestSubsequenceOfAnArrayUsingSort(List<Integer> array_list) {
        Collections.sort(array_list);
        int start = 0; int end = 0;
        int count = 0;
        int max_len = 0;

        for (int i = 0; i < array_list.size() - 1; i++) {
            if (array_list.get(i + 1) - array_list.get(i) == 1) count++;
            if (max_len < count) {
                max_len = count;
                start = i - count + 1;
                if (i + 1 == array_list.size() - 1) end = start + count;
                else end = i + 1;
            }
            if (array_list.get(i + 1) - array_list.get(i) != 1) count = 0;
        }

        int len = end - start + 1;
        for(int i = 0 ; i < array_list.size(); i++){
            if(i <= end && i >= start) array_list.set(i - start , array_list.get(i));
        }
        while(len < array_list.size()){
            array_list.removeLast();
        }
    }

}
