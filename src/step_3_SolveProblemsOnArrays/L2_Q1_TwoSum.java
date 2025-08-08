package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class L2_Q1_TwoSum {
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

        System.out.print("Enter the value of k : ");
        int k = scanner.nextInt();

        boolean is_pair_exist = possiblePairsOfTwoSum(array_list , k);
        System.out.print( is_pair_exist ? "YES" : "NO");
        scanner.close();
    }

    // greedy
    public static boolean possiblePairsOfTwoSum(List<Integer> array_list, int k){
        array_list.sort(Comparator.naturalOrder());
        int i = 0;
        int j = array_list.size() -1;
        int sum = array_list.get(i) + array_list.get(j);
        while(i < j){
            if(sum > k) sum = sum - array_list.get(j--) + array_list.get(j);
            else if (sum < k) sum = sum - array_list.get(i++) + array_list.get(i);
            else return true;
        }
        return false;
    }
}
