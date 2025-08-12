package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L3_Q2_MajorityElementII {
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

        List<Integer> majority_element = new ArrayList<>(majorityElementII(array_list));
        System.out.println("Majority Elements in an array : " + array_list + " is : " + majority_element);

        scanner.close();
    }

    public static List<Integer> majorityElementII(List<Integer> array_list){
        List<Integer> maj_list = new ArrayList<>();

        int cnt_0 = 0; int cnt_1 = 0;
        int ele_0 = Integer.MIN_VALUE; int ele_1 = Integer.MIN_VALUE;

        for (Integer integer : array_list) {
            if (cnt_0 == 0 && integer != ele_1){
                cnt_0 = 1;
                ele_0 = integer;
            }
            else if (cnt_1 == 0 && integer != ele_0){
                cnt_1 = 1;
                ele_1 = integer;
            }
            else if (ele_0 == integer) cnt_0++;
            else if (ele_1 == integer) cnt_1++;
            else {
                cnt_0--;
                cnt_1--;
            }
        }

        int count_ele_1 = 0;
        int count_ele_0 = 0;
        for (Integer integer : array_list) {
            if (ele_1 == integer) count_ele_1++;
            else if (ele_0 == integer) count_ele_0++;
        }

        int n = (int) Math.floor((double) array_list.size() /3);
        if(count_ele_0 > n) maj_list.add(ele_0);
        if(count_ele_1 > n) maj_list.add(ele_1);

        return maj_list;
    }
}
