import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Double>> alunosNotas = new HashMap<>();

        while (true) {
            System.out.println("\n1. Cadastrar nota");
            System.out.println("2. Calcular média");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();

                    alunosNotas.putIfAbsent(nome, new ArrayList<>());
                    alunosNotas.get(nome).add(nota);
                    break;

                case 2:
                    System.out.print("Aluno para cálculo: ");
                    String aluno = scanner.nextLine();

                    if (alunosNotas.containsKey(aluno)) {
                        ArrayList<Double> notas = alunosNotas.get(aluno);
                        double soma = 0;
                        for (double n : notas) {
                            soma += n;
                        }
                        System.out.printf("Média de %s: %.2f\n", aluno, soma/notas.size());
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
