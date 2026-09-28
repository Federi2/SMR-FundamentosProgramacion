package bloque1.tema02;

public class ejercicio5 {
    public static void main(String[] args) {
        double pesetas = 1000.0;
        double tasaPesetas = 166.386;
        double euros = pesetas / tasaPesetas;

        System.out.printf("%.0f pesetas equivalen a %.2f euros.%n", pesetas, euros);
    }
}