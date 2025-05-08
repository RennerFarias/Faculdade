import java.util.ArrayList;
import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        ArrayList<String> listaCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Exibir lista");
            System.out.println("4. Limpar lista");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o item para adicionar: ");
                    String novoItem = scanner.nextLine();
                    listaCompras.add(novoItem);
                    System.out.println("Item adicionado!");
                    break;

                case 2:
                    System.out.print("Digite o item para remover: ");
                    String itemRemover = scanner.nextLine();
                    if (listaCompras.remove(itemRemover)) {
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
                        for (String item : listaCompras) {
                            System.out.println("- " + item);
                        }
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