import java.util.Scanner;
public class Ejercicio_3 {
    public static void main (String[] args) {
        Scanner s = new Scanner (System.in);

        int [] n = new int [10];

        System.out.println("Escribe 10 numeros a continuación, pulsa intro cuando escribas cada numero: ");
        for (int i=0; i<10; i++) {
            n[i] = s.nextInt();
        }

        System.out.println("los numeros que has introducido al revés son: ");

        for (int i=9; i>=0; i--) {
            System.out.print(n[i] + " ");
        }
        s.close();
    }
}