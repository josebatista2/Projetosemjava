package Dio.projeto;

public class Mensagem {
    public static void obterMensagem(int hora){
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagenBomDia();
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagenBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 00:
            case 01:
            case 02:
            case 03:
            case 04:
                mensagenBoaNoite();
                break;
            default:
                System.out.println("Hora invalida");
                break;

        }
    }
    public static void mensagenBomDia(){
        System.out.println("Bom dia");
    }
    public static void mensagenBoaTarde(){
        System.out.println("Boa tarde");
    }
    public static void mensagenBoaNoite(){
        System.out.println("Boa Noite");
    }
}
