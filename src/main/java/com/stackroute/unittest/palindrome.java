package com.stackroute.unittest;

import java.util.Scanner;

public class palindrome {

    static boolean checkPalindrome(String userInput){
        String reversedInput = new StringBuffer(userInput).reverse().toString();
        if (userInput.equals(reversedInput))
            return true;
        else
            return false;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number:");
        String userString = input.nextLine();
        if(checkPalindrome(userString)) {
            long sum =0;
            long number = Long.parseLong(userString);
            while(number != 0){
                long rem = 0;
                rem = number % 10;
                number = number / 10;
                if(rem%2 == 0)
                    sum += rem;
            }
            if(sum>25)
                System.out.println("This is Palindrome and sum of even numbers is greater than 25");
            else
                System.out.println("This is Palindrome and sum of even numbers is less than 25");
        }
        else
            System.out.println("Not Palindrome");
    }
}
