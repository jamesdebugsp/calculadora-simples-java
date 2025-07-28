public class CalculadoraSimples {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        
        int soma = a + b;
        System.out.println("Soma: " + soma);

       
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);

       
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        
        double divisao = (double) a / b;
        System.out.println("Divisão: " + divisao);

        int resto = a % b;
        System.out.println("Resto: " + resto);
    }
}
