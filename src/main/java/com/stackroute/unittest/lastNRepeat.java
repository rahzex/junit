package com.stackroute.unittest;

import java.util.Scanner;

public class lastNRepeat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String:");
        String userInput = input.nextLine();
        System.out.println("Enter Number:");
        int num = input.nextInt();
        int i=0;
        System.out.print(userInput);
        while(i < num){
            System.out.print(userInput.substring(userInput.length() - num));
            i++;
        }

    }
}
