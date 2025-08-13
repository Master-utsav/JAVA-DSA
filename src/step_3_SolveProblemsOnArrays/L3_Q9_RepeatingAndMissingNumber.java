package step_3_SolveProblemsOnArrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class L3_Q9_RepeatingAndMissingNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements of array : ");
        while (len != 0) {
            array_list.add(scanner.nextInt());
            len--;
        }

        List<Integer> ans = new ArrayList<>(findRepeatingAndMissingNumber(array_list));
        System.out.println("In an array : " + array_list + " missing element is : " + ans.getFirst() + " duplicate element is : " + ans.getLast());

        scanner.close();
    }

    public static List<Integer> findRepeatingAndMissingNumber(List<Integer> array_list) {
        int n = array_list.size();
        // x -> repeating element , y -> missing element

        int org_sum1 = n * ((n + 1) / 2);
        int org_sum2 = ((n * (n + 1)) / 2) * (2 * n + 1) / 3;
        int sum1 = 0;
        int sum2 = 0;
        for (Integer integer : array_list) {
            sum1 += integer;
            sum2 += integer * integer;
        }
        System.out.println(org_sum1 + " " + org_sum2);
        System.out.println(sum1 + " " + sum2);

        int eq_1 = org_sum1 - sum1; // -> equation - 1  = x - y
        int eq_2 = org_sum2 - sum2; // -> equation - 2 = (x - y)(x + y)
        eq_2 /= eq_1; // from equation - 1 we get equation - 2 = x + y

        int x = (eq_1 + eq_2) / 2; // solving equation 2 and 3 : 2x = eq1 + eq2
        int y = eq_2 - x; //  putting value of x in equation - 2;

        return new ArrayList<>(Arrays.asList(x, y));
    }

    public static List<Integer> findRepeatingAndMissingNumberUsingXOR(List<Integer> array_list) {
        return new ArrayList<>();
    }
}
