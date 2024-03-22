package SwitchCase;

public class Ejercicio1 {
    public static void main(String[] args) {
        int nivel = 3;

        switch (nivel) {
            case 1:
                System.out.println("Motor a base de agua");
                break;
            case 2:
                System.out.println("Motor a gasolina");
                break;
            case 3:
                System.out.println("Motor a Hormigon");
                break;
            default:
                System.out.println("No existe un valor valido");
                break;
        }
    }
}
