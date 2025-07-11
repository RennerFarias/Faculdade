import java.util.ArrayList;
import java.util.Scanner;
public class atividade13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite 10 nomes:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Nome " + (i+1) + ": ");
            nomes.add(scanner.nextLine());
        }

        System.out.println("\nNomes com mais de 5 letras:");

        for (String nome : nomes) {
            if (nome.length() > 5) {
                System.out.println(nome);
            }
        }

        scanner.close();
    }
}
