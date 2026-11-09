import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print
        ("Escribe un número: ");
        int n = sc.nextInt();
        if(n >=0){
        System.out.println("Positivo");
        }
    else{
        System.out.println("Negativo");
    }
    sc.close();
    }
    
}
