import java.util.HashMap;
import java.util.Scanner;
public class atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dicionario = new HashMap<>();

        while (true) {
            System.out.println("\nDICIONÁRIO PORTUGUÊS-INGLÊS");
            System.out.println("1. Consultar tradução");
            System.out.println("2. Adicionar palavra");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a palavra em português: ");
                    String palavra = scanner.nextLine();
                    System.out.println("Tradução: " +
                            dicionario.getOrDefault(palavra, "Palavra não encontrada"));
                    break;

                case 2:
                    System.out.print("Palavra em português: ");
                    String pt = scanner.nextLine();
                    System.out.print("Tradução em inglês: ");
                    String en = scanner.nextLine();
                    dicionario.put(pt, en);
                    System.out.println("Cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}