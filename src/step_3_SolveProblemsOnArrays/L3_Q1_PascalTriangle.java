package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L3_Q1_PascalTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row no : ");
        int num_rows = scanner.nextInt();
        System.out.print("Enter the col no : ");
        int num_cols = scanner.nextInt();

        int element = pascalValueAtRowCol(num_rows, num_cols);
        System.out.println("Element at row -> " + num_rows + " col -> " + num_cols + " is : " + element);
        List<Integer> pascal_list = new ArrayList<>(pascalListAtRow(num_rows));
        System.out.println("At row -> " + num_rows + " pascal elements are : " + pascal_list);
        List<List<Integer>> pascal_triangle = new ArrayList<>(pascalsTriangle(num_rows));
        for(List<Integer> it : pascal_triangle) {
            System.out.println(it);
        }

        scanner.close();
    }

    // q-1 find the element from the pascal triangle as per the col and row position
    public static int pascalValueAtRowCol(int row , int col){
        // nCr -> n!/n!*(n-r)!
        int element = 1;
        int row_idx = row - 1;
        int col_idx = col - 1;

        // nCr = nCr-1
        if(row_idx - col_idx < col_idx) col_idx = row_idx - col_idx;

        for(int i = 0 ; i < col_idx; i++){
            element *= (row_idx - i);
            element /= (i + 1);
        }
        return element;
    }

    public static List<Integer> pascalListAtRow(int row){
        int cols = row - 1; // 0 based index
        int val = 1;

        List<Integer> pascal_list = new ArrayList<>();
        pascal_list.add(1);
        for(int i = 1; i <= cols; i++){
            val *= row - i;
            val /= i;
            pascal_list.add(val);
        }

        return pascal_list;
    }

    public static List<List<Integer>> pascalsTriangle(int num_rows){
        List<List<Integer>> pascal_list  = new ArrayList<>();

        for(int i = 1; i <= num_rows; i++){
            pascal_list.add(new ArrayList<>(pascalListAtRow(i)));
        }
        return  pascal_list;
    }
}
