package bloque1.tema02;

public class ejercicio6 {
    public static void main(String[] args) {

        double baseImponible = 250.75;
        double tipoIva = 0.21;
        double iva = baseImponible * tipoIva;
        double total = baseImponible + iva;

        System.out.println("===============================");
        System.out.println("            FACTURA            ");
        System.out.println("===============================");
        System.out.printf("%-18s %10.2f euros%n", "Base imponible:", baseImponible);
        System.out.printf("%-18s %10.2f euros%n", "IVA (21%):", iva);
        System.out.println("-------------------------------");
        System.out.printf("%-18s %10.2f euros%n", "TOTAL FACTURA:", total);
        System.out.println("===============================");
    }
}