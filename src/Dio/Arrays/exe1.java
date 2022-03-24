package Dio.Arrays;

public class exe1 {
    public static void main(String[] args) {

        int[] vetores = {4 , 6, 7 ,8 ,9 ,5 };
        int count = 0 ;
        while (count < (vetores.length )){
            System.out.print(vetores[count] + "\n");
            count++;
        }

        for (int i = (vetores.length - 1); i >= 0 ; i --){
            System.out.print(vetores[i] + "");
        }

    }
}
