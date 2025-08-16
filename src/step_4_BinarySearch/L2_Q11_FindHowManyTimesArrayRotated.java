package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q11_FindHowManyTimesArrayRotated {
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

        int k = valueOfK(array_list);
        System.out.println("array : " + array_list + " is rotated : " + k + " times");

        scanner.close();
    }

    public static int valueOfK(List<Integer> array_list){
        int s = 0;
        int e = array_list.size() - 1;
        int min_element = Integer.MAX_VALUE;
        int k = -1;

        while(s <= e){
            int mid = s + (e - s) / 2;
            if(array_list.get(s) <= array_list.get(e)){
                if(min_element > array_list.get(s)){
                    k = s;
                    return k;
                }
            }

            // left part
            if(array_list.get(mid) >= array_list.get(s)){
                if(min_element > array_list.get(s)){
                    k = s;
                    min_element = array_list.get(s);
                }
                s = mid + 1;
            }
            else if(array_list.get(mid) <= array_list.get(e)) {
                if(min_element > array_list.get(mid)){
                    k = mid;
                    min_element = array_list.get(mid);
                }
                e = mid - 1;
            }
        }
        return k;
    }
}
