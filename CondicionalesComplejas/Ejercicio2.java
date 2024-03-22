package CondicionalesComplejas;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero = 123;
        int length = String.valueOf(numero).length();

        if (length < 4) {
            System.out.println("Tiene " + length + " Digitos");
        } else {
            System.out.println("Tiene mas de 5 digitos");
        }
    }
}
