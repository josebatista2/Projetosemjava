package Dio.Arrays;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantconsoantes = 0;
        int count = 0;

        do {
            System.out.println("Letra : ");
            String letra = scan.next();
             if (!(letra.equalsIgnoreCase("a") |
                        letra.equalsIgnoreCase("e") |
                        letra.equalsIgnoreCase("i")|
                        letra.equalsIgnoreCase("o")|
                        letra.equalsIgnoreCase("u") )
             ){
                 consoantes[count] = letra;
                 quantconsoantes++;
             }
             count++;

        }while (count < consoantes.length);

        for ( String consoante  : consoantes ) {
            System.out.println(consoante);
        }

        System.out.println("Quantidade de consoantes " + quantconsoantes);
    }
}
