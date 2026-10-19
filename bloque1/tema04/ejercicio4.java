import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una letra: ");
        char letra = sc.nextLine().charAt(0);
        int codigo = letra;
        char siguiente = (char) (letra + 1);
        System.out.println(codigo);
        System.out.println(siguiente);
    }
}
