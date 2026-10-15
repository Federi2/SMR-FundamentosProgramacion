import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("número A: ");
        int numeroA = sc.nextInt();

        System.out.print("número B: ");
        int numeroB = sc.nextInt();

        int resultadosuma = numeroA + numeroB;
        int resultadoresta = numeroA - numeroB;
        int resultadodivision = numeroA / numeroB;
        int resultadomultiplicacion = numeroA * numeroB;

        System.out.println("El resultado de la suma es: " + resultadosuma);
        System.out.println("El resultado de la resta es: " + resultadoresta);
        System.out.println("El resultado de la división es: " + resultadodivision);
        System.out.println("El resultado de la multiplicación es: " + resultadomultiplicacion);

        sc.close();
    }
}
