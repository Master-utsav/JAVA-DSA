package step_3_SolveProblemsOnArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L2_Q6_StockBuyAndSell {
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

        int max_profit = maximumProfit(array_list);
        System.out.println("Maximum profit we can make as per the : " + array_list + " is : " + max_profit);
        scanner.close();
    }

    public static int maximumProfit(List<Integer> array_list){
        int max_profit = 0;
        int best_buy = array_list.getFirst();

        int profit;
        for(int i = 1; i < array_list.size(); i++){
            profit = array_list.get(i) - best_buy;
            max_profit = Integer.max(profit , max_profit);
            if(array_list.get(i) < best_buy) best_buy = array_list.get(i);
        }

        return max_profit;
    }
}
