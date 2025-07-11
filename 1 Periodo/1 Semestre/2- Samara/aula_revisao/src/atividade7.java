import java.util.Scanner;

public class atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero <= 0) {
            System.out.println("Por favor, digite um número inteiro positivo.");
        } else {
            int soma = 0;
            int contador = 1;

            while (contador <= numero) {
                soma += contador;
                contador++;
            }

            System.out.println("A soma dos números de 1 até " + numero + " é: " + soma);
        }

        scanner.close();
    }
}