import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
       System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Altura: ");
        int altura = sc.nextInt();

        int resultadoarea = base * altura / 2;

        System.out.println("El Área del triángulo es: " + resultadoarea);
        sc.close();
    }
}
