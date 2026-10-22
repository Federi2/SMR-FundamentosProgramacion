import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe la edad");
        int edad = sc.nextInt();
        boolean aprobadoTeorico = true;

        boolean puedeSacarCarnet = (edad>=18) && aprobadoTeorico;
        System.out.println("Se puede sacar el carnet " + puedeSacarCarnet);
    }
}
