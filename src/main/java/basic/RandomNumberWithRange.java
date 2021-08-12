package basic;

import java.util.Scanner;

/*
4. Write a program to generate random numbers from minimum range to maximum range by user input
*/
public class RandomNumberWithRange {
    public static void main(String[] args) {
        int min, max;
        double randomNumber;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input value for Minimum Range=");
        min = sc.nextInt();
        System.out.println("Input value for Maximum Range=");
        max = sc.nextInt();

        randomNumber = (Math.random() * (max - min)) + min;
        System.out.println("Your Random Number is: "+randomNumber);

    }
}
