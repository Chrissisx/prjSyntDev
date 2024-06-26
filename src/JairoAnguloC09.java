import java.util.Scanner;

public class JairoAnguloC09 {

    public void AlternarMayusculasMinusculas() {
        Scanner reader = new Scanner(System.in);
            System.out.print("Ingresa una frase: ");
            String frase = reader.nextLine();
            String resultado = alternarLetras(frase);
            System.out.println("Frase alternada: " + resultado);

        }

        public static String alternarLetras(String frase) {
            StringBuilder sb = new StringBuilder();
            boolean convertirAMayuscula = true;

            for (char c : frase.toCharArray()) {
                if (Character.isLetter(c)) {
                    if (convertirAMayuscula) {
                        sb.append(Character.toUpperCase(c));
                    } else {
                        sb.append(Character.toLowerCase(c));
                    }
                    convertirAMayuscula = !convertirAMayuscula;
                } else {
                    sb.append(c);
                }
            }

            return sb.toString();
        }
    }


