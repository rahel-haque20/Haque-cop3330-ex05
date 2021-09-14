/*
* UCF COP 3330 Fall 2021 Assignment 5 Solution
* Copyright 2021 Rahel Haque
 */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner math = new Scanner(System.in);
        System.out.println("What is the first number?");
        String string1 = math.nextLine();
        System.out.println("What is the second number?");
        String string2 = math.nextLine();

        int x = Integer.parseInt(string1);
        int y = Integer.parseInt(string2);

        int add = x+y;
        int subtract = x-y;
        int multiply = x*y;
        int divide = x/y;

        System.out.printf("%d + %d = %d%n%d - %d = %d%n%d * %d = %d%n%d / %d = %d", x, y, add, x, y, subtract, x, y, multiply, x, y, divide);
    }
}