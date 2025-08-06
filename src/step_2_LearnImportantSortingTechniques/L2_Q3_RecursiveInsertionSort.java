package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q3_RecursiveInsertionSort {
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

        System.out.println("Before recursive insertion sort : " + array_list);
        recursiveInsertionSort(array_list, 0);
        System.out.println("After recursive insertion sort : " + array_list);
        scanner.close();
    }

    public static void recursiveInsertionSort(List<Integer> array_list, int i){
        if(i == array_list.size()) return;
        int j = i;
        while(j > 0 && array_list.get(j-1) > array_list.get(j)){
            Collections.swap(array_list, j-1 , j--);
        }
        recursiveInsertionSort(array_list , i + 1);

    }
}
