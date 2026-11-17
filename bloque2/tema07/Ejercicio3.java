import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Café 1,20 €  2) Té 1,00 €  3) Zumo 2,00 €");
        
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        
        System.out.print("Cantidad de unidades: ");
        int unidades = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Total: " + (1.20 * unidades) + " euros");
                break;
            case 2:
                System.out.println("Total: " + (1.00 * unidades) + " euros");
                break;
            case 3:
                System.out.println("Total: " + (2.00 * unidades) + " euros");
                break;
            default:
                System.out.println("Opción no válida");
        }
        sc.close();
    }
}