package Vectores;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer una palabra del usuario
        System.out.println("Ingrese una palabra:");
        String palabra = scanner.nextLine();

        // Declarar un vector de caracteres del tamaño de la palabra
        char[] caracteres = new char[palabra.length()];

        // Dividir la palabra en caracteres y almacenarlos en el vector
        for (int i = 0; i < palabra.length(); i++) {
            caracteres[i] = palabra.charAt(i);
        }

        // Imprimir los caracteres almacenados en el vector
        System.out.println("Los caracteres almacenados en el vector son:");
        for (char caracter : caracteres) {
            System.out.println(caracter);
        }
    }
}
