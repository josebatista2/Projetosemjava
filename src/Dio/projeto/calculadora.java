package Dio.projeto;

public class calculadora {
    public static void soma (double numero1 , double numero2 ){
        double resultado = numero1 + numero2 ;
        System.out.println("A soma de " + numero1 + "mais " + numero2 + "é" + resultado);
    }
    public static void subtraçao (double numero1 , double numero2 ){
        double resultado = numero1 - numero2 ;
        System.out.println("A Subtraçao de " + numero1 + "menos " + numero2 + "é" + resultado);
    }
    public static void multiplicaçao (double numero1 , double numero2 ){
        double resultado = numero1 * numero2 ;
        System.out.println("A Multiplicaçao de " + numero1 + "vezes " + numero2 + "é" + resultado);
    }
    public static void divisao  (double numero1 , double numero2 ){
        double resultado = numero1 / numero2 ;
        System.out.println("A divisao de " + numero1 + "dividido por " + numero2 + "é" + resultado);
    }
}

