package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q12_RotateMatrix90Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows of array : ");
        int rows_len = scanner.nextInt();
        System.out.print("Enter the no. of cols of array : ");
        int cols_len = scanner.nextInt();

        List<List<Integer>> array_list = new ArrayList<>();
        while(rows_len != 0){
            System.out.print("Enter the elements for row : ");
            int col = cols_len;
            List<Integer> temp = new ArrayList<>();
            while(col != 0){
                int val = scanner.nextInt();
                temp.add(val);
                col--;
            }
            rows_len--;
            array_list.add(temp);
        }

        System.out.println("Before rotating : ");
        for (List<Integer> it : array_list){
            System.out.println(it);
        }

        rotateMatrix90Degree(array_list);

        System.out.println("After rotating : ");
        for (List<Integer> it : array_list){
            System.out.println(it);
        }

        scanner.close();
    }

    public static void rotateMatrix90Degree(List<List<Integer>> array_list){
        int rows = array_list.size();
        int cols = array_list.getFirst().size();

        for(int i = 0; i < rows; i++){
            for(int j = i ; j < cols ; j++){
                int temp = array_list.get(i).get(j);
                array_list.get(i).set(j, array_list.get(j).get(i));
                array_list.get(j).set(i, temp);
            }
        }

        int left_col_ptr = 0;
        int right_col_ptr = cols - 1;

        while (left_col_ptr < right_col_ptr){
            int row_count = 0;
            while(row_count < rows){
                int temp = array_list.get(row_count).get(left_col_ptr);
                array_list.get(row_count).set(left_col_ptr, array_list.get(row_count).get(right_col_ptr));
                array_list.get(row_count).set(right_col_ptr, temp);
                row_count++;
            }
            left_col_ptr++;
            right_col_ptr--;
        }

    }
}
