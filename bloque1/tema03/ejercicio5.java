import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
       System.out.print("Base: ");
        int base = sc.nextInt();

        System.out.print("Altura: ");
        int altura = sc.nextInt();

        int resultadoarea = base * altura;

        System.out.println("El Área del rectángulo es: " + resultadoarea);
        sc.close();
    }
}