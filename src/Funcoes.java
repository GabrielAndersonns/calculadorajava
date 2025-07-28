import java.util.Scanner;

public class Funcoes {
    public static void soma(){
        float n1;
        float n2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero para somar:");
        n1 = scanner.nextInt();

        System.out.println("Digite outro numero para somar:");
        n2 = scanner.nextInt();
        System.out.println("A soma dos numeros e:"+  (n1 + n2));
    }
}
