package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L1_Q4_RemoveDuplicatesFromSortedArray {
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

        System.out.println("Before removing duplicates: " + array_list);
        removeDuplicates(array_list);
        System.out.println("After removing duplicates: " + array_list);

        scanner.close();
    }

    public static void removeDuplicates(List<Integer> array_list){
        if (array_list.isEmpty()) return;

        int j = 0;
        for(int i = 0; i < array_list.size() -1 ; i++){
            if(!Objects.equals(array_list.get(i), array_list.get(i + 1))) array_list.set(++j , array_list.get(i+1));
        }

        while(array_list.size() > j+1){
            array_list.removeLast();
        }

    }
}
