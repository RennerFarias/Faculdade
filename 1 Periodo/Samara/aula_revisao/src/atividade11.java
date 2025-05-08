import java.util.Scanner;

public class atividade11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcao = "";

        while (!opcao.equals("3")) {
            System.out.println("Menu:");
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    scanner.nextLine();
                    break;

                case "2":
                    System.out.print("Digite o primeiro número: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num4 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num3 - num4));
                    scanner.nextLine();
                    break;

                case "3":
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
    }
}
