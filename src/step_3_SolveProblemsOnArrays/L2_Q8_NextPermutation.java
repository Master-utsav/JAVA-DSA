package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q8_NextPermutation {
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

        System.out.print("Next Permutation of array : " + array_list + " is : ");
        nextPermutation(array_list);
        System.out.print(array_list);

        scanner.close();
    }

    public static void nextPermutation(List<Integer> array_list){
        int break_point = -1;
        for(int i = array_list.size() - 2; i >= 0 ; i--){
            if(array_list.get(i) < array_list.get(i+1)){
                break_point = i;
                break;
            }
        }

        if(break_point == -1) {
            Collections.reverse(array_list);
            return;
        }

        for(int i = array_list.size() - 1; i > break_point; i--){
            if(array_list.get(i) > array_list.get(break_point)){
                Collections.swap(array_list , i, break_point);
                break;
            }
        }

        Collections.reverse(array_list.subList(break_point + 1 , array_list.size()));
    }


}
