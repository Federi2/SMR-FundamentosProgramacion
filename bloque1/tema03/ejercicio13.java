import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        final double cambio = 1.10;
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        double dolares = euros * cambio;
        System.out.println(euros + " euros equivalen a " + dolares + " dolares ");
        sc.close();
}
}