package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q10_MaximumConsecutiveOnes {
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

        int max_consecutive_ones = maximumConsecutiveOnes(array_list);
        System.out.println("Maximum consecutive ones in array : " + array_list + " is : " + max_consecutive_ones);

        scanner.close();
    }

    public static int maximumConsecutiveOnes(List<Integer> array_list){

        return -1;
    }
}
