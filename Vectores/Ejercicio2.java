package Vectores;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar dos vectores de tipo float para almacenar las notas finales de los
        // estudiantes
        float[] notasGrupoA = new float[10];
        float[] notasGrupoB = new float[10];

        // Leer las notas finales del Grupo A
        System.out.println("Ingrese las notas finales del Grupo A:");
        for (int i = 0; i < 10; i++) {
            notasGrupoA[i] = scanner.nextFloat();
        }

        // Leer las notas finales del Grupo B
        System.out.println("Ingrese las notas finales del Grupo B:");
        for (int i = 0; i < 10; i++) {
            notasGrupoB[i] = scanner.nextFloat();
        }

        // Calcular el promedio general de cada grupo
        float promedioGrupoA = calcularPromedio(notasGrupoA);
        float promedioGrupoB = calcularPromedio(notasGrupoB);

        // Imprimir los promedios generales de cada grupo
        System.out.println("Promedio general del Grupo A: " + promedioGrupoA);
        System.out.println("Promedio general del Grupo B: " + promedioGrupoB);

        // Calcular el promedio general de ambos grupos
        float promedioGeneral = (promedioGrupoA + promedioGrupoB) / 2;
        System.out.println("Promedio general de ambos grupos: " + promedioGeneral);

        // Determinar el grupo con mejor promedio
        if (promedioGrupoA > promedioGrupoB) {
            System.out.println("El Grupo A tiene un mejor promedio.");
        } else if (promedioGrupoB > promedioGrupoA) {
            System.out.println("El Grupo B tiene un mejor promedio.");
        } else {
            System.out.println("Ambos grupos tienen el mismo promedio.");
        }
    }

    // Método para calcular el promedio de un grupo de notas
    public static float calcularPromedio(float[] notas) {
        float suma = 0;
        for (float nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
