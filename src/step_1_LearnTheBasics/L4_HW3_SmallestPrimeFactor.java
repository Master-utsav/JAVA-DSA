package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class L4_HW3_SmallestPrimeFactor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of queries : ");
        int q = scanner.nextInt();
        int i = 0;

        List<Integer> queries = new ArrayList<>();
        int max_query = 0;

        while(q != i){
            System.out.print("Enter the number for SPF query no. " + (i+1) + " : ");
            int n = scanner.nextInt();
            max_query = Integer.max(max_query , n);
            queries.add(n);
            i++;
        }

        int[] spf_list = getSPF(max_query);
        for(int it : queries){
            int spf = spf_list[it];
            System.out.println("SPF of " + it + " is : " + spf);
        }
    }

    public static int[] getSPF(int max_query){
        int[] spf_list = new int[max_query + 1];
        for(int i = 0 ; i <= max_query ; i++){
            spf_list[i] = i;
        }

        for(int i = 2; i * i <= max_query ; i++){
            for(int j = i * i ; j <= max_query ; j += i){
                if(spf_list[j] == j) spf_list[j] = i;
            }
        }

        return spf_list;
    }
}
