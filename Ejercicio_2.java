/*Ejercicio 2 Define un array de 10 caracteres con nombre simbolo y asigna valores a los
elementos según la tabla que se muestra a continuación. Muestra el contenido
de todos los elementos del array. ¿Qué sucede con los valores de los elementos
que no han sido inicializados? */

public class Ejercicio_2 {
    public static void main (String[]args) {
        
        char [] caracter = new char [9];
        caracter[0]= 'a';
        caracter[1]= 'x';
        caracter[4]= '@';
        caracter[6]= ' ';
        caracter[7]= '+';
        caracter[8]= 'Q';

        System.out.println("Los valores del array son: ");
        System.out.print(caracter[0] + ", " + caracter[1] + ", " + caracter[4] + ", " + caracter[6] + ", " + caracter[7] + ", " + caracter[8] + ".");

    }
}