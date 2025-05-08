import java.util.Scanner;
public class atividade5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] arrayOriginal = new int[5];
            int[] arrayInvertido = new int[5];

            System.out.println("Digite 5 números inteiros:");

            for (int i = 0; i < 5; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                arrayOriginal[i] = scanner.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                arrayInvertido[i] = arrayOriginal[4 - i];
            }

            System.out.println("\nArray invertido:");
            for (int numero : arrayInvertido) {
                System.out.print(numero + " ");
            }

            scanner.close();
        }
    }

