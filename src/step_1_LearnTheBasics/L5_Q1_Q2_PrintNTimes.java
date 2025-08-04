package step_1_LearnTheBasics;

public class L5_Q1_Q2_PrintNTimes {
    public static void main(String[] args){
        printNTimes(5);
    }
    public static void printNTimes(int num){
        if(num == 0) return;
        System.out.println("Hey i am utsav");
        printNTimes(num - 1);
    }
}

