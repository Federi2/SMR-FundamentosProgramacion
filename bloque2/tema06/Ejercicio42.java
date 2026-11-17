import java.util.Scanner;

public class Ejercicio42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("¿Es socio? (s/n): ");
        String socio = sc.next();
        System.out.print("¿Paga en efectivo? (s/n): ");
        String efectivo = sc.next();

        int descuento = 0;
        
  
        if (socio.equals("s")) {
            descuento += 5;
        }
        
        if (efectivo.equals("s")) {
            descuento += 2;
        }

        System.out.println("Descuento total: " + descuento + "%");
       sc.close();
    }
}
