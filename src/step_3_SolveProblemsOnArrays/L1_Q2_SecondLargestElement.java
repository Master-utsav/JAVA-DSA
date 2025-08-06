package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q2_SecondLargestElement {
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

        int sec_largest_elem = secondLargestElement(array_list);
        System.out.println("Second Largest Element of list : " + array_list + " is : " + sec_largest_elem);
        int sec_smallest_elem = secondSmallestElement(array_list);
        System.out.println("Second Smallest Element of list : " + array_list + " is : " + sec_smallest_elem);

        scanner.close();
    }

    public static int secondLargestElement(List<Integer> array_list) {
        if (array_list.size() == 1) return array_list.getFirst();
        int first_largest = array_list.getFirst();
        int second_largest = Integer.MIN_VALUE;

        for (Integer integer : array_list) {
            if (integer > first_largest) {
                second_largest = first_largest;
                first_largest = integer;
            }
            else if(integer < first_largest && integer > second_largest) second_largest = integer;
        }
        return second_largest;
    }

    public static int secondSmallestElement(List<Integer> array_list) {
        if (array_list.size() == 1) return array_list.getFirst();
        int first_smallest = array_list.getFirst();
        int second_smallest = Integer.MAX_VALUE;

        for (Integer integer : array_list) {
            if (integer < first_smallest) {
                second_smallest = first_smallest;
                first_smallest = integer;
            }
            else if(integer > first_smallest && integer < second_smallest) second_smallest = integer;
        }
        return second_smallest;
    }
}
