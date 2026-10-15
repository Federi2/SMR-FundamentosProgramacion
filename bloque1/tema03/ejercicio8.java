import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        final double cambio = 166.386;
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        double pesetas = euros * cambio;
        System.out.println(euros + " euros equivalen a " + pesetas + " pesetas ");
        sc.close();
}
}