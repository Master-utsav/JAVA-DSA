package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class L2_Q9_SearchInRotatedArrayII {
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

        int index = targetIdxInRotatedArrayDuplicates(array_list, target);
        System.out.println("Target : " + target + " found at : " + index + " in an array : " + array_list);

        scanner.close();
    }

    public static int targetIdxInRotatedArrayDuplicates(List<Integer> array_list , int target){
        int s = 0;
        int e = array_list.size() - 1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(array_list.get(mid) == target) return mid;

            // extra condition if arr[s] == arr[mid] && arr[mid] == arr[e] so we have to shrink the search space
            if(Objects.equals(array_list.get(s), array_list.get(mid)) && Objects.equals(array_list.get(mid), array_list.get(e))){
                s++;
                e--;
            }
            //left sorted part
            if(array_list.get(mid) >= array_list.get(s)){
                if(array_list.get(s) <= target && target <= array_list.get(mid)) e = mid -1;
                else s = mid + 1;
            }
            // right sorted
            else if(array_list.get(mid) <= array_list.get(e)) {
                if (array_list.get(mid) <= target && target <= array_list.get(e)) s = mid + 1;
                else e = mid - 1;
            }
        }

        return -1;
    }
}
