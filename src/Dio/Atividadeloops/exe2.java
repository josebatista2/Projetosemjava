package Dio.Atividadeloops;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Nota :");
        nota = scan.nextInt();

        while ( nota < 0 | nota > 10 ){
            System.out.println("Nota invalida , digite valores entre 0 - 10 .");
            nota = scan.nextInt();
        }
    }
}
