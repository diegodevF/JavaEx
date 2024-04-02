package CicloWhile;

public class Ejercicio3 {
    public static void main(String[] args) {
        String parrafo = "La programación es el arte de crear soluciones mediante algoritmos. " +
                "En la programación, se utilizan diferentes lenguajes como Java, Python, C++, entre otros.";

        int contadorVocales = contarVocales(parrafo);

        System.out.println("El número de vocales en el párrafo es: " + contadorVocales);
    }

    public static int contarVocales(String parrafo) {
        int contador = 0;

        parrafo = parrafo.toLowerCase();
        for (int i = 0; i < parrafo.length(); i++) {
            char caracter = parrafo.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                contador++;
            }
        }
        return contador;
    }
}
