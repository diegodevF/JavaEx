package CicloFor;
import java.util.*;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        int cont = 0;
        int div = 0;

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

        for(int i = 0; i < numero; i++){
           //divisores de un numero
           if (numero%2 == 0){
            cont++;
            div+=cont;
        }
        System.out.println("Divisores: " + div);
        }
    }   
}
