import java.util.Scanner;

public class Funcoes {
    public static void soma(){
        float n1;
        float n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para somar:");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número para somar:");
        n2 = scanner.nextInt();
        System.out.println("A soma dos numeros é:"+  (n1 + n2));
    }
    public static void subtracao() {
        float n1;
        float n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para subrtrair:");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número para subtrair:");
        n2 = scanner.nextInt();
        System.out.println("A subtrção dos numeros é:" + (n1 - n2));
    }
    public static void multiplicacao() {
        float n1;
        float n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para multiplicar:");
        n1 = scanner.nextInt();

        System.out.println("Digite outro número para multiplicar:");
        n2 = scanner.nextInt();
        System.out.println("A multiplicacão dos numeros é:" + (n1 * n2));
    }

    public static void divisao () {
        float n1;
        float n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dividendo:");
        n1 = scanner.nextInt();

        System.out.println("Divisor: ");
        n2 = scanner.nextInt();
        System.out.println(n1+" dividido por "+n2+ " é: " + (n1 / n2));

    }
}

//Bora otimizar essas funções ein?