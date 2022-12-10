import java.util.Scanner;
public class Ejercicio_19 {
    public static void main(String[] args) {
        int[] n = new int[12];
        for (int i = 0; i < 12; i++) {
            n[i] = (int) (Math.random() * 201);
        }
        System.out.println("Array original:");
        System.out.print("\nÍndice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
        Scanner s = new Scanner(System.in);
        System.out.print("\n\nIntroduzca el número que quiere insertar: ");
        int numero = Integer.parseInt(s.nextLine());
        System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
        int posicion = Integer.parseInt(s.nextLine());
        for (int i = 11; i > posicion; i--) {
            n[i] = n[i - 1];
        }
        n[posicion] = numero;
        System.out.println("\nArray resultado:");
        System.out.print("\nÍndice ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", i);
        }
        System.out.print("\nValor ");
        for (int i = 0; i < 12; i++) {
            System.out.printf("%4d ", n[i]);
        }
        s.close();
    }
}
