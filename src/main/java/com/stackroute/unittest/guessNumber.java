package com.stackroute.unittest;

import java.util.Scanner;

public class guessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 1 - 100: ");
        int number = input.nextInt();
        int guess;
        boolean guessed = false;
        while(!guessed){
            System.out.println("Enter Your Guess: ");
            guess = input.nextInt();
            if(guess>number)
                System.out.println("Number guessed is more than original number\n");
            else if(guess<number)
                System.out.println("Number guessed is less than original number\n");
            else if(guess == number){
                System.out.println("Congratulations! Number guessed is same as original number");
                guessed = true;
            }
        }
    }
}
