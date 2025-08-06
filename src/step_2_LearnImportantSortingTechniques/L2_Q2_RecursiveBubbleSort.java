package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q2_RecursiveBubbleSort {
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

        System.out.println("Before recursive bubble sort : " + array_list);
        recursiveBubbleSort(array_list, array_list.size() -1);
        System.out.println("After recursive bubble sort : " + array_list);
        scanner.close();
    }

    public static void recursiveBubbleSort(List<Integer> array_list , int n){
        if (n == 1) return;

        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            if (array_list.get(i) > array_list.get(i + 1)) {
                Collections.swap(array_list, i, i + 1);
                swapped = true;
            }
        }
        if (!swapped) return;
        recursiveBubbleSort(array_list, n - 1);
    }
}
