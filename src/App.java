import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar
        ChristopherCriolloSN12 oCCSN12 = new ChristopherCriolloSN12();


        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*            GRUPO 1            *");
        System.out.println("*                               *");
        System.out.println("*********************************");
        System.out.println("   Integrantes: "+"\n - Angulo.Jairo"+"\n - Bedon.Joan"+"\n - Caicedo.Camila"+"\n - Condoy.Estefano"+"\n - Criollo.Christopher");
        System.out.println("\n*********************************");
        System.out.print("Ingrese un numero: ");
        int numeroPos = sc.nextInt();
        

        oCCSN12.SerieNumerica12For(numeroPos);
        System.out.println();
        oCCSN12.SerieNumerica12doWhile(numeroPos);
        System.out.println();
        oCCSN12.SerieNumerica12While(numeroPos);
        System.out.println();

    }
}
