package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L3_Q4_4Sum {
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

        System.out.print("Enter the target value : " );
        int target = scanner.nextInt();

        List<List<Integer>> quadruplets_list = new ArrayList<>(quadrupletSumIsZero(array_list, target));
        System.out.println("quadruplets Elements in an array : " + array_list + " whose sum is zero are : " + quadruplets_list);

        scanner.close();
    }

//    **********OUTPUT***************
//    Enter the length of array : 6
//    Enter the elements of an array : 1 0 -1 0 -2 2
//    Enter the target value : 0
//    quadruplets Elements in an array : [-2, -1, 0, 0, 1, 2] whose sum is zero are : [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
//    Enter the length of array : 10
//    Enter the elements of an array : 4 3 3 4 4 2 1 2 1 1
//    Enter the target value : 9
//    quadruplets Elements in an array : [1, 1, 1, 2, 2, 3, 3, 4, 4, 4] whose sum is zero are : [[1, 1, 3, 4], [1, 2, 2, 4], [1, 2, 3, 3]]

    public static List<List<Integer>> quadrupletSumIsZero(List<Integer> array_list, int target) {
        List<List<Integer>> quadruplet_list = new ArrayList<>();
        Collections.sort(array_list);

        for (int i = 0; i < array_list.size(); i++) {
            // skipping i duplicate
            if (i > 0 && Objects.equals(array_list.get(i), array_list.get(i - 1))) continue;
            for (int j = i + 1; j < array_list.size(); j++) {
                // skipping j duplicate
                if (j > i + 1 && Objects.equals(array_list.get(j), array_list.get(j - 1))) continue;
                int k = j + 1;
                int l = array_list.size() - 1;

                while (k < l) {
                    int sum = array_list.get(i) + array_list.get(j) + array_list.get(k) + array_list.get(l);
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>(Arrays.asList(array_list.get(i), array_list.get(j), array_list.get(k), array_list.get(l)));
                        quadruplet_list.add(temp);
                        k++;
                        l--;

                        // skipping k duplicate
                        while (k < l && Objects.equals(array_list.get(k), array_list.get(k - 1))) k++;
                        // skipping k duplicate
                        while (k < l && Objects.equals(array_list.get(l), array_list.get(l + 1))) l--;
                    } else if (sum > target) l--;
                    else k++;
                }
            }
        }

        return quadruplet_list;
    }
}
