package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_Q12_MaximumProductSubArray {
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


        int max_product = maximumProductSubArray(array_list);
        System.out.println("maximum product of array : " + array_list + " is : " + max_product);

        scanner.close();
    }

    public static int maximumProductSubArray(List<Integer> array_list){
        int max_prod = 1;

        return max_prod;
    }
}
