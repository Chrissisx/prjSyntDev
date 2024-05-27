import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar e instanciar
        ChristopherCriolloSN12 oCCSN12 = new ChristopherCriolloSN12();
        ChristopherCriolloSC7 oCCSC7 = new ChristopherCriolloSC7();
        ChristopherCriolloSC8 oCCSC8 = new ChristopherCriolloSC8();


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
        

        // Metodo

        //**************************SERIE NUMERICA**************************
        //SN12
        System.out.println();
        oCCSN12.SerieNumerica12For(numeroPos);
        System.out.println();
        oCCSN12.SerieNumerica12doWhile(numeroPos);
        System.out.println();
        oCCSN12.SerieNumerica12While(numeroPos);
        System.out.println();
        //**************************SERIE CARATERES**************************
        //SC7
        oCCSC7.SerieCaracter7For(numeroPos);
        System.out.println();
        oCCSC7.SerieCaracter7doWhile(numeroPos);
        System.out.println();
        oCCSC7.SerieCaracter7While(numeroPos);
        System.out.println();
        //SC8
        oCCSC8.SerieCaracter8For(numeroPos);
        System.out.println();
        oCCSC8.SerieCaracter8doWhile(numeroPos);
        System.out.println();
        oCCSC8.SerieCaracter8While(numeroPos);
        //******************************FIGURAS******************************

    }
}
