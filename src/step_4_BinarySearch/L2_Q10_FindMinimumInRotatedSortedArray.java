package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class L2_Q10_FindMinimumInRotatedSortedArray {
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

        int min_element = minElementInARotatedArrayUnique(array_list);
        System.out.println("min_element : " + min_element + " in an array : " + array_list);

        scanner.close();
    }

    public static int minElementInARotatedArrayUnique(List<Integer> array_list){
        int s = 0;
        int e = array_list.size() - 1;
        int min_element = Integer.MAX_VALUE;

        while(s <= e){
            int mid = s + (e - s) / 2;

            if(array_list.get(s) <= array_list.get(e)) return Integer.min(min_element , array_list.get(s));

            // left part
            if(array_list.get(mid) >= array_list.get(s)){
                min_element = Integer.min(min_element , array_list.get(s));
                s = mid + 1;
            }
            else if(array_list.get(mid) <= array_list.get(e)) {
                min_element = Integer.min(min_element, array_list.get(mid));
                e = mid - 1;
            }
        }

        return min_element;
    }
}
