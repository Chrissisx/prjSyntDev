/**
 * Poliretos
 * CadenaC01
 * @author Joan Bedon
 * @version 1.0
 */
public class JoanBedonC01 {
    public void cadena1(String fraseIngresada) {
        int contador = 0;
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};
    
        for (int i = 0; i < fraseIngresada.length(); i++) {
            char letraActual = fraseIngresada.toLowerCase().charAt(i);
            boolean esVocal = false;
    
            for (char vocal : vocales) {
                if (letraActual == vocal) {
                    esVocal = true;
                    break;
                }
            }
    
            if (esVocal) {
                contador++;
            }
        }
    
        System.out.println("La frase: " + fraseIngresada + " contiene " + contador + " vocales.");
    }       
}
