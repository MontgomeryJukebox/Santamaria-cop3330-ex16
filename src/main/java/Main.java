/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age?");
        int age = in.nextInt();
        String output;
        if (age < 16) {
            output = "You are not old enough to legally drive.";
        } else {
            output = "You are old enough to legally drive.";
        }
        System.out.print(output);
    }
}
