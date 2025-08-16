package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q13_FindPeakElement {
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

        int element = peakElement(array_list);
        System.out.println("in a array : " + array_list + "peak element is : " + element);

        scanner.close();
    }

    public static int peakElement(List<Integer> array_list){
        int element = -1;

        return element;
    }
}
