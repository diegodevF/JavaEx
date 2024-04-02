package CicloWhile;

public class Ejercicio1 {

    public static void main(String[] args) {
        String palabra = "Programación";

        // Invertir la palabra
        String palabraInvertida = invertirPalabra(palabra);

        // Imprimir la palabra invertida
        System.out.println("La palabra invertida es: " + palabraInvertida);
    }

    // Método para invertir una palabra
    public static String invertirPalabra(String palabra) {
        StringBuilder palabraInvertida = new StringBuilder();
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida.append(palabra.charAt(i));
        }
        return palabraInvertida.toString();
    }
}
