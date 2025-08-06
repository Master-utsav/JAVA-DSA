package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L1_HW1_LeftRotateAnArray {
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

        System.out.print("Enter the value of k : ");
        int k = scanner.nextInt();

        System.out.println("Before left rotate an array by " + k + " elements : " + array_list);
        leftRotateAnArray(array_list , k);
        System.out.println("After left rotate an array by " + k + " elements : " + array_list);
        System.out.println("Before left rotate an array by one element : " + array_list);
        leftRotateAnArrayByOneElement(array_list);
        System.out.println("After left rotate an array by one element : " + array_list);

        scanner.close();
    }

    public static void leftRotateAnArray(List<Integer> array_list , int k){
        int d = k % array_list.size();
        Collections.reverse(array_list.subList(0 , d));
        Collections.reverse(array_list.subList(d , array_list.size()));
        Collections.reverse(array_list);
    }

    public static void leftRotateAnArrayByOneElement(List<Integer> array_list){
        int temp = array_list.getFirst();
        for(int i = 1; i < array_list.size() ; i++){
            array_list.set(i-1, array_list.get(i));
        }
        array_list.set(array_list.size() - 1, temp);
    }
//    *********OUTPUT************
//    Enter the length of array : 7
//    Enter the elements of an array : 4 7 8 9 1 2 3
//    Enter the value of k : 3
//    Before left rotate an array by 3 elements : [4, 7, 8, 9, 1, 2, 3]
//    After left rotate an array by 3 elements : [9, 1, 2, 3, 4, 7, 8]
//    Before left rotate an array by one element : [9, 1, 2, 3, 4, 7, 8]
//    After left rotate an array by one element : [1, 2, 3, 4, 7, 8, 9]
}
