package com.stackroute.unittest;

import java.util.Scanner;

public class checkVowelConso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        for(int i=0; i<userInput.length(); i++){
            if (userInput.charAt(i) >= 65 && userInput.charAt(i) <= 122){
                if(userInput.charAt(i) == 'A' || userInput.charAt(i) == 'E' || userInput.charAt(i) == 'I' || userInput.charAt(i) == 'O' || userInput.charAt(i) == 'U'){
                    System.out.print("Vowel ");
                }
                else if(userInput.charAt(i) == 'a' || userInput.charAt(i) == 'e' || userInput.charAt(i) == 'i' || userInput.charAt(i) == 'o' || userInput.charAt(i) == 'u'){
                    System.out.print("Vowel ");
                }
                else
                    System.out.print("Consonent ");
            }
            else {
                System.err.print(userInput.charAt(i)+" is not a letter! ");
            }
        }
    }
}
