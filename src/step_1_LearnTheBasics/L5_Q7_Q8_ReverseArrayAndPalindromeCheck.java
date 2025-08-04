package step_1_LearnTheBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class L5_Q7_Q8_ReverseArrayAndPalindromeCheck {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int len = scanner.nextInt();

        List<Integer> nums = new ArrayList<>();
        System.out.print("Enter the elements : ");
        while(len != 0){
            nums.add(scanner.nextInt());
            len--;
        }
        scanner.nextLine();

        System.out.println("Before reverse : " + nums);
        nums = reverseArray(nums , 0);
        System.out.println("After reverse : " + nums);

        System.out.print("Enter the palindromic string : ");
        String str = scanner.nextLine();
        boolean check_palindrome = checkStringPalindrome(str.trim() , 0);
        if(check_palindrome) System.out.println("String " + str + " is a palindrome");
        else System.out.println("String " + str + " is not a palindrome");

        scanner.close();
    }

    public static List<Integer> reverseArray(List<Integer> nums , int i){
        if(i > nums.size()/2) return nums;
        Collections.swap(nums, i, nums.size() - i - 1);
        return reverseArray(nums , i+1);
    }

    public static boolean checkStringPalindrome(String str, int i){
        if(i >= str.length()/2) return true;
        if(str.charAt(i) != str.charAt(str.length() - i - 1)) return false;
        return checkStringPalindrome(str , i + 1);
    }
}
