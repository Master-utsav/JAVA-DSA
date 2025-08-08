package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q7_AlternatePositiveNegatives {
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

        System.out.println("Before Alternating : " + array_list);
//        List<Integer> new_list = new ArrayList<>(alternatePosNegsSameFreq(array_list));
        alternatePosNegsDifferentFreq(array_list);
        System.out.println("After Alternating : " + array_list);
        scanner.close();
    }

    public static List<Integer> alternatePosNegsSameFreq(List<Integer> array_list){
        List<Integer> new_list = new ArrayList<>(array_list);

        int even_ptr = 0; int odd_ptr = 1;

        for (Integer integer : array_list) {
            if (integer >= 0) {
                new_list.set(even_ptr, integer);
                even_ptr += 2;
            } else {
                new_list.set(odd_ptr, integer);
                odd_ptr += 2;
            }
        }
        return new_list;
    }

    public static void alternatePosNegsDifferentFreq(List<Integer> array_list){
        List<Integer> left_ls = new ArrayList<>();
        List<Integer> right_ls = new ArrayList<>();

        for(Integer el : array_list){
            if(el < 0) left_ls.add(el);
            else right_ls.add(el);
        }

        int left_ls_size = left_ls.size();
        int right_ls_size = right_ls.size();

        if(right_ls_size > left_ls_size){
            for(int i = 0; i < left_ls_size; i++){
                array_list.set(2*i , right_ls.get(i));
                array_list.set(2*i + 1 , left_ls.get(i));
            }
            for(int i = left_ls_size; i < right_ls_size; i++){
                array_list.set(left_ls_size + i , right_ls.get(i));
            }
        }
        else{
            for(int i = 0; i < right_ls_size; i++){
                array_list.set(2*i , right_ls.get(i));
                array_list.set(2*i + 1 , left_ls.get(i));
            }
            for(int i = right_ls_size; i < left_ls_size; i++){
                array_list.set(right_ls_size + i , left_ls.get(i));
            }
        }
    }
}
