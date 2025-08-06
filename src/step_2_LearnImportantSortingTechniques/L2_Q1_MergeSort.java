package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q1_MergeSort {
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

        System.out.println("Before merge sort : " + array_list);
        mergeSort(array_list, 0 , array_list.size() -1);
        System.out.println("After merge sort : " + array_list);
        scanner.close();
    }
    
    public static void mergeSort(List<Integer> list, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSort(list, start, mid);
        mergeSort(list, mid + 1, end);
        merge(list, start, mid, end);
    }

    public static void merge(List<Integer> list, int start, int mid, int end) {
        List<Integer> temp = new ArrayList<>();

        int i = start;
        int j = mid + 1;

        while (i <= mid && j <= end) {
            if (list.get(i) <= list.get(j)) {
                temp.add(list.get(i++));
            } else {
                temp.add(list.get(j++));
            }
        }

        while (i <= mid) {
            temp.add(list.get(i++));
        }

        while (j <= end) {
            temp.add(list.get(j++));
        }

        for (int k = 0; k < temp.size(); k++) {
            list.set(start + k, temp.get(k));
        }
    }

}
