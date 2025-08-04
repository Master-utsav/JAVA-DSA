package step_1_LearnTheBasics;

import java.util.*;

public class L6_Q1_Q2_HighLowFreqOfArrayElements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        HashMap<Integer , Integer> freq_map = new HashMap<>();
        List<Integer> array_list = new ArrayList<>();
        System.out.print("Enter the elements : ");
        while(len != 0){
            int val = scanner.nextInt();
            array_list.add(val);
            freq_map.put(val , freq_map.getOrDefault(val , 0) + 1);
            len--;
        }

        Collection<Integer> freq_list = freq_map.values();
        int max = Collections.max(freq_list);
        int min = Collections.min(freq_list);
        int max_num = 0, min_num = 0;

        for (Map.Entry<Integer, Integer> entry : freq_map.entrySet()) {
            if (entry.getValue().equals(max) && max_num == 0) max_num = entry.getKey();
            if(entry.getValue().equals(min) && min_num == 0) min_num = entry.getKey();
        }

        System.out.println("From the given array : " + array_list);
        System.out.println("Most frequently occur element is : " + max_num);
        System.out.println("Least frequently occur element is : " + min_num);

        scanner.close();
    }
}
