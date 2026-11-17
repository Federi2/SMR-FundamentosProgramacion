import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (1-3): ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Para");
                break;
            case 2:
                System.out.println("Precaución");
                break;
            case 3:
                System.out.println("Pasa");
                break;
            default:
                System.out.println("Color no válido");
        }
        sc.close();
    }
}