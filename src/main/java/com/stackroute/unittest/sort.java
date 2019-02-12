package com.stackroute.unittest;

import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        char[] sortedArray = number.toCharArray();
        int sum = 0,even;
        for(int i=0; i<sortedArray.length; i++){
            even = Integer.parseInt(String.valueOf(sortedArray[i]));
            if(even%2 == 0){
                sum = sum + even;
            }
        }
        for(int i=0; i<sortedArray.length; i++){

            for (int j=i+1; j<sortedArray.length; j++){
                if(sortedArray[i] > sortedArray[j] ){
                    char temp = sortedArray[i];
                    sortedArray[i] = sortedArray[j];
                    sortedArray[j] = temp;
                }
            }
        }

        System.out.print("Sorted Array in non-increasing order: ");
        System.out.println(sortedArray);

        if(sum > 15)
            System.out.println("Sum of even numbers: "+sum+"\n True");
        else
            System.out.println("Sum of even numbers: "+sum+"\n False");
    }
}
