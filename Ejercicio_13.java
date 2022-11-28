/*Ejercicio 13 Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios 
comprendidos entre 0 y 500 (ambos incluidos). A continuación el programa mostrará el array y preguntará 
si el usuario quiere destacar el máximo o el mínimo. Seguidamente se volverá a mostrar 
el array escribiendo el número destacado entre dobles asteriscos.*/


public class Ejercicio_13 {
    public static void main (String[] args) {
        int n[] = new int [100];
        int maximo = 0;
        int minimo = 100;

        for (int i=0; i<100; i++) {
            n[i] = ((int)(Math.random()*500)+1);
            
            if (n[i] < minimo) {
                minimo = n[1];
            }
            if (n[i] > maximo) {
                maximo = n[i];
            }
        }

        
    }
}