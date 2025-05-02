public class Aula4 {
    public static void main(String[] args) {

        System.out.println("1 exercicio");

        int[] numeros = {10,20,30,40,50};
        numeros[1] = 10;
        numeros[2] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        System.out.println(numeros[1]);
        System.out.println(numeros[3]);

        System.out.println("------------------");


        System.out.println("2 exercicio");

        numeros[2] = 100;
        System.out.println(numeros[2]);

        System.out.println("------------------");

        System.out.println("3 exercicio");

        int soma = numeros[1] + numeros [4];

        System.out.println(soma);

        System.out.println("------------------");

        System.out.println("4 exercicio");

        int diferenca = numeros [1] - numeros[3];
        System.out.println(diferenca);




    }
}
