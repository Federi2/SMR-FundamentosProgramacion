package bloque1.tema02;

public class ejercicio7 {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.25;
        double nota3 = 6.0;

        double media = (nota1 + nota2 + nota3) / 3.0;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("-------------------------");
        System.out.printf("Nota media: %.2f%n", media);
    }
}