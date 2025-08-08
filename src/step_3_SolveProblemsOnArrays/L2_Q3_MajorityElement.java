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
        System.out.println("Majority Element in an array : " + array_list + " is : " + majority_element);

        scanner.close();
    }

    // Moore's voting algo
    public static int majorityElement(List<Integer> array_list){
        int count = 0;
        int element = -1;

        for(Integer el : array_list){
            if(count == 0){
                count++;
                element = el;
            }
            else if(el == element) count++;
            else count--;
        }
        int count_check = 0;
        for(Integer el : array_list){
            if(el == element) count_check++;
        }

        if(count_check > array_list.size() / 2) return element;
        else return -1;
    }
}
