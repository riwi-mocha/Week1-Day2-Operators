import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int age = sc.nextInt();

        boolean isAdult = age >= 18;
        System.out.println(isAdult);

        sc.close();
    }
}
