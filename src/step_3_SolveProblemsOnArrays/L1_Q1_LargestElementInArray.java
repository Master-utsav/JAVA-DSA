package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q1_LargestElementInArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while(len != 0){
            array_list.add(scanner.nextInt());
            len--;
        }

        int min_element = minElement(array_list);
        System.out.println("Minimum of list : " + array_list + " is : " + min_element);
        int max_element = maxElement(array_list);
        System.out.println("Maximum of list : " + array_list + " is : " + max_element);

        scanner.close();
    }

    public static int maxElement(List<Integer> array_list){
        int max_Element = array_list.getFirst();
        for (Integer integer : array_list) {
            if (integer > max_Element) max_Element = integer;
        }
        return max_Element;
    }

    public static int minElement(List<Integer> array_list){
        int min_Element = array_list.getFirst();
        for (Integer integer : array_list) {
            if (integer < min_Element) min_Element = integer;
        }
        return min_Element;
    }
}
