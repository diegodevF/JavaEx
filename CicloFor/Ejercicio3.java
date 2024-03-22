package CicloFor;
import java.util.*;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int suma = 0;

        System.out.println("Ingrese un numero");
        numero = entrada.nextInt();

        for(int i = 1; i <= numero / 2; i++){
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
