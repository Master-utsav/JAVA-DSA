package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_Q11_CountReversePair {
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


        int count = countReversePair(array_list, 0 , array_list.size() - 1);
        System.out.println("reverse pair count of array : " + array_list + " is : " + count);

        scanner.close();
    }


    // ! TODO
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
                if(array_list.get(left) > 2*array_list.get(right)) count += mid - left + 1;
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

    // ! TODO
    public static int countReversePair(List<Integer> array_list, int start , int end) {
        int mid = start + (end - start) / 2;
        int count = 0;

        if (start >= end) return count;

        count += countReversePair(array_list, start, mid);
        count += countReversePair(array_list, mid + 1, end);
        count += mergeSortCount(array_list , start , mid , end);

        return count;
    }
}
