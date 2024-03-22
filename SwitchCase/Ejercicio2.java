package SwitchCase;
import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("Escoja una operacion aritmetica");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        opcion = sc.nextInt();

        System.out.println("Dame el primer numero entero");
        num1 = sc.nextInt();

        System.out.println("Dame el segundo numero entero");
        num2 = sc.nextInt();

        switch (opcion) {
            case 1:
                int sum = (num1 + num2);
                System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sum);
                break;
            case 2:
                int rest = (num1 - num2);
                System.out.println("La resta de " + num1 + " y " + num2 + " es: " + rest);
                break;
            case 3:
                int mult = (num1 * num2);
                System.out.println("La multiplicacion de " + num1 + " por " + num2 + " es: " + mult);
                break;
            case 4:
                int div = (num1 / num2);
                System.out.println("El cociente de " + num1 + " entre " + num2 + " es: " + div);
                break;
            default:
                System.out.println("Opcion no disponible");
                break;
        }
    }
}