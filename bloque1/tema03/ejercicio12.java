import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        final double descuento = 0.10;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el precio sin descuento: ");
        double precio = sc.nextDouble();

        double ahorro = precio * descuento;

        double preciofinal = precio - ahorro;


        System.out.println("Precio: " + precio);
        System.out.println("Descuento (10%): " + ahorro);
        System.out.println("Precio con descuento: " + preciofinal);
        sc.close();
    }
}