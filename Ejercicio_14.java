public class Ejercicio_14 {
    public static void main(String[] args) {
        String[] color = {
            "verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro ", "blanco", "morado"
        };
        String[] palabra = new String[8];
        String[] resultado = new String[8];
        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra.");
        int j = 0;
        for (int i = 0; i < 8; i++) {
            palabra[i] = System.console().readLine();
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    resultado[j++] = c;
                }
            }
        }
        for (int i = 0; i < 8; i++) {
            boolean esColor = false;
            for (String c : color) {
                if (palabra[i].equals(c)) {
                    esColor = true;
                }
            }
            if (!esColor) {
                resultado[j++] = palabra[i];
            }
        }
        System.out.println("\n\nArray original:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│ %d ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String p : palabra) {
            System.out.printf("│%-8s", p);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
        System.out.println("\n\nArray resultado:");
        System.out.println("\n┌────────┬────────┬────────┬────────┬────────┬────────┬────────┬────────┐");
        for (int i = 0; i < 8; i++) {
            System.out.printf("│ %d ", i);
        }
        System.out.println("│\n├────────┼────────┼────────┼────────┼────────┼────────┼────────┼────────┤");
        for (String r : resultado) {
            System.out.printf("│%-8s", r);
        }
        System.out.println("│\n└────────┴────────┴────────┴────────┴────────┴────────┴────────┴────────┘");
    }
}
