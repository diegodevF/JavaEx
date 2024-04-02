package CicloWhile;

public class Ejercicio4 {
    public static void main(String[] args) {
        int limite = 25;

        System.out.println("Los primeros 25 valores de la serie sumatoria son:");
        for (int i = 1; i <= limite; i++) {
            int valor = i * 11;
            System.out.print(valor);
            if (i != limite) {
                System.out.print(" - ");
            }
        }
    }
}
