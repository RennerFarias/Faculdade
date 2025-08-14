import java.util.*;

class Produto {
    String nome, categoria;
    double preco;
    int quantidade;
}

public class loja_revisao {
    static ArrayList<Produto> produtos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1-Cadastrar 2-Listar 3-Buscar 4-Editar 5-Remover 6-Sair");
            int op = sc.nextInt(); sc.nextLine();

            if (op == 1) cadastrar();
            else if (op == 2) listar();
            else if (op == 3) buscar();
            else if (op == 4) editar();
            else if (op == 5) remover();
            else if (op == 6) break;
        }
    }

    static void cadastrar() {
        Produto p = new Produto();
        System.out.print("Nome: "); p.nome = sc.nextLine();
        System.out.print("Categoria: "); p.categoria = sc.nextLine();
        System.out.print("Preço: "); p.preco = sc.nextDouble();
        System.out.print("Quantidade: "); p.quantidade = sc.nextInt();
        produtos.add(p);
    }

    static void listar() {
        for (Produto p : produtos)
            System.out.println(p.nome + " - R$" + p.preco + " - " + p.quantidade + " em estoque");
    }

    static void buscar() {
        System.out.print("Buscar: ");
        String busca = sc.nextLine().toLowerCase();
        for (Produto p : produtos)
            if (p.nome.toLowerCase().contains(busca))
                System.out.println(p.nome + " - " + p.categoria);
    }

    static void editar() {
        System.out.print("Qual produto editar? ");
        String nome = sc.nextLine();
        for (Produto p : produtos) {
            if (p.nome.equalsIgnoreCase(nome)) {
                System.out.print("Novo preço: "); p.preco = sc.nextDouble();
                System.out.print("Nova quantidade: "); p.quantidade = sc.nextInt();
                break;
            }
        }
    }

    static void remover() {
        System.out.print("Qual produto remover? ");
        String nome = sc.nextLine();
        produtos.removeIf(p -> p.nome.equalsIgnoreCase(nome));
    }
}