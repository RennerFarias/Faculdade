import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scan.next();
        System.out.println("Digite sua idade: ");
        int idade= scan.nextInt();
        System.out.println("Digite sua cidade");
        String cidade = scan.next();

        System.out.println("------------------------------");

        System.out.println("Digite suas notas do colegio:");
        int nota1 = scan.nextInt();
        int nota2 = scan.nextInt();
        int nota3 = scan.nextInt();
        int nota4 = scan.nextInt();

        System.out.println("-----------------------");

        System.out.println("sua nota total é ");
        System.out.println(nota1 + nota2 + nota3 + nota4);
        System.out.println("sua media é");

        int resultado = (nota1 + nota2 + nota3 + nota4);
        System.out.println(resultado / 4);

        System.out.println("-------------------------");

        System.out.println("Escreva sua altura: ");
        double altura= scan.nextDouble();
        System.out.println("Escreva seu peso");
        double peso= scan.nextDouble();


        System.out.println("------------------------");
        System.out.println("seu imc é: ");
        double imc = (peso / Math.pow(altura, 2));
        System.out.println(imc);
    }
}