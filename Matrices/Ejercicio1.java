package Matrices;

import java.util.Random;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Tamaño de las matrices
        int filas = 3;
        int columnas = 4;

        // Declarar las tres matrices
        int[][] matrizPares = new int[filas][columnas];
        int[][] matrizImpares = new int[filas][columnas];
        int[][] matrizSuma = new int[filas][columnas];

        // Llenar la primera matriz con números pares aleatorios entre 0 y 100
        llenarMatriz(matrizPares, 0, 100, true);

        // Llenar la segunda matriz con números impares aleatorios entre 0 y 50
        llenarMatriz(matrizImpares, 0, 50, false);

        // Calcular la matriz suma
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizSuma[i][j] = matrizPares[i][j] + matrizImpares[i][j];
            }
        }

        // Imprimir las matrices
        System.out.println("Matriz de números pares:");
        imprimirMatriz(matrizPares);

        System.out.println("Matriz de números impares:");
        imprimirMatriz(matrizImpares);

        System.out.println("Matriz suma:");
        imprimirMatriz(matrizSuma);
    }

    // Método para llenar una matriz con números aleatorios
    public static void llenarMatriz(int[][] matriz, int min, int max, boolean pares) {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int numero;
                if (pares) {
                    numero = rand.nextInt((max - min) / 2 + 1) * 2 + min;
                } else {
                    numero = rand.nextInt((max - min) / 2) * 2 + min + 1;
                }
                matriz[i][j] = numero;
            }
        }
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
