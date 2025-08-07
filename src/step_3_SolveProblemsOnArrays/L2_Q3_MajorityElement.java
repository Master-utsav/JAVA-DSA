package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q3_MajorityElement {
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

        int majority_element = majorityElement(array_list);
        System.out.println("Unique Element in an array : " + array_list + " is : " + majority_element);

        scanner.close();
    }

    public static int majorityElement(List<Integer> array_list){

        return -1;
    }
}
