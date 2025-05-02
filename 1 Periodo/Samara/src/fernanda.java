import java.util.Scanner;

public class fernanda {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Informe sua idade: ");
        int idade = scan.nextInt();

        scan.nextLine();

        System.out.println("Informe a sua cidade natal: ");
        String cidade = scan.nextLine();



        System.out.println("------------------");

        System.out.println("Infome a sua nota: ");
        double nota1 = scan.nextDouble();

        System.out.println("Infome a sua segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.println("Infome a sua terceira nota: ");
        double nota3 = scan.nextDouble();

        double soma = nota1 + nota2 + nota3;
        System.out.println("A soma das suas notas é " + soma);

        double media = soma / 3;
        System.out.println("A sua média é de " + media);

        double produto = nota1 * nota2 * nota3;
        System.out.println("O produto da sua nota é de " + produto);



        System.out.println("------------------");


        System.out.println("Informe a sua altura: ");
        double altura = scan.nextDouble();

        System.out.println("Informe o seu peso: ");
        double peso = scan.nextDouble();

        double IMC = peso / Math.pow(altura, 2);

        System.out.println(IMC);

        System.out.println("------------------");

    }
}
