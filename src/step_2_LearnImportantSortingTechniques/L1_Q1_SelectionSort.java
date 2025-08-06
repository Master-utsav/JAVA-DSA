package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L1_Q1_SelectionSort {
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

        System.out.println("Before selection sort : " + array_list);
        selectionSort1(array_list);
        System.out.println("After selection sort : " + array_list);
        scanner.close();
    }

    public static void selectionSort1(List<Integer> array_list){
        for(int i = 0; i < array_list.size() - 1; i++){
            Collections.swap(array_list, i, array_list.indexOf(Collections.min(array_list.subList(i , array_list.size()))));
        }
    }

    public static void selectionSort2(List<Integer> array_list) {
        for (int i = 0; i < array_list.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array_list.size(); j++) {
                if (array_list.get(j) < array_list.get(min_index)) min_index = j;
            }
            Collections.swap(array_list, i, min_index);
        }
    }
}
