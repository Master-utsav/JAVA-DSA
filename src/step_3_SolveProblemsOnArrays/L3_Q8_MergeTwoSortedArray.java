package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L3_Q8_MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int len_1 = scanner.nextInt();

        List<Integer> array_list_1 = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len_1 != 0) {
            array_list_1.add(scanner.nextInt());
            len_1--;
        }

        System.out.print("Enter the length of second array : ");
        int len_2 = scanner.nextInt();

        List<Integer> array_list_2 = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len_2 != 0) {
            array_list_2.add(scanner.nextInt());
            len_2--;
        }

        System.out.println("Array First : " + array_list_1);
        System.out.println("Array Second : " + array_list_2);
        mergingOfArraysByTwoPointers(array_list_1 , array_list_2);
        System.out.println("\n****After merging*****\n");
        System.out.println("array first : " + array_list_1);
        System.out.println("array second : " + array_list_2);

        scanner.close();
    }

    public static void mergingOfArraysByTwoPointers(List<Integer> array_list_1 , List<Integer> array_list_2){
        // left moving pointer
        int i = array_list_1.size() - 1;
        // right moving pointer
        int j = 0;

        while (i >= 0 && j < array_list_2.size()){
            if(array_list_1.get(i) > array_list_2.get(j)) {
                int temp = array_list_2.get(j);
                array_list_2.set(j , array_list_1.get(i));
                array_list_1.set(i , temp);
                j++;
                i--;
            }
            else break;
        }

        Collections.sort(array_list_1);
        Collections.sort(array_list_2);
    }

    public static void mergingOfArraysByGapMethod(List<Integer> array_list_1 , List<Integer> array_list_2){


    }
}
