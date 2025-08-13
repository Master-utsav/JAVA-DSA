package step_3_SolveProblemsOnArrays;

import java.util.*;

public class L3_Q6_CountSubArrayWithXORK {
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

        System.out.print("Enter the value of xor as k : ");
        int k = scanner.nextInt();

        int sub_array_list = countSubArrayWithXORK(array_list , k);
        System.out.println("Total count of subArray whose xor's is  " + k + " in a : " + array_list + " is : " + sub_array_list);
        scanner.close();
    }

//    ********************OUTPUT***********************
//    Enter the length of array : 5
//    Enter the elements of an array : 4 2 2 6 4
//    Enter the value of xor as k : 6
//    Total count of subArray whose xor's is  6 in a : [4, 2, 2, 6, 4] is : 4

    public static int countSubArrayWithXORK(List<Integer> array_list, int k){
        int count = 0;
        int xr = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(xr , 1); // {0=1}

        for (Integer integer : array_list) {
            xr ^= integer;
            int remain = xr ^ k;
            count += map.getOrDefault(remain, 0);
            map.put(xr, map.getOrDefault(xr, 0) + 1);
        }

        return count;
    }
}
