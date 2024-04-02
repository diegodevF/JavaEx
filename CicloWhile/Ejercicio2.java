package CicloWhile;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una palabra
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        // Determinar si la palabra es palíndroma
        boolean esPalindroma = esPalindroma(palabra);

        // Imprimir el resultado
        if (esPalindroma) {
            System.out.println("La palabra es palíndroma.");
        } else {
            System.out.println("La palabra no es palíndroma.");
        }
    }

    // Método para determinar si una palabra es palíndroma
    public static boolean esPalindroma(String palabra) {
        int i = 0;
        int j = palabra.length() - 1;
        while (i < j) {
            if (palabra.charAt(i) != palabra.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
