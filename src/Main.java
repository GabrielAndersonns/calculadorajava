import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        System.out.println("Eae seu lixo");
        Scanner op = new Scanner(System.in);
        Funcoes calcu = new Funcoes();
        int decisao;
        boolean finalizar = true;

        while (finalizar == true) {
            System.out.println("Hello there vadia, informe que operação deseja realizar:\n1 - soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair ");
            decisao = op.nextInt();

            switch (decisao) {
                case 1:
                    calcu.soma();
                    break;

                case 2:
                    calcu.subtracao();
                    break;
                case 3:
                    calcu.multiplicacao();
                    break;
                case 4:
                    calcu.divisao();
                    break;
                case 5:
                    System.out.println("Adios");
                    finalizar = false;
                    break;
                default:
                    System.out.println("Informe um valor válido para realizar uma operação!");
            }

        }


    }
}