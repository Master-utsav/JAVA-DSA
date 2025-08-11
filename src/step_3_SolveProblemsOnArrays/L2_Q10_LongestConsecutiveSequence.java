package step_3_SolveProblemsOnArrays;

import java.util.*;

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
        System.out.print("  longest possible sub-sequence is : \n" + array_list);
        int length = longestSubSequenceOfAnArray(array_list);
        System.out.println("Length of a subarray is : " + length);
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

    // optimal solution
    public static int longestSubSequenceOfAnArray(List<Integer> array_list){
        Set<Integer> st = new HashSet<>(array_list);

        int longest = 1;

        // Find the longest sequence
        for (int it : st) {
            // if 'it' is a starting number
            if (!st.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (st.contains(x + 1)) {
                    x++;
                    cnt++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }

    
}
