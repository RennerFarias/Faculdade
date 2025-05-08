import java.util.HashMap;
import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        HashMap<String, Integer> listaCompras = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Lista de Compras (HashMap) ---");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir lista");
            System.out.println("4. Limpar lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item para adicionar: ");
                    String novoItem = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    // Se o item já existe, soma a nova quantidade
                    listaCompras.merge(novoItem, quantidade, Integer::sum);
                    System.out.println("Item adicionado/atualizado!");
                    break;

                case 2:
                    System.out.print("Digite o item para remover: ");
                    String itemRemover = scanner.nextLine();
                    if (listaCompras.containsKey(itemRemover)) {
                        listaCompras.remove(itemRemover);
                        System.out.println("Item removido!");
                    } else {
                        System.out.println("Item não encontrado.");
                    }
                    break;

                case 3:
                    if (listaCompras.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        System.out.println("Itens na lista:");
                        listaCompras.forEach((item, qtd) ->
                                System.out.println("- " + item + " (Quantidade: " + qtd + ")"));
                    }
                    break;

                case 4:
                    listaCompras.clear();
                    System.out.println("Lista limpa!");
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}