package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q11_SetMatrixZero {
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

        System.out.println("Before setting : ");
        for (List<Integer> it : array_list){
            System.out.println(it);
        }

        setMatrixZero(array_list);

        System.out.println("After setting : ");
        for (List<Integer> it : array_list){
            System.out.println(it);
        }

        scanner.close();
    }

    public static void setMatrixZero(List<List<Integer>> array_list){
        int rows = array_list.size();
        int cols = array_list.getFirst().size();
        List<Integer> zero_idx = new ArrayList<>();

        for(int i = 0; i < cols * rows; i++){
            int row = i / cols;
            int col = i % cols;
            if(array_list.get(row).get(col) == 0) zero_idx.add(i);
        }

        for (Integer zeroIdx : zero_idx) {
            int row = zeroIdx / cols;
            int col = zeroIdx % cols;

            for (int j = 0; j < cols; j++) {
                array_list.get(row).set(j, 0);
            }
            for (int j = 0; j < rows; j++) {
                array_list.get(j).set(col, 0);
            }
        }
    }
}
