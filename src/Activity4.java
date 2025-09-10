import java.util.Scanner;

public class Activity4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        int integer1 = scanner.nextInt();

        System.out.print("Ingrese otro número entero: ");
        int integer2 = scanner.nextInt();

        if(integer1>=0 && integer2>=0){
            System.out.println("Ambos números son positivos");
        } else {
            System.out.println("Al menos uno de los números es negativo");
        }

        if(integer1 > 100 || integer2 > 100){
            System.out.println("Al menos uno de los números es mayor que 100");
        } else {
            System.out.println("Ninguno de los números es mayor que 100");
        }

        if(integer1 != integer2){
            System.out.println("Los números son diferentes");
        } else {
            System.out.println("Los números son iguales");
        }


        scanner.close();
    }
}
