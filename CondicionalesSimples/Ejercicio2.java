package CondicionalesSimples;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese dos números enteros
        System.out.println("Ingrese el primer número entero:");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número entero:");
        int num2 = scanner.nextInt();

        // Determinar cuál es el mayor número
        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        // Realizar la potencia con el número menor como exponente
        int menor = Math.min(num1, num2);
        double resultado = Math.pow(menor, mayor);

        // Mostrar el resultado
        System.out.println("El número mayor es: " + mayor);
        System.out.println("La potencia de " + menor + " elevado a " + mayor + " es: " + resultado);

        scanner.close();
    }
}