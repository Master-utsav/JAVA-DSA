package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q2_SortZerosOnesTwos {
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

        System.out.print("Before sorting of array : " + array_list);
        sortZeroOneTwo(array_list);
        System.out.print("After sorting of array : " + array_list);

        scanner.close();
    }
    public static  void sortZeroOneTwo(List<Integer> array_list){
        int mid = 0;
        int low = 0;
        int high = array_list.size() - 1;

        while(mid <= high){
            if(array_list.get(mid) == 0) Collections.swap(array_list, low++ , mid++);
            if(array_list.get(mid) == 1) mid++;
            if(array_list.get(mid) == 2) Collections.swap(array_list, high-- , mid);
        }
    }

}
