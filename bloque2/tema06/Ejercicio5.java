import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la edad: ");
        int edad = sc.nextInt();

        if (edad < 4) {
            System.out.println("Gratis");
        } else if (edad <= 12) {
            System.out.println("0,50 €");
        } else if (edad <= 64) {
            System.out.println("1,20 €");
        } else {
            System.out.println("Gratis");
        }
        sc.close();
    }
}