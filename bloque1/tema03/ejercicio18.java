import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        final int segundos = 60;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los minutos: ");
        int minutos = sc.nextInt();

        int segundostotales = minutos * segundos;

        System.out.println(minutos + " minutos son " + segundostotales + " segundos.");
        sc.close();
    }
}
