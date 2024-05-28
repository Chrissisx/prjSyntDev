/**
 * Poliretos
 * Serie numérica 11
 * @author ChristopherCriollo
 * @version 2.0
 */

/**
 * *
 * + *
 * + 3 *
 * + 4 5 *
 * + 5 9 7 *
 */
public class ChristopherCriolloF19 {
    public void Figura19For(int ccNivel){

        int[][] matriz = new int[ccNivel][ccNivel];
    
        System.out.println("\nFIGURA 19");
        System.out.println("\nFor:");
    
        for (int i = 0; i < ccNivel; i++) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;
            for (int j = 1; j < i; j++) {
                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }
        for (int i = 0; i < ccNivel; i++) {
            for (int j = 0; j <= i; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public void Figura19doWhile(int ccNivel) {
        
        int[][] matriz = new int[ccNivel][ccNivel];
    
        System.out.println("\nDo While:"); 
        
        int i = 0;
        do {
            matriz[i][0] = 1;
            matriz[i][i] = 2;
            int j = 1;
            do {
                if (i > 0 && j < i) { 
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
                j++;
            } while (j < i);
            i++;
        } while (i < ccNivel); 
    
        i = 0;
        do {
            int j = 0;
            do {
                if (matriz[i][j] == 1) {
                    System.out.print("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
                j++;
            } while (j <= i); 
            System.out.println();
            i++;
        } while (i < ccNivel); 
    }

    public void Figura19While(int ccNivel) {
        
        int[][] matriz = new int[ccNivel][ccNivel];
        
        System.out.println("\nWhile:"); 
        
        int i = 0;
        while (i < ccNivel) {
            matriz[i][0] = 1;
            matriz[i][i] = 2;
            int j = 1;
            while (j < i) {
                if (i > 0 && j < i) { 
                    matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
                }
                j++;
            }
            i++;
        }
        
        i = 0;
        while (i < ccNivel) {
            int j = 0;
            while (j <= i) {
                if (matriz[i][j] == 1) {
                    System.out.print("+ ");
                } else if (matriz[i][j] == 2) {
                    System.out.print("* ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
                j++;
            } 
            System.out.println();
            i++;
        } 
    }
}