package CicloFor;
import java.util.*;

public class Ejercicio4 {

    public static int generateNumber(int min, int max) {
        int range = (min + max) + 1;
        return (int) (Math.random() * range) + min;
    }

    public static int Factorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; ++i) {
          factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int numero;
        int cont = 0;
        int suma = 0;
        int div = 0;

        System.out.println("Numero");
        numero = sc.nextInt();

        for(int i = 1; i < numero ;i++){
            suma += i;
            System.out.println(suma);

            System.out.println("Raiz Cuadrada" + Math.sqrt(suma));
            System.out.println(generateNumber(1, suma));

            if (numero%2 == 0){
                cont++;
                div+=cont;
            }
            System.out.println("Divisores: " + div);

            if(numero < 0) {
                System.out.println("No se puede calcular factorial de un valor negativo.");
              } else {
                int resultado = Factorial(numero);
                System.out.printf("El resultado es: %d\n", resultado);
              }

              if(numero % i == 0){
                suma += i;
            }
        }

        if(suma == numero){
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("El numero no es perfecto");
        }
    }
}
