package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String input = getInput("Enter a string: ");
        String output = "";
        int count = 1;
        char current = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == current) {
                count++;
            } else {
                output += count + "" + current;
                count = 1;
                current = input.charAt(i);
            }
        }
        output += count + "" + current;
        System.out.println(output);
    }
    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();

    }
}
