import java.util.Scanner;
public class atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;
        int numero;

        System.out.println("Digite números inteiros (digite um negativo para parar):");

        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero >= 0) {
                contadorPositivos++;
            }

        } while (numero >= 0);
        System.out.println("\nTotal de números positivos digitados: " + contadorPositivos);
        scanner.close();
    }
}
