package step_4_BinarySearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class L2_Q12_SingleElementInSortedArray {
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

        int element = singleNonRepeatingElement(array_list);
        System.out.println("in a array : " + array_list + " single non-repeating element is : " + element);

        scanner.close();
    }

    public static int singleNonRepeatingElement(List<Integer> array_list){
        int s = 0;
        int e = array_list.size() - 1;

        while(s < e){
            int mid = s + (e - s) / 2;
            if((mid % 2) == 1) mid--;
            if(Objects.equals(array_list.get(mid), array_list.get(mid + 1))) s = mid + 2;
            else e = mid;
        }
        return array_list.get(s);
    }
}
