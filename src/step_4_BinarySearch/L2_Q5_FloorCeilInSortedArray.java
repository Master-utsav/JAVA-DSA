package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q5_FloorCeilInSortedArray {
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

        int floor_idx = floorValue(array_list, target); // floor value fxn just replace the >= to <=
        int floor_val = (floor_idx < 0 ? -1 : array_list.get(floor_idx));
        int ceil_idx = ceilValue(array_list, target); // ceil value is nothing but the value at lowerBound
        System.out.println(ceil_idx);
        int ceil_val = (ceil_idx >= array_list.size() ? -1 : array_list.get(ceil_idx));
        System.out.println("In an array : " + array_list + " floor value : " + floor_val + " and ceil value : " + ceil_val + " of target : " + target);

        scanner.close();
    }

    public static int ceilValue(List<Integer> array_list, int target) {
        int s = 0;
        int e = array_list.size() - 1;
        int idx = e + 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array_list.get(mid) >= target) {
                idx = mid;
                e = mid - 1;
            } else s = mid + 1;
        }
        return idx;
    }

    public static int floorValue(List<Integer> array_list, int target) {
        int s = 0;
        int e = array_list.size() - 1;
        int idx = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array_list.get(mid) <= target) {
                idx = mid;
                s = mid + 1;
            } else e = mid - 1;
        }
        return idx;
    }
}
