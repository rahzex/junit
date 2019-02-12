package com.stackroute.unittest;

import java.util.Scanner;

public class conditionTomJerry {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if(number >= 20 && number <= 30){
            if(number%2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }
    }
}
