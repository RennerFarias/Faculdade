public class Aula1 {
    public static void main(String[] args) {
        System.out.println("Olá, Mundo!");

        String nome = "Renner Farias";
        int idade = 20;
        final double PI = 3.14159;

        int numero1 = 24;
        int numero =6;

        System.out.println("Meu nome é " + nome + " e tenho " + idade + " anos");
        System.out.println("PI = " + PI);

        System.out.println("----------------------------------------");

        System.out.println("Conta de mais: " + (numero + numero1));
        System.out.println("Conta de menos: " + (numero1 - numero));
        System.out.println("Conta de divisão: " + (numero1 / numero));
        System.out.println("Conta de mutiplicação: " + (numero1 * numero));

        System.out.println("----------------------------------------");
      ; System.out.println("Resto da divisão: " + (numero1 % numero));
        System.out.println("Potência simplificada: " + (Math.pow(numero1, numero)));

        System.out.println("---------------------------------------");

        String frase1 = ("Aprendendo Java é divertido!");
        System.out.println(frase1.length() );
        String frase1toUpperCase = frase1.toUpperCase();
        System.out.println(frase1toUpperCase);
        System.out.println(frase1.replace("Java","JavaScript"));

        String frase2 = ("Aprendender java é dificil,");
        System.out.println(frase2.contains("java"));

  }


}




