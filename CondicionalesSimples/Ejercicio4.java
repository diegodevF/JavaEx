package CondicionalesSimples;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        int multiplo = (num1 % num2);

        if (multiplo == 0) {
            System.out.println("Los  numeros son multiplos");
        } else {
            System.out.println("Los numeros no son multiplos");
        }
    }
}
