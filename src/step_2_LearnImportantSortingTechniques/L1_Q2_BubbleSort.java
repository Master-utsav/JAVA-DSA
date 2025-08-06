package step_2_LearnImportantSortingTechniques;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L1_Q2_BubbleSort {
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

        System.out.println("Before bubble sort : " + array_list);
        bubbleSort(array_list);
        System.out.println("After bubble sort : " + array_list);
        scanner.close();
    }

    public static void bubbleSort(List<Integer> array_list){
        for(int i = 0; i < array_list.size(); i++){
            boolean flag = false;
            for(int j = 0; j < array_list.size() - 1 - i; j++){
                if(array_list.get(j+1) < array_list.get(j)) {
                    Collections.swap(array_list , j+1 , j);
                    flag = true;
                }
            }
            if(!flag) break;
        }
    }
}
