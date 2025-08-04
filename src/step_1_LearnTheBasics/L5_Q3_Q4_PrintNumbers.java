package step_1_LearnTheBasics;

import java.util.Scanner;

public class L5_Q3_Q4_PrintNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num = scanner.nextInt();

        System.out.print("Reverse Print : ");
        PrintNumToOne(num);
        System.out.println();
        System.out.print("Normal Print : ");
        PrintOneToNum(num);
    }

    public static void PrintOneToNum(int num){
        if(num == 0) return;
        PrintOneToNum(num - 1);
        System.out.print(num + " ");
    }

    public static void PrintNumToOne(int num){
        if(num == 0) return;
        System.out.print(num + " ");
        PrintNumToOne(num - 1);
    }
}
