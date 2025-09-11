package Operators;

import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if(age >= 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        scanner.close();

    }
}

