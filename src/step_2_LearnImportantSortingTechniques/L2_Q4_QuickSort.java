package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q4_QuickSort {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while(len != 0){
            array_list.add(scanner.nextInt());
            len--;
        }

        System.out.println("Before quick sort : " + array_list);
        quickSort(array_list, 0 , array_list.size() - 1);
        System.out.println("After quick sort : " + array_list);
        scanner.close();
    }

    public static void quickSort(List<Integer> array_list, int start, int end){
        if(start >= end) return;

        int pivot_index = partition(array_list, start, end);
        quickSort(array_list , start , pivot_index - 1);
        quickSort(array_list, pivot_index + 1, end);
    }

    public static int partition(List<Integer> array_list, int start, int end) {
        int pivot = array_list.get(end);
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array_list.get(j) <= pivot) Collections.swap(array_list, ++i , j );
        }
        Collections.swap(array_list, i + 1, end);
        return i + 1;
    }
}
