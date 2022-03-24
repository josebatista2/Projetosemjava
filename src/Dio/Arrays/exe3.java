package Dio.Arrays;

import java.util.Random;

public class exe3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatorios = new int[28];

        for (int i = 0 ; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i]=numero;
        }

        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + " ");
        }
        System.out.println("\n Sucessores dos numeros Aleatorios ");
        for ( int numero : numerosAleatorios ) {
            System.out.print(numero + 1 + " ");
        }
    }
}
