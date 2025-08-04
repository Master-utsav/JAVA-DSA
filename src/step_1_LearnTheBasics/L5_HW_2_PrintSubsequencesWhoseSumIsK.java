package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L5_HW_2_PrintSubsequencesWhoseSumIsK {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        System.out.print("Enter the elements : ");
        List<Integer> array_list = new ArrayList<>();
        while (len != 0) {
            array_list.add(scanner.nextInt());
            len--;
        }
        System.out.print("Enter the sum value : ");
        int k = scanner.nextInt();

        List<List<Integer>> sub_sequence_list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        getAllSubsequencesWhoseSumIsK(0, 0, k, array_list, temp, sub_sequence_list);
        System.out.println("Subsequences are : " + sub_sequence_list);
        System.out.println("Total Subsequences are : " + sub_sequence_list.size());
    }
    public static void getAllSubsequencesWhoseSumIsK(int i, int sum, int k, List<Integer> array_list, List<Integer> temp, List<List<Integer>> sub_sequence_list) {
        if (i == array_list.size()) {
            if (sum == k) sub_sequence_list.add(new ArrayList<>(temp));
            return;
        }

        temp.add(array_list.get(i));
        sum += array_list.get(i);
        getAllSubsequencesWhoseSumIsK(i + 1, sum , k, array_list, temp, sub_sequence_list);

        sum -= array_list.get(i);
        temp.removeLast();
        getAllSubsequencesWhoseSumIsK(i + 1, sum, k, array_list, temp, sub_sequence_list);

    }
}
