package CondicionalesSimples;

public class Ejercicio1 {
    public static int generateNumber(int min, int max) {
        int range = (min + max) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static void main(String[] args) {
        int numeroRandom = generateNumber(0, 100);
        if (numeroRandom < 50) {
            System.out.println("El numero es menor a 50 Valor: " + numeroRandom);
        } else {
            System.out.println("El numero es mayor a 50. Valor: " + numeroRandom);
        }
    }
}