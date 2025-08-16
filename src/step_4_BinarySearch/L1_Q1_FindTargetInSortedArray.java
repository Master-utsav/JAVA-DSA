package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q1_FindTargetInSortedArray {
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

        System.out.print("Enter the target element : ");
        int target = scanner.nextInt();

        boolean isTargetFound = binarySearch(array_list, target);
        System.out.println(isTargetFound ? "target found" : "target not found");

        scanner.close();
    }

    public static boolean binarySearch(List<Integer> array_list, int target) {
        int s = 0;
        int e = array_list.size() - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (target < array_list.get(mid)) e = mid - 1;
            else if (target > array_list.get(mid)) s = mid + 1;
            else return true;
        }
        return false;
    }
}
