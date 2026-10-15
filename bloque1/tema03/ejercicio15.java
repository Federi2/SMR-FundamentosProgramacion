import java.util.Scanner;  
public class ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  

        System.out.print("¿Cómo te llamas? ");
        String nombre = sc.nextLine();         

        System.out.print("¿Cuantos años tienes? ");
        String edad = sc.nextLine();   

        System.out.println( nombre + " tiene " + edad + " años ");
          sc.close();
    }
}