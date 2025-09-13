import java.util.Scanner;

public class operators{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int integer1 = 15;
        int integer2 = 5;

        int sum = integer1 + integer2;
        System.out.println("The sum is: " + sum);

        int difference = integer1 - integer2;
        System.out.println("The difference is: " + difference);

        int product = integer1 * integer2;
        System.out.println("The product is: " + product);

        double division = (double) integer1 / integer2;
        System.out.println("The division is: " + division);

        int modulus = integer1 % integer2;
        System.out.println("The modulus is: " + modulus);

        // User Age

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        // Numbers
        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();

        boolean bothPositive = number1 > 0 && number2 > 0;
        System.out.println("Both numbers are positive (&&): " + bothPositive);

        boolean atLeastOneGreaterThan100 = number1 > 100 || number2 > 100;
        System.out.println("At least one is greater than 100 (||): " + atLeastOneGreaterThan100);

        boolean notEqual = !(number1 == number2);
        System.out.println("First is not equal to second (!): " + notEqual);

        scanner.close();

    }

    

}