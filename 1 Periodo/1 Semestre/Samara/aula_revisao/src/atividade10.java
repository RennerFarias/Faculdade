import java.util.Scanner;
public class atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equals("c")) {
            System.out.println("Menu:");
            System.out.println("a. Somar dois números");
            System.out.println("b. Subtrair dois números");
            System.out.println("c. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            if (opcao.equals("a")) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num1 + num2));
                scanner.nextLine();
            } else if (opcao.equals("b")) {
                System.out.print("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = scanner.nextDouble();
                System.out.println("Resultado: " + (num1 - num2));
                scanner.nextLine();
            } else if (!opcao.equals("c")) {
                System.out.println("Opção inválida.");
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
