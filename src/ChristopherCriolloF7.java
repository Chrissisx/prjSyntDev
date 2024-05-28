/**
 * Poliretos
 * Serie numérica 11
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloF7 {
    public void Figura7For(int ccNivel){
        String grada = "|___";

        System.out.println("\nFIGURA 7");
        System.out.println("\nFor: ");

        for (int i = 0; i < ccNivel; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print("     ");
            }
            System.out.println(grada);
        }
    }

    public void Figura7doWhile(int ccNivel) {
        String grada = "|___";
    
        System.out.println("\nDo While: ");
    
        int i = 0;
        do {
            int j = 0;
            do {
                if (j < i) {
                    System.out.print("     ");
                }
                j++;
            } while (j < i);
    
            System.out.println(grada);
            i++;
        } while (i < ccNivel);
    }

    public void Figura7While(int ccNivel) {
        String grada = "|___";
    
        System.out.println("\nFIGURA 7");
        System.out.println("\nWhile: ");
    
        int i = 0;
        while (i < ccNivel) {
            int j = 0;
            while (j < i) {
                System.out.print("     ");
                j++;
            }
            System.out.println(grada);
            i++;
        }
    }
}
