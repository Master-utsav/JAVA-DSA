package step_3_SolveProblemsOnArrays;

import javax.swing.text.ViewFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L1_Q6_MoveZerosToLast {
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

        System.out.println("Before moving zeros to the right " + array_list);
        moveZerosToLastOptimized(array_list);
        System.out.println("After moving zeros to the right " + array_list);

        scanner.close();
    }

    public static void moveZerosToLastOptimized(List<Integer> array_list){
        int j = -1;
        while(j < array_list.size() - 1){
            if(array_list.get(++j) == 0) break;
        }
        if(j == -1) return;
        for(int i = j+1 ; i < array_list.size(); i++){
            if(array_list.get(i) != 0) Collections.swap(array_list, i , j++);
        }
    }

    // this function rearranged the order of the list so not VALID Solution
    public static void moveZerosToLast(List<Integer> array_list){
        int i = 0;
        int j = array_list.size() - 1;

        while(i < j){
            while(array_list.get(i) != 0) i++;
            while(array_list.get(j) == 0) j--;
            if(array_list.get(i) == 0) Collections.swap(array_list , i++ , j--);
        }
    }
}
