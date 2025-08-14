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
        mergingOfArraysByGapMethod(array_list_1, array_list_2);
        System.out.println("\n****After merging*****\n");
        System.out.println("array first : " + array_list_1);
        System.out.println("array second : " + array_list_2);

        scanner.close();
    }

    public static void mergingOfArraysByTwoPointers(List<Integer> array_list_1, List<Integer> array_list_2) {
        // left moving pointer
        int i = array_list_1.size() - 1;
        // right moving pointer
        int j = 0;

        while (i >= 0 && j < array_list_2.size()) {
            if (array_list_1.get(i) > array_list_2.get(j)) {
                int temp = array_list_2.get(j);
                array_list_2.set(j, array_list_1.get(i));
                array_list_1.set(i, temp);
                j++;
                i--;
            } else break;
        }

        Collections.sort(array_list_1);
        Collections.sort(array_list_2);
    }

    private static void swapValue(List<Integer> arr1, List<Integer> arr2, int left, int right) {
        if (arr1.get(left) > arr2.get(right)) {
            int temp = arr1.get(left);
            arr1.set(left, arr2.get(right));
            arr2.set(right, temp);
        }
    }

    // shell sort technique of gap
    public static void mergingOfArraysByGapMethod(List<Integer> array_list_1, List<Integer> array_list_2) {
        int n = array_list_1.size();
        int m = array_list_2.size();
        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {
            int left = 0;
            int right = left + gap;
            while (right < len) {
                // arr 1 and arr 2
                if (left < n && right >= n) swapValue(array_list_1, array_list_2, left, right - n);
                // arr 1 and arr 1
                else if (left >= n) swapValue(array_list_2, array_list_2, left - n, right - n);
                // arr 2 and arr 2
                else swapValue(array_list_1, array_list_1, left, right);
                left++;
                right++;
            }
            if (gap == 1) break;
            gap = (gap / 2) + (gap % 2);
        }

    }
}
