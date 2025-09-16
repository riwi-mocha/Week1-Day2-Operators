import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = sc.nextInt();

        boolean bothPositive = (num1 > 0 && num2 > 0);
        boolean oneGreaterThan100 = (num1 > 100 || num2 > 100);
        boolean notEqual = (num1 != num2);

        System.out.println("Ambos son positivos: " + bothPositive);
        System.out.println("Al menos uno es mayor que 100: " + oneGreaterThan100);
        System.out.println("El primero no es igual al segundo: " + notEqual);

        sc.close();
    }
}
