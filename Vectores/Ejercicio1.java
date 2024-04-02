package Vectores;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declarar un vector de tipo float para almacenar el peso de las personas
        float[] pesos = new float[5];

        // Leer el peso de las 5 personas
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el peso de la persona " + (i + 1) + ":");
            pesos[i] = scanner.nextFloat();
        }

        // Calcular el promedio del peso
        float suma = 0;
        for (float peso : pesos) {
            suma += peso;
        }
        float promedio = suma / 5;
        System.out.println("El promedio del peso de las 5 personas es: " + promedio);

        // Determinar cuántas personas superan y cuántas personas son inferiores al
        // promedio
        int personasSuperiores = 0;
        int personasInferiores = 0;
        for (float peso : pesos) {
            if (peso > promedio) {
                personasSuperiores++;
            } else if (peso < promedio) {
                personasInferiores++;
            }
        }
        System.out.println("Número de personas que superan el promedio: " + personasSuperiores);
        System.out.println("Número de personas que son inferiores al promedio: " + personasInferiores);
    }
}
