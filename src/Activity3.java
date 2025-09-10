import java.util.Scanner;

public class Activity3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if(edad >= 18) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}
