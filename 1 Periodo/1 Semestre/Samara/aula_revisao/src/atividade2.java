import java.util.Scanner;
public class atividade2 {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número:");
                int num1 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                int num2 = scanner.nextInt();

                System.out.println("Digite o terceiro número:");
                int num3 = scanner.nextInt();

                int maior = num1;
                if (num2 > maior) {
                    maior = num2;
                }
                if (num3 > maior) {
                    maior = num3;
                }

                int menor = num1;
                if (num2 < menor) {
                    menor = num2;
                }
                if (num3 < menor) {
                    menor = num3;
                }

                if (num1 == num2 && num2 == num3) {
                    System.out.println("Todos os números são iguais: " + num1);
                } else {
                    System.out.println("Maior número: " + maior);
                    System.out.println("Menor número: " + menor);
                }
            }
        }