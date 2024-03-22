package CondicionalesComplejas;

public class Ejercicio3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 6;

        if (num1 > num2 & num1 > num3) {
            System.out.println("Numero 1 es mayor");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("Numero 2 es mayor");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("Numero 3 es mayor");
        }
    }
}
