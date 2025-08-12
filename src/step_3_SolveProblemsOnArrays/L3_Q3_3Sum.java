package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L3_Q3_3Sum {
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

        List<List<Integer>> triplets_list = new ArrayList<>(tripletSumIsZero(array_list));
        System.out.println("triplets Elements in an array : " + array_list + " whose sum is zero are : " + triplets_list);

        scanner.close();
    }

    // two pointers
    public static List<List<Integer>> tripletSumIsZero(List<Integer> array_list){
        List<List<Integer>> triplet_list = new ArrayList<>();
        Collections.sort(array_list);

        for(int i = 0; i < array_list.size(); i++) {
            int j = i + 1;
            int k = array_list.size() - 1;

            // skip duplicates for i
            if (i > 0 && array_list.get(i).equals(array_list.get(i - 1))) continue;

            while (j < k) {
                int sum = array_list.get(i) + array_list.get(j) + array_list.get(k);
                if (sum == 0) {
                    triplet_list.add(Arrays.asList(array_list.get(i), array_list.get(j), array_list.get(k)));
                    j++; k--;
                    // skip duplicates for j
                    while (j < k && array_list.get(j).equals(array_list.get(j - 1))) j++;
                    // skip duplicates for k
                    while (j < k && array_list.get(k).equals(array_list.get(k + 1))) k--;
                }
                else if (sum < 0) j++;
                else k--;
            }
        }
        return triplet_list;
    }
}
