package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5_HW_1_PrintAllSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        System.out.print("Enter the elements : ");
        List<Integer> array_list = new ArrayList<>();
        while (len != 0) {
            array_list.add(scanner.nextInt());
            len--;
        }

        List<List<Integer>> sub_sequence_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        getAllSubsequences(0, array_list, temp, sub_sequence_list);
        System.out.println("Subsequences are : " + sub_sequence_list);
        System.out.println("Total Subsequences are : " + sub_sequence_list.size());
    }

    public static void getAllSubsequences(int i, List<Integer> array_list, List<Integer> temp, List<List<Integer>> sub_sequence_list) {
        if (i >= array_list.size()) {
            sub_sequence_list.add(new ArrayList<>(temp));
            return;
        }
        getAllSubsequences(i + 1, array_list, temp, sub_sequence_list);
        temp.add(array_list.get(i));

        getAllSubsequences(i + 1, array_list, temp, sub_sequence_list);
        temp.removeLast();

    }
}
