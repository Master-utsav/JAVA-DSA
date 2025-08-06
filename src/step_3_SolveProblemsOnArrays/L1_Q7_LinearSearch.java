package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q7_LinearSearch {
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

        System.out.print("Enter the target Element : ");
        int target = scanner.nextInt();

        int index = linearSearch(array_list, target);
        System.out.println(index != -1 ? "Target element " + target +  " found at index : " + index : "Target element " + target +  "not found.");
        scanner.close();
    }

    public static int linearSearch(List<Integer> array_list , int target){
        for(int i = 0; i < array_list.size(); i++){
            if(target == array_list.get(i)) return i;
        }
        return -1;
    }
}
