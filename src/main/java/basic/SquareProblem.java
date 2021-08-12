package basic;

import java.util.Scanner;

/*
5. Write a program to solve (a+b)^2 by taking input a and b from the user [^2 means whole square]
*/
public class SquareProblem {
    public static void main(String[] args) {
        int a, b, sum;
        double result;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input value for a=");
        a = sc.nextInt();

        System.out.println("Input value for b=");
        b = sc.nextInt();

        sum = a+b;
        result = Math.pow(sum,2);
        System.out.println("Result: "+result);
    }
}
