/*Ejercicio 11 bidimensionales*/

public class Ejercicio_11_bidimensionales {
    public static void main(String[] args) {
        int[][] n = new int[10][10];
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 10; j++) {
                n[i][j] = (int)(Math.random()*101) + 200;
                System.out.printf("%5d", n[i][j]);
            }
            System.out.println();
        }
        System.out.print("\nDiagonal desde la esquina superior izquierda ");
        System.out.println("a la esquina inferior derecha: ");
        int maximo = 200;
        int minimo = 300;
        int suma = 0;
        for(int i = 0; i < 10; i++) {
            int numero = n[i][i];
            System.out.print(numero + " ");
            if (numero > maximo) {
                maximo = numero;
            }
            if (numero < minimo) {
                minimo = numero;
            }
            suma += numero;
        }
        System.out.println("\nMáximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        System.out.println("Media: " + ((double)suma / 10));
    }
}


