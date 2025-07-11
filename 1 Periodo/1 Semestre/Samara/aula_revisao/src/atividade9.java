import java.util.Scanner;

public class atividade9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Número 1: ");
        double a = input.nextDouble();
        System.out.print("Número 2: ");
        double b = input.nextDouble();
        System.out.print("Operação (+, -, *, /): ");
        char op = input.next().charAt(0);
        //Lê o primeiro caractere da próxima palavra digitada pelo usuário

        switch(op) {
            case '+': System.out.println("Resultado: " + (a + b)); break;
            case '-': System.out.println("Resultado: " + (a - b)); break;
            case '*': System.out.println("Resultado: " + (a * b)); break;
            case '/':
                System.out.println(b == 0 ? "Erro: divisão por zero!" : "Resultado: " + (a / b));
                break;
            default: System.out.println("Operação inválida!");
        }
    }
}