import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
       System.out.print("Radio: ");
        int radio = sc.nextInt();

        final double PI = 3.14159;

        double resultadoarea = PI * radio * radio;

        System.out.println("El Área del círculo es: " + resultadoarea);
        sc.close();
    }
}