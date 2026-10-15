import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
       System.out.print("Horas trabajadas: ");
        int horas = sc.nextInt();

        System.out.print("Precio por hora: ");
        int precio = sc.nextInt();

        int resultadosalario = horas * precio;

        System.out.println("El Salario semanal es: " + resultadosalario);
        sc.close();
    }
}