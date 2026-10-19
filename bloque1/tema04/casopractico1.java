public class casopractico1 {
    public static void main(String[] args) {
    double nota = 9.75;
    //int notaRedondeada = (int) nota;
    double notaRedondeada = Math.round(nota);
    int notaFinal = (int) notaRedondeada;
    System.out.println(notaFinal);
    }
}
