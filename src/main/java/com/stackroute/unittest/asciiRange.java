package com.stackroute.unittest;

import java.util.Scanner;

public class asciiRange {

    void checkType(char userInput){
        if(userInput >= 48 && userInput <= 57)
            System.out.println(userInput + " is a Number.");
        else if(userInput >= 65 && userInput <= 96)
            System.out.println(userInput + " is a Capital Letter.");
        else if(userInput >= 97 && userInput <= 122)
            System.out.println(userInput + " is a Small Letter.");
        else
            System.out.println(userInput + " is a Symbol.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userInput = input.next().charAt(0);
        asciiRange a1 = new asciiRange();
        a1.checkType(userInput);
    }
}
