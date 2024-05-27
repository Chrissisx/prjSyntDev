/**
 * Poliretos
 * Serie numérica 11
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloSC7 {
    public void SerieCaracter7For(int ccPosicion){
        char letra = 'a';
        int contador = 0;

        System.out.println("\nSERIE CARACTER 7");
        System.out.println("\nFor: ");

        for (int i = 2; contador < ccPosicion; i+=2) {
            for (int j = 0; j < i; j++) {
                System.out.print(letra);
            }
            System.out.print(" ");
            letra++;
            contador++;
        }
    }

    public void SerieCaracter7doWhile(int ccPosicion){
        char letra = 'a';
        int contador = 0;
        int i = 2;
        
        System.out.println("\nDo While: ");

        do {
            int j = 0;
            do {
                System.out.print(letra);
                j++;
            } while (j < i);
            System.out.print(" ");
            letra++;
            contador++;
            i+=2;
        } while (contador < ccPosicion);
    }

    public void SerieCaracter7While(int ccPosicion){
        char letra = 'a';
        int contador = 0;
        int i = 2;

        System.out.println("\n While: ");

        while (contador < ccPosicion) {
            int j = 0;
            while (j < i) {
                System.out.print(letra);
                j++;
            }
            System.out.print(" ");
            letra++;
            contador++;
            i+=2;
        }
    }
}
