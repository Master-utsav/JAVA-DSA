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
        int i = 0;
        int temp = 0;
        int max_count = 0;
        while(i < array_list.size()){
            if(array_list.get(i) == 1) {
                temp++;
                max_count = Integer.max(temp , max_count);
            }
            else temp = 0;
            i++;
        }
        return max_count;
    }
}
