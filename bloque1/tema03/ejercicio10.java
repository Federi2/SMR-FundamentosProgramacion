import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        final double IVA = 0.21;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la base imponible en euros: ");
        double baseImponible = sc.nextDouble();

        double importeIVA = baseImponible * IVA;
        double total = baseImponible + importeIVA;

        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA (21%): " + importeIVA);
        System.out.println("Total de la factura: " + total);
        sc.close();
    }
}
