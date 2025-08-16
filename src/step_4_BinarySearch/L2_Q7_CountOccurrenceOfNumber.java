package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static step_4_BinarySearch.L2_Q6_FirstAndLastOccurrence.firstOccurrence;
import static step_4_BinarySearch.L2_Q6_FirstAndLastOccurrence.lastOccurrence;

public class L2_Q7_CountOccurrenceOfNumber {
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

        int first_occurrence = firstOccurrence(array_list, target);
        first_occurrence = (first_occurrence < 0 ? -1 : first_occurrence);
        int last_occurrence = lastOccurrence(array_list, target);
        last_occurrence = (last_occurrence > array_list.size() ? -1 : last_occurrence - 1);
        int count = last_occurrence - first_occurrence +  1;
        count = (count > array_list.size() ? -1 : count);
        System.out.println("In an array : " + array_list + " Element : " + target + " Occurred : " + count + " times");

        scanner.close();
    }

}
