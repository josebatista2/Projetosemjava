package Dio.projeto2;

public class controlefluxo {
    public static void main(String[] args) {

        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();

    }

    public static void ifSemFlecha() {
        int mes = 9 ;
        if (mes == 1 ){
            System.out.println("janeiro");
        }else if (mes == 2){
            System.out.println("fevereiro ");
        }else if ( mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        }else if (mes == 5){
            System.out.println("Maio");
        }else if (mes == 6){
            System.out.println("junho");
        }else if (mes == 7){
            System.out.println("Julho");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Setembro");
        }else if (mes == 10){
            System.out.println("outubro");
        }else if (mes == 11){
            System.out.println("Novembro");
        }else if (mes == 12){
            System.out.println("Dezembro");
        }else {
            System.out.println("Mes nao indentificado");
        }
    }

    public static void ifFerias (){
        String mes = "julho" ;
        if (mes == "julho" || mes == "dezembro " || mes == "janeiro" ){
            System.out.println("Ferias");
        }
    }

    public static void ifMenor (){
        double salarioMensal = 11893.589 ;
        double mediaSalarial = 105200 ;
        int quantidadedeDependente = 4 ;
        int mediadeDependente = 2 ;


        boolean salarioBaixo = salarioMensal < mediaSalarial ;
        boolean muitosDependente = quantidadedeDependente >=mediadeDependente ;

        if ((salarioBaixo)&& (muitosDependente)){
            System.out.println("Funcionario deve receber auxilio ");

        }
        boolean receberAuxilio = (salarioBaixo)&& (muitosDependente);

        if (receberAuxilio ){
            System.out.println("Funcionario deve receber Auxilio");
        } else {
            System.out.println("Funcionario nao deve receber Auxilio ");
        }
    }

    private static void switchSemana (){
        String dia = "Terça" ;
        switch (dia){
            case ("Segunda"):
                System.out.println(2);
                break;
            case  ("Terça") :
                System.out.println(3);
                break;
            case ("Quarta"):
                System.out.println(4);
                break;
            case ("Quinta") :
                System.out.println(5);
                break;
            case ("Sexta"):
                System.out.println(6);
                break;
            case ("Sabado") :
                System.out.println(7);
                break;
            case ("Domingo"):
                System.out.println(8);
                break;
            default:
                System.out.println("Dia invalido");
                break;


        }

    }

    private static void switchNumero (){
        int numero = 9 ;
        switch (numero){
            case 1:
            case 2 :
            case 3 :
                System.out.println("certo");
                break;
            case 4 :
                System.out.println("errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor invalido");
                break;
        }
    }

    private static void switchFerias (){
        String mes ="Dezembro";
        switch (mes){
            case "Dezembro" :
            case "Julho":
            case "Janeiro":
                System.out.println("Ferias");
                break;
            default:
                System.out.println("Mes indefinido ");
                break;
        }
    }
}
