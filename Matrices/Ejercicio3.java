package Matrices;

import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Tamaño de la matriz
        int filas = 3;
        int columnas = 4;

        // Declarar y llenar la matriz con números aleatorios
        int[][] matriz = new int[filas][columnas];
        Random rand = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rand.nextInt(100);
            }
        }

        // Imprimir la primera fila
        System.out.println("Primera fila:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[0][j] + "\t");
        }
        System.out.println();

        // Imprimir la segunda columna
        System.out.println("Segunda columna:");
        for (int i = 0; i < filas; i++) {
            System.out.println(matriz[i][1]);
        }

        // Imprimir la tercera fila
        System.out.println("Tercera fila:");
        for (int j = 0; j < columnas; j++) {
            System.out.print(matriz[2][j] + "\t");
        }
        System.out.println();
    }
}
