import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        final double cambio = 166.386;
     
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cantidad en pesetas: ");
        double pesetas = sc.nextDouble();

        double euros = pesetas / cambio;
        System.out.println(pesetas + " pesetas equivalen a " + euros + " euros ");
        sc.close();
}
}