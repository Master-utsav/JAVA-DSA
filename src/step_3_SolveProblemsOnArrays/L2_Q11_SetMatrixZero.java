package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Arrays;
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

        setMatrixZeroOptimal(array_list);

        System.out.println("After setting : ");
        for (List<Integer> it : array_list){
            System.out.println(it);
        }

        scanner.close();
    }

    // brute force
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

    // better
    public static void setMatrixZeroBetter(List<List<Integer>> array_list){
        int rows = array_list.size();
        int cols = array_list.getFirst().size();

        int[] row_list = new int[rows];
        int[] col_list = new int[cols];
        Arrays.fill(row_list, 0);
        Arrays.fill(col_list, 0);

        for(int i = 0; i < rows ; i++){
            for(int j = 0; j < cols; j++){
                if (array_list.get(i).get(j) == 0) {
                    row_list[i] = 1;
                    col_list[j] = 1;
                }
            }
        }

        for(int i = 0; i < rows ; i++){
            for(int j = 0; j < cols; j++){
                if (row_list[i] == 1 || col_list[j] == 1) array_list.get(i).set(j , 0);
            }
        }
    }

    // optimal one
    public static void setMatrixZeroOptimal(List<List<Integer>> array_list){
        // col -> mat[0][..]
        // row -> mat[..][0]

        int rows = array_list.size();
        int cols = array_list.getFirst().size();

        int col_0 = 1;

        // set the row[0] and the col[0] with the col_0 separate block because it appears in both rows and cols
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(array_list.get(i).get(j) == 0){
                    // i-th row
                    array_list.get(i).set(0 , 0);
                    // j-th col
                    if(j != 0) array_list.getFirst().set(j , 0);
                    else col_0 = 0;
                }
            }
        }
        // now set the zeros in the matrix accept the 1st row and col
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(array_list.getFirst().get(j) == 0 || array_list.get(i).getFirst() == 0){
                    array_list.get(i).set(j , 0);
                }
            }
        }

        // now update the row -> matrix[.][0] which depend on matrix[0][0] == 0
        if(array_list.getFirst().getFirst() == 0){
            for(int i = 0; i < rows; i++){
                array_list.get(i).set(0 , 0);
            }
        }

        // now time for update col -> matrix[0][.] which depends on col_0
        if(col_0 == 0){
            for(int i = 0; i < cols; i++){
                array_list.getFirst().set(i , 0);
            }
        }

    }
}
