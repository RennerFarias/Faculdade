package casasBahia;

import java.util.ArrayList;
import java.util.Scanner;

import excecoes.PrecoInvalidoException;
import excecoes.CodigoJaExisteException;
import excecoes.ProdutoNaoEncontradoException;
import excecoes.VoltagemInvalidaException;

public class Sistema {

    private ArrayList<Produto> produtos;

    public Sistema() {
        this.produtos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Scanner scanner) throws PrecoInvalidoException, CodigoJaExisteException, VoltagemInvalidaException{
        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o código: ");
        String codigo = scanner.nextLine();
        System.out.println("Digite o preço do produto: ");
        Double preco = scanner.nextDouble();
        scanner.nextLine();

        if(preco <= 0) {
            throw new PrecoInvalidoException("O preço precisa ser maior que 0");
        }

        // Verificar se o código já existe
        for (Produto produto : produtos) {
            if (produto.getCodigo().equals(codigo)) {
                throw new CodigoJaExisteException("Já existe um produto com o código: " + codigo);
            }
        }

        System.out.println("Qual o tipo do produto: ");
        System.out.println("1 - Móvel ");
        System.out.println("2 - Eletro ");

        int opcao = scanner.nextInt();
        scanner.nextLine();

        if (opcao == 1) {
            adicionarMovel(scanner, nome, codigo, preco);
        } else if (opcao == 2) {
            adicionarEletro(scanner, nome, codigo, preco);
        }
    }

    private void adicionarMovel(Scanner scanner, String nome, String codigo, double preco) {
        System.out.println("Digite o material:");
        String material = scanner.nextLine();

        System.out.println("Digite a categoria:");
        String categoria = scanner.nextLine();

        Movel movel = new Movel(codigo, nome, preco, categoria, material);
        produtos.add(movel);

        System.out.println("Produto adicionado");

    }

    private void adicionarEletro(Scanner scanner, String nome, String codigo, double preco) throws VoltagemInvalidaException {
        CategoriaEletro categoriaEletro = null;
        System.out.println("Qual a categoria do eletrodomestico cadastrado?");
        System.out.println("1 - Cozinha");
        System.out.println("2 - Quarto");
        System.out.println("3 - Lavanderia");

        int opcaoCategoria = scanner.nextInt();
        scanner.nextLine();
        if (opcaoCategoria == 1) {
            categoriaEletro = CategoriaEletro.COZINHA;
        } else if (opcaoCategoria == 2) {
            categoriaEletro = CategoriaEletro.QUARTO;
        } else if (opcaoCategoria == 3) {
            categoriaEletro = CategoriaEletro.LAVANDERIA;
        }
        System.out.println("Digite a voltagem");
        int voltagem = scanner.nextInt();
        scanner.nextLine();

        if (voltagem != 110 && voltagem != 220) {
            throw new VoltagemInvalidaException("Voltagem deve ser 110V ou 220V. Valor informado: " + voltagem + "V");
        }
        Eletrodomestico eletro = new Eletrodomestico(codigo, nome, preco, categoriaEletro, voltagem);
        produtos.add(eletro);
        System.out.println("Produto adicionado");

    }

    public void listarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Nenhum produto cadastrado!");
        } else {
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }

    }


    public Produto buscarProduto(Scanner scanner) throws ProdutoNaoEncontradoException {
        System.out.println("Digite o código procurado:");
        String codigoProcurado = scanner.nextLine();

        for (Produto produto : produtos) {
            if(produto.getCodigo().equals(codigoProcurado)) {
                System.out.println("Produto encontrado!");
                System.out.println(produto);
                return produto;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto com código " + codigoProcurado + " não foi encontrado!");
    }

    public void removerProduto(Scanner scanner) throws ProdutoNaoEncontradoException {
        System.out.println("Digite o código do produto: ");
        String codigoProcurado = scanner.nextLine();
        for(int i=0; i < produtos.size(); i++) {
            if(produtos.get(i).getCodigo().equals(codigoProcurado)) {
                produtos.remove(i);
                System.out.println("Produto removido");
                return;
            }
        }
        throw new ProdutoNaoEncontradoException("Produto com código " + codigoProcurado + " não foi encontrado!");
    }
}