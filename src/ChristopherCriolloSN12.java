/**
 * Poliretos
 * Serie numérica 11
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloSN12 {
    public void SerieNumerica12For(int ccPosicion){
        int inicio = 2; 
        int x = 4; 

        System.out.println("\nSERIE NUMERICA 12");
        System.out.println("\nFor: ");

        for (int i = 1; i <= ccPosicion; i++) {
            System.out.print(inicio);
            System.out.print(" ");
            inicio+=x;
            x+=2;
        }
    }

    public void SerieNumerica12doWhile (int ccPosicion){
        int inicio = 2; 
        int x = 4;
        int i = 1;
        
        System.out.println("\nDo While: ");
        do {
            System.out.print(inicio);
            System.out.print(" ");
            inicio+=x;
            x+=2;
            i++;
        } while (i <= ccPosicion);
    }

    public void SerieNumerica12While (int ccPosicion){
        int inicio = 2;
        int x = 4;
        int i = 1;

        System.out.println("\nWhile: ");
        while (i <= ccPosicion) {
            System.out.print(inicio);
            System.out.print(" ");
            inicio+=x;
            x+=2;
            i++;
        }
    }
}
