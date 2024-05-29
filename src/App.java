import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar e instanciar
        ChristopherCriolloSN12 oCCSN12 = new ChristopherCriolloSN12();
        ChristopherCriolloSC7 oCCSC7 = new ChristopherCriolloSC7();
        ChristopherCriolloSC8 oCCSC8 = new ChristopherCriolloSC8();
        ChristopherCriolloF7 oCCF7 = new ChristopherCriolloF7();
        ChristopherCriolloF13 oCCF13 = new ChristopherCriolloF13();
        ChristopherCriolloF18 oCCF18 = new ChristopherCriolloF18();
        ChristopherCriolloF19 oCCF19 = new ChristopherCriolloF19();
        EstefanoCondoySN7 oECSN7 = new EstefanoCondoySN7();
        EstefanoCondoySN8 oECSN8 = new EstefanoCondoySN8();
        EstefanoCondoyF8  oECF8 = new EstefanoCondoyF8();
        EstefanoCondoyF12 oECF12 =new EstefanoCondoyF12();
        EstefanoCondoyF14 oECF14 = new EstefanoCondoyF14();
        EstefanCondoyF15 oECF15 =new EstefanCondoyF15();
        EstefanoCondoyF17 oECF17 = new EstefanoCondoyF17();


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
        //SN7
        System.out.println();
        oECSN7.SerieNumerica7(numeroPos);
        //SN8
        System.out.println();
        oECSN8.SerieNumerica8(numeroPos);
        //SN12
        System.out.println();
        oCCSN12.SerieNumerica12(numeroPos);
        System.out.println();    
        //**************************SERIE CARATERES**************************
        //SC7
        oCCSC7.SerieCaracter7(numeroPos);
        System.out.println();
        //SC8
        oCCSC8.SerieCaracter8(numeroPos);
        System.out.println();
        //******************************FIGURAS******************************
        //F7
        oCCF7.Figura7(numeroPos);
        System.out.println();
        //F8
        oECF8.Figura8(numeroPos);
        System.out.println();
        //F12
        oECF12.Figura12(numeroPos);
        System.out.println();
        //F13
        oCCF13.Figura13(numeroPos);
        System.out.println();
        //F14
        oECF14.Figura14(numeroPos);
        System.out.println();
        //F15
        oECF15.Figura15(numeroPos);
        System.out.println();
        //F17
        oECF17.Figura17(numeroPos);
        System.out.println();
        //F18
        oCCF18.Figura18(numeroPos);
        System.out.println();
        //F19
        oCCF19.Figura19(numeroPos);
        System.out.println();

        sc.close();
    }
}
