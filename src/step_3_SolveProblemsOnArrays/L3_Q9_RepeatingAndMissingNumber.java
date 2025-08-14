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

        List<Integer> ans = new ArrayList<>(findRepeatingAndMissingNumberUsingXOR(array_list));
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
        int xr = 0;
        for (int i = 0; i < array_list.size(); i++) {
            xr ^= array_list.get(i);
            xr ^= i + 1;
        }

        // rightmost bit position
        int position = 1;
        while ((xr & 1 << position) == 0) {
            position++;
        }

        // else we can find the number which has the rightmost bit as one on that position
        // so that we just have AND that with the number
        int number = xr & -xr; // ~(xr - 1) == -xr

        int one_xr = 0; // missing element
        int zero_xr = 0; // duplicate element

        for (Integer integer : array_list) {
            //  if ((integer & (1 << position)) != 0) one_xr ^= integer;
            // instead of left shift 1 two that position and then AND we can now direct end with thet number
            if((integer & number) != 0) one_xr ^= integer;
            else zero_xr ^= integer;
        }
        for (int i = 1; i <= array_list.size(); i++) {
            // if ((i & (1 << position)) != 0) one_xr ^= i;
            // instead of left shift 1 two that position and then AND we can now direct end with thet number
            if((i & number) != 0) one_xr ^= i;
            else zero_xr ^= i;
        }

        int cnt = 0;
        for (Integer integer : array_list){
            if(zero_xr == integer) cnt++;
        }

        if(cnt == 2) return new ArrayList<>(Arrays.asList(one_xr , zero_xr));
        else return new ArrayList<>(Arrays.asList(zero_xr , one_xr));
    }
}
