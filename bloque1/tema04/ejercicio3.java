import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primero número entero: ");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo número entero: ");
        int b = Integer.parseInt(sc.nextLine());
        
        double media = (double) (a + b) /2;
        System.out.println(media);
    }
}
