package Operators;

import java.util.Scanner;

public class logic {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another integer number: ");
        int b = scanner.nextInt();

        if(a>=0 && b>=0){
            System.out.println("Both numbers are positive");
        } else {
            System.out.println("At least one of the numbers is negative");
        }

        if(a != b){
            System.out.println("The numbers are different");
        } else {
            System.out.println("The numbers are equal");
        }

        if(a > 100 || b > 100){
            System.out.println("At least one of the numbers is greater than 100");
        } else {
            System.out.println("Neither of the numbers is greater than 100");
        }

        scanner.close();
    }
}
