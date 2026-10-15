import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Introduce la nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Introduce la nota 3: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3.0;

        System.out.println("La nota media es: " + media);
        sc.close();
    }
}