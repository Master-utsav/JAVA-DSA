package step_3_SolveProblemsOnArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L3_Q10_CountInversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of array : ");
        while (len != 0) {
            array_list.add(scanner.nextInt());
            len--;
        }


        int count = countInversion(array_list, 0 , array_list.size() - 1);
        System.out.println("count inversion of array : " + array_list + " is : " + count);

        scanner.close();
    }

    public static int mergeSortCount(List<Integer> array_list, int start , int mid, int end){
        int count = 0;
        int left = start;
        int right = mid + 1;
        List<Integer> temp = new ArrayList<>();

        while (left <= mid && right <= end){
            if(array_list.get(left) <= array_list.get(right)) {
                temp.add(array_list.get(left++));
            }
            else {
                count += mid - left + 1;
                temp.add(array_list.get(right++));
            }
        }

        while (left <= mid) temp.add(array_list.get(left++));
        while (right <= end) temp.add(array_list.get(right++));

        for (int i = 0; i < temp.size(); i++) {
            array_list.set(start + i, temp.get(i));
        }

        return count;
    }

    public static int countInversion(List<Integer> array_list, int start , int end) {
        int mid = start + (end - start) / 2;
        int count = 0;

        if (start >= end) return count;

        count += countInversion(array_list, start, mid);
        count += countInversion(array_list, mid + 1, end);
        count += mergeSortCount(array_list , start , mid , end);

        return count;
    }
}
