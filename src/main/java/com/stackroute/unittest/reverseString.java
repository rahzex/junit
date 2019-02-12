package com.stackroute.unittest;

import java.util.Scanner;

public class reverseString {

    String reverse(String userInput){
        char[] userCharInput = userInput.toCharArray();
        for(int i=0; i < userInput.length()/2; i++){
            char tmp = userCharInput[i];
            userCharInput[i] = userCharInput[userCharInput.length - 1 - i];
            userCharInput[userCharInput.length -1 - i] = tmp;
        }
        return String.valueOf(userCharInput);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        reverseString r1 = new reverseString();
        System.out.println(r1.reverse(userInput));
    }
}
