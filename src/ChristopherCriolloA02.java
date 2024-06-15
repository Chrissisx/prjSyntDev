/**
 * Poliretos
 * Ejercicio Array 2
 * @author ChristopherCriollo
 * @version 2.0
 */

public class ChristopherCriolloA02 {
    public void array02(int tamano,char caracter){
        //Nombre: Jose Patricio 
        char[][] primera = new char[tamano][tamano];
        char[][] segunda = new char[tamano][tamano];

        for (int i = 0; i < primera.length; i++) {
            for (int j = 0; j < primera[i].length; j++) {
                if ((i == 0) || (j == tamano / 2) || (j < tamano / 2 && i == tamano - 1)) {
                    primera[i][j] = caracter;
                } else {
                    primera[i][j] = ' ';
                }
                if ((i == 0 || i == tamano / 2 || j == 0) || (i < tamano / 2 && j == segunda[i].length - 1) || (j > tamano / 2 && j == 0)) {
                    segunda[i][j] = caracter;
                } else {
                    segunda[i][j] = ' ';
                }
            }
        }
        char[][] matriz = new char[tamano][2 * tamano + 2]; 

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                matriz[i][j] = primera[i][j];
                matriz[i][j + tamano + 2] = segunda[i][j];
            }
        }

        for (int i = 0; i < tamano ; i++) {
            for (int j = 0; j < 2 * tamano + 2; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
        
    }
}