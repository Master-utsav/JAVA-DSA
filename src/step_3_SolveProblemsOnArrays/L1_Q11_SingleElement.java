package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q11_SingleElement {
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

        int single_element = singleElementOnAnArray(array_list);
        System.out.println("Unique Element in an array : " + array_list + " is : " + single_element);

        scanner.close();
    }

    public static int singleElementOnAnArray(List<Integer> array_list){
        int ans = array_list.getFirst();
        for(int i = 1 ; i < array_list.size() ; i++){
            ans ^= array_list.get(i);
        }
        return ans;
    }

//    **********OUTPUT************
//    Enter the length of array : 11
//    Enter the elements of an array : 1 1 2 2 3 3 4 5 5 6 6
//    Unique Element in an array : [1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6] is : 4
}
