package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L3_Q7_MergeIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of rows of array : ");
        int rows_len = scanner.nextInt();
        System.out.print("Enter the no. of cols of array : ");
        int cols_len = scanner.nextInt();

        List<List<Integer>> array_list = new ArrayList<>();
        while (rows_len != 0) {
            System.out.print("Enter the elements for row : ");
            int col = cols_len;
            List<Integer> temp = new ArrayList<>();
            while (col != 0) {
                int val = scanner.nextInt();
                temp.add(val);
                col--;
            }
            rows_len--;
            array_list.add(temp);
        }

        System.out.println("Before merging : ");
        for (List<Integer> it : array_list) {
            System.out.println(it);
        }

        List<List<Integer>> merge_list = new ArrayList<>(mergeIntervals(array_list));
        System.out.println("After merging : " + merge_list);

        scanner.close();
    }

//    public static void mergeIntervalsBruteForce(List<List<Integer>> array_list){
//        array_list.sort(Comparator.comparingInt(List::getFirst));
//
//        List<Integer> ls_left = new ArrayList<>();
//        List<Integer> ls_right = new ArrayList<>();
//        for (List<Integer> integerList : array_list) {
//            ls_left.add(integerList.getFirst());
//        }
//        for (List<Integer> integers : array_list) {
//            ls_right.add(integers.getLast());
//        }
//
//        int i = 0;
//        while (i < array_list.size()){
//            while(i < array_list.size() && ls_right.get(i) == Integer.MAX_VALUE) i++;
//            int j = i + 1;
//            while(j < array_list.size() && ls_right.get(i) >= ls_left.get(j)) j++;
//            if(j != i + 1){
//                j--;
//                ls_right.set(i , Integer.max(ls_right.get(i) , ls_right.get(j)));
//                ls_right.set(j , Integer.MAX_VALUE);
//                ls_left.set(j , Integer.MAX_VALUE);
//            }
//            i++;
//        }
//        System.out.println(ls_left);
//        System.out.println(ls_right);
//
//        array_list.clear();
//
//        int k = 0;
//        while(k < ls_left.size()){
//            List<Integer> temp = new ArrayList<>();
//            if(ls_left.get(k) != Integer.MAX_VALUE && ls_right.get(k) != Integer.MAX_VALUE){
//                temp.add(ls_left.get(k));
//                temp.add(ls_right.get(k));
//                array_list.add(temp);
//            }
//            k++;
//        }
//    }

    public static List<List<Integer>> mergeIntervals(List<List<Integer>> array_list) {
        array_list.sort(Comparator.comparingInt(List::getFirst));
        List<List<Integer>> merge_list = new ArrayList<>();

        for (List<Integer> ls : array_list) {
            if (merge_list.isEmpty() || merge_list.getLast().getLast() < ls.getFirst())
                merge_list.add(new ArrayList<>(ls));
            else merge_list.getLast().set(1, Math.max(merge_list.getLast().getLast(), ls.getLast()));
        }

        return merge_list;
    }

}
