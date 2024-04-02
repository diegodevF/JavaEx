package Matrices;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Tamaño de la matriz
        int filas = 5;
        int columnas = 3;

        // Declarar y llenar la matriz con números aleatorios entre 0 y 50
        int[][] matriz = new int[filas][columnas];
        llenarMatriz(matriz, 0, 50);

        // Encontrar el número mayor en la matriz
        int mayor = encontrarMayor(matriz);

        // Imprimir la matriz y el número mayor
        System.out.println("Matriz:");
        imprimirMatriz(matriz);
        System.out.println("El número mayor en la matriz es: " + mayor);
    }

    // Método para llenar una matriz con números aleatorios
    public static void llenarMatriz(int[][] matriz, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(max - min + 1) + min;
            }
        }
    }

    // Método para encontrar el número mayor en una matriz
    public static int encontrarMayor(int[][] matriz) {
        int mayor = matriz[0][0];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
            }
        }
        return mayor;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
