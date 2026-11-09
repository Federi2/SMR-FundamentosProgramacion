import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el importe: ");
        double importe = sc.nextDouble();

        int descuentoTotal = 0;

        System.out.print("¿Eres socio? (s/n): ");
        String socio = sc.next();
        if (socio.equals("s")) {
            descuentoTotal += 5; // -5 %
        }

        System.out.print("¿Pagas en efectivo? (s/n): ");
        String efectivo = sc.next();
        if (efectivo.equals("s")) {
            descuentoTotal += 2; // -2 %
        }

        System.out.println("Porcentaje total de descuento: " + descuentoTotal + " %");
    sc.close();
    }
}