package CondicionalesComplejas;

public class Ejercicio4 {
    public static void main(String[] args) {
        int nivel = 50;

        if (nivel >= 90) {
            System.out.println("Maximo");
        } else if (nivel >= 75 && nivel < 90) {
            System.out.println("Nivel Medio");
        } else if (nivel >= 50 && nivel < 75) {
            System.out.println("Regular");
        } else if (nivel < 50) {
            System.out.println("Fuera de Nivel");
        }
    }
}
