package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L1_Q5_RightRotateAnArray {
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

        System.out.println("Before right rotate an array by " + k + " elements : " + array_list);
        rightRotateAnArray(array_list , k);
        System.out.println("After right rotate an array by " + k + " elements : " + array_list);
        System.out.println("Before right rotate an array by one element : " + array_list);
        rightRotateAnArrayByOneElement(array_list);
        System.out.println("After right rotate an array by one element : " + array_list);

        scanner.close();
    }

    public static void rightRotateAnArray(List<Integer> array_list , int k){
        int d = k % array_list.size();
        Collections.reverse(array_list.subList(0 , array_list.size() - d));
        Collections.reverse(array_list.subList(array_list.size() - d , array_list.size()));
        Collections.reverse(array_list);
    }

    public static void rightRotateAnArrayByOneElement(List<Integer> array_list){
        int temp = array_list.getLast();
        for(int i = array_list.size() - 2; i >= 0 ; i--){
            array_list.set(i+1, array_list.get(i));
        }
        array_list.set(0, temp);
    }
//    *********OUTPUT************
//    Enter the length of array : 7
//    Enter the elements of an array : 4 7 8 9 1 2 3
//    Enter the value of k : 3
//    Before right rotate an array by 3 elements : [4, 7, 8, 9, 1, 2, 3]
//    After right rotate an array by 3 elements : [1, 2, 3, 4, 7, 8, 9]
//    Before right rotate an array by one element : [1, 2, 3, 4, 7, 8, 9]
//    After right rotate an array by one element : [9, 1, 2, 3, 4, 7, 8]
}
