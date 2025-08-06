package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q3_CheckSorted {
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

        boolean is_sorted_non_descending = isSortedInNonDescending(array_list);
        System.out.println(is_sorted_non_descending ? "Array is sorted in Non Descending order" : "Array is not sorted in Non Descending order");
        boolean is_sorted_non_ascending = isSortedInNonAscending(array_list);
        System.out.println(is_sorted_non_ascending ? "Array is sorted in Non Ascending order" : "Array is not sorted in Non Ascending order");

        scanner.close();
    }

    public static boolean isSortedInNonDescending(List<Integer> array_list){
        for(int i = 0; i < array_list.size() - 1; i++){
            if(array_list.get(i) > array_list.get(i+1)) return false;
        }
        return true;
    }

    public static boolean isSortedInNonAscending(List<Integer> array_list){
        for(int i = 0; i < array_list.size() - 1; i++){
            if(array_list.get(i) < array_list.get(i+1)) return false;
        }
        return true;
    }
}
