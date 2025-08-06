package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L1_Q9_FindMissingElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the actually array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of an array : ");
        while (len != 1) {
            array_list.add(scanner.nextInt());
            len--;
        }

        int missing_element = findMissingElement(array_list);
        System.out.println("In the array : " + array_list + " missing element is : " + missing_element);

        scanner.close();
    }

    public static int findMissingElement(List<Integer> array_list){
        int n = array_list.size();
        int a = array_list.getFirst();
        int l = a + (n + 1 - 1);
        int sum = ((n + 1) * (a + l)) / 2;

        int array_sum = 0;

        for (Integer integer : array_list) {
            array_sum += integer;
        }

        return sum - array_sum;
    }
}
