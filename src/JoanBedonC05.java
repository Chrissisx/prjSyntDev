public class JoanBedonC05 {
    public String invertirFrase(String fraseaIngresar) {
        StringBuilder resultado = new StringBuilder();
        for (int i = fraseaIngresar.length() - 1; i >= 0; i--) {
            char caracter = fraseaIngresar.charAt(i);

            
            if (esVocal(caracter)) {
                resultado.append(Character.toUpperCase(caracter));
            } else {
                resultado.append(caracter);
            }
        }

        return resultado.toString();
    }
    private boolean esVocal(char c) {
        char caracterEnMinuscula = Character.toLowerCase(c);
        return caracterEnMinuscula == 'a' || caracterEnMinuscula == 'e' || caracterEnMinuscula == 'i'
                || caracterEnMinuscula == 'o' || caracterEnMinuscula == 'u';
    }
}
