package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L2_Q9_LeadersInAnArray {
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

        List<Integer> leaders = new ArrayList<>(leaderInAnArray(array_list));
        System.out.println("Leaders in an array : " + array_list + " is : " + leaders);
        scanner.close();
    }

    public static List<Integer> leaderInAnArray(List<Integer> array_list) {
        List<Integer> leaders_list = new ArrayList<>();

        for (int i = array_list.size() - 1; i >= 0; i--) {
            if (leaders_list.isEmpty() || leaders_list.getLast() < array_list.get(i))
                leaders_list.add(array_list.get(i));
        }
        Collections.reverse(leaders_list);
        return leaders_list;
    }


}
