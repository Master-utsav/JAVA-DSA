package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q13_SpiralMatrix {
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

        List<Integer> spiral_array_list = new ArrayList<>(spiralMatrix(array_list));

        System.out.print("After rotating : [ ");
        for (Integer it : spiral_array_list){
            System.out.print(it + ", " );
        }
        System.out.println("]");

        scanner.close();
    }

    public static List<Integer> spiralMatrix(List<List<Integer>> array_list){
        List<Integer> spiral_list = new ArrayList<>();

        int rows = array_list.size();
        int cols = array_list.getFirst().size();

        int top = 0, bottom = rows - 1;
        int left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {

            // top row
            for (int col = left; col <= right; col++) {
                spiral_list.add(array_list.get(top).get(col));
            }
            top++;

            // right column
            for (int row = top; row <= bottom; row++) {
                spiral_list.add(array_list.get(row).get(right));
            }
            right--;

            // bottom row (check again to avoid duplicate row)
            if (top <= bottom) {
                for (int col = right; col >= left; col--) {
                    spiral_list.add(array_list.get(bottom).get(col));
                }
                bottom--;
            }

            // left column (check again to avoid duplicate col)
            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    spiral_list.add(array_list.get(row).get(left));
                }
                left++;
            }
        }

        return spiral_list;
    }
}
