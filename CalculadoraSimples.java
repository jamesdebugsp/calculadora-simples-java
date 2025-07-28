import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        int b = scanner.nextInt();

        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + ((double) a / b));
        System.out.println("Resto: " + (a % b));

        scanner.close();
    }
}
