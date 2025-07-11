import java.util.Scanner;
public class atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / 10;

        System.out.printf("\nMédia dos números: %.2f\n", media);
        System.out.println("Números maiores que a média:");

        for (int numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}


