package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q3_UpperBound {
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

        System.out.print("Enter the target element : ");
        int target = scanner.nextInt();

        int idx = upperBoundIndex(array_list, target);
        System.out.println("Upper Bound index in the array " + array_list + " is : " + idx);

        scanner.close();
    }

    public static int upperBoundIndex(List<Integer> array_list, int target){
        int s = 0;
        int e = array_list.size() - 1;
        int idx = e + 1;

        while(s <= e) {
            int mid = s + (e - s) / 2;
            if (array_list.get(mid) > target) {
                idx = mid;
                e = mid - 1;
            }
            else s = mid + 1;
        }
        return idx;
    }
}
