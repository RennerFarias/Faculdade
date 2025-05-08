/*public class Aula5 {
    public static void main(String[] args) {

        //atividade 1 - introdutorio
        String nome = "Renner";
        int idade = 19;
        double valorDepi = 3.14;

        System.out.println("nome do usuario é:" + nome);
        System.out.println("idade do usuario é:" + idade);
        System.out.println("Valor de pi é " + valorDepi);

    }
}*/

/*import java.util.Scanner;
public class Aula5 {
    public static void main(String[] args) {
        //atividade2 - Scanner

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um numero");
        int numero1 = scanner.nextInt();
        System.out.println("digite o segundo numero");
        int numero2 = scanner.nextInt();

        System.out.println("-------------------------------");

        int adição = (numero1 + numero2);
        System.out.println("resultado de adição foi: " + adição);

        int subtração = (numero1 - numero2);
        System.out.println("resultado da subtraçãp: " + subtração);

        int multiplicação = (numero1 * numero2);
        System.out.println("resultado da multiplicação: " + multiplicação);

        System.out.println("-------------------------------");

    }
}*/

/*import javax.swing.*;
public class Praticandoemnony {
    public static void main(String[] args) {

        //atividade3 - JOptionPane

        //String nome = JOptionPane.showInputDialog("Qual seu nome?");
        //JOptionPane.showMessageDialog(null, "Bem-vindo, " + nome);

        int  numero1= Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        int  nummero2= Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero"));

        int adição = (numero1 + nummero2);
        JOptionPane.showMessageDialog(null, "A adição dos numeros foi: " + adição);

        int subtracao = (numero1 - nummero2);
        JOptionPane.showMessageDialog(null, "A subtração dos numeros foi: " + subtracao);

        int multiplicação = (numero1 * nummero2);
        JOptionPane.showMessageDialog(null, "A multiplicação dos numeros foi: " + multiplicação);
    }
}*/


public class Praticandoemnony {
    public static void main(String[] args) {

    int [] numeros = {10,20,30,40,50};
        System.out.println(numeros[2]);

        int soma = (numeros[1]) + (numeros[2]) + (numeros[3]);




    }
}






