package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L3_Q3_3Sum {
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

        List<List<Integer>> triplets_list = new ArrayList<>(tripletSumIsZero(array_list));
        System.out.println("triplets Elements in an array : " + array_list + " whose sum is zero are : " + triplets_list);

        scanner.close();
    }

    public static List<List<Integer>> tripletSumIsZero(List<Integer> array_list){
        List<List<Integer>> triplet_list = new ArrayList<>();

        return triplet_list;
    }
}
