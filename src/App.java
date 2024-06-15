import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        //Declarar e instanciar
        ChristopherCriolloSN12 oCCSN12 = new ChristopherCriolloSN12();
        ChristopherCriolloSC7 oCCSC7   = new ChristopherCriolloSC7();
        ChristopherCriolloSC8 oCCSC8   = new ChristopherCriolloSC8();
        ChristopherCriolloF7 oCCF7     = new ChristopherCriolloF7();
        ChristopherCriolloF13 oCCF13   = new ChristopherCriolloF13();
        ChristopherCriolloF18 oCCF18   = new ChristopherCriolloF18();
        ChristopherCriolloF19 oCCF19   = new ChristopherCriolloF19();
        // ChristopherCriolloC7 oCCC07    = new ChristopherCriolloC7();
        ChristopherCriolloA01 oCCA01   = new ChristopherCriolloA01();
        ChristopherCriolloL06 oCCL06   = new ChristopherCriolloL06();
        ChristopherCriolloL07 oCCL07   = new ChristopherCriolloL07();

        EstefanoCondoySN7 oECSN7 = new EstefanoCondoySN7();
        EstefanoCondoySN8 oECSN8 = new EstefanoCondoySN8();
        EstefanoCondoyF8  oECF8 = new EstefanoCondoyF8();
        EstefanoCondoyF12 oECF12 =new EstefanoCondoyF12();
        EstefanoCondoyF14 oECF14 = new EstefanoCondoyF14();
        EstefanCondoyF15 oECF15 =new EstefanCondoyF15();
        EstefanoCondoyF17 oECF17 = new EstefanoCondoyF17();

        CamilaCaicedoSN1 oCCSN1 = new CamilaCaicedoSN1();
        CamilaCaicedoSN2 oCCSN2 = new CamilaCaicedoSN2();
        CamilaCaicedoSN3 oCCSN3 = new CamilaCaicedoSN3();
        CamilaCaicedoSN4 oCCN4 = new CamilaCaicedoSN4();
        CamilaCaicedoSC9 oCCSC9 = new CamilaCaicedoSC9();
        CamilaCaicedoSC10 oCCSC10 = new CamilaCaicedoSC10();
        CamilaCaicedoF1 oCCF1 = new CamilaCaicedoF1();
        CamilaCaicedoF10 oCCF10 = new CamilaCaicedoF10();
        CamilaCaicedoF11 oCCF11 = new CamilaCaicedoF11();

        JairoAnguloSN5 oJASN5 = new JairoAnguloSN5();
        JairoAnguloSN6 oJASN6 = new JairoAnguloSN6();
        JairoAnguloSC3 oJASC3 = new JairoAnguloSC3();
        JairoAnguloSC4 oJASC4 = new JairoAnguloSC4();
        JairoAnguloF4 oJAF4 = new JairoAnguloF4();
        JairoAnguloF2 oJAF2 = new JairoAnguloF2();
        JairoAnguloF5 oJAF5 = new JairoAnguloF5();
        JairoAnguloF9 oJAF9 = new JairoAnguloF9();


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
        //SN1
        System.out.println();
        oCCSN1.ccSN1(numeroPos);
        //SN2
        System.out.println();
        oCCSN2.ccSN2(numeroPos);
        //SN3
        System.out.println();
        oCCSN3.ccSN3(numeroPos);
        //SN4
        System.out.println();
        oCCN4.ccSN4(numeroPos);
        System.out.println();
        //SN5
        oJASN5.SerieNumerica5For(numeroPos);
        System.out.println();
        //SN6
        oJASN6.SerieNumerica6For(numeroPos);
        System.out.println();
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
        //SC3
        oJASC3.SerieCaractere3For(numeroPos);
        System.out.println();
        //SC4
        oJASC4.SerieCaractere4For(numeroPos);
        System.out.println();
        //SC7
        oCCSC7.SerieCaracter7(numeroPos);
        System.out.println();
        //SC8
        oCCSC8.SerieCaracter8(numeroPos);
        System.out.println();
        //SC9
        oCCSC9.ccSC9(numeroPos);
        System.out.println();
        //SC10
        oCCSC10.ccSC10(numeroPos);
        System.out.println();
        //******************************FIGURAS******************************
        //F1
        oCCF1.ccF1(numeroPos);
        System.out.println();
        //F2
        oJAF2.Figura2For(numeroPos);
        System.out.println();
        //F4
        oJAF4.Figura4For(numeroPos);
        System.out.println();
        //F5
        oJAF5.Figura5For(numeroPos);
        System.out.println();
        //F7
        oCCF7.Figura7(numeroPos);
        System.out.println();
        //F8
        oECF8.Figura8(numeroPos);
        System.out.println();
        //F9
        oJAF9.Figura9For(numeroPos);
        System.out.println();
        //F10
        oCCF10.ccF10(numeroPos);
        System.out.println();
        //F11
        oCCF11.ccF11(numeroPos);
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
        //*************************CADENA CARACTERES*************************
        //C07
        // oCCC07.Cadena07();
        System.out.println();

        //******************************ARRAYS*******************************
        //A01
        oCCA01.array01();
        System.out.println();
        //A02
        ChristopherCriolloA02.array02();
        System.out.println();
        //******************************LOADING*******************************
        //L06
        oCCL06.loading06();
        System.out.println();
        //L07
        oCCL07.loading07();
        System.out.println();
        
        sc.close();
    }
}
