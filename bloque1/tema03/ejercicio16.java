import java.util.Scanner;  
public class ejercicio16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();   

        int edadFutura = edad + 5;

        System.out.println("En 5 años tendrás: " + edadFutura);

        sc.close();
    }
}