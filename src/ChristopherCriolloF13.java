/**
 * Poliretos
 * Serie numérica 11
 * @author ChristopherCriollo
 * @version 1.0
 */

public class ChristopherCriolloF13 {
    public void Figura13For(int ccNivel){

        System.out.println("\nFIGURA 13");
        System.out.println("\nFor: ");
        
        for (int i = 1; i <= ccNivel; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);    
            }
            System.out.println();
        }
    }
    
    public void Figura13doWhile(int ccNivel){
        
        System.out.println("\nDo While: ");
        
        int i = 1;
        do{
            int j = 1; 
            do {
                System.out.print(j);
                j++; 
            } while (j <= i);
            System.out.println();
            i++;
        } while (i <= ccNivel);
    }
    
    public void Figura13While(int ccNivel){
        
        System.out.println("\nWhile: ");
        
        int i = 1;
        while (i <= ccNivel) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
