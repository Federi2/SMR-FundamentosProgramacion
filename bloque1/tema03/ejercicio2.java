import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Dime un número ");
        int numero = sc.nextInt();

        System.out.println("Tu numero es el " + numero);

        sc.close();
    }
}