import java.util.Scanner;

public class JoanBedonC04 {
    public void cadena4() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Ingresa una frase:");
        String frase = reader.nextLine();
        System.out.print("Ingresa una letra a eliminar:");
        char letraEliminar = reader.next().charAt(0);
        String fraseSinLetra = frase.replace(String.valueOf(letraEliminar), " ");
        System.out.println("Frase resultante: " + fraseSinLetra);
    }
}
