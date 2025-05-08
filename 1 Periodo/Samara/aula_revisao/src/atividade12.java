import java.util.ArrayList;
import java.util.Scanner;
public class atividade12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota;

        System.out.println("Digite as notas (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            notas.add(nota);
        }

        if (!notas.isEmpty()) {
            double soma = 0;
            for (double n : notas) {
                soma += n;
            }
            double media = soma / notas.size();
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        scanner.close();
    }
}
