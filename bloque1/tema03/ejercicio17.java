import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();   

        int doble = numero * 2;
        int triple = numero * 3;

        System.out.println("El doble de "+ numero + " es " + doble );
        System.out.println("El triple de "+ numero + " es " + triple );

        sc.close();
    }
}

