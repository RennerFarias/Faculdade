/*public class AulaRevisao {
        //atividade1
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 100 (usando for):");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nNúmeros pares de 1 a 100 (usando while):");

        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;

        }
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade2
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                System.out.println("Digite o primeiro número:");
                int num1 = scanner.nextInt();

                System.out.println("Digite o segundo número:");
                int num2 = scanner.nextInt();

                System.out.println("Digite o terceiro número:");
                int num3 = scanner.nextInt();

                // Aqui é para encontrar o maior numero
                int maior = num1;
                if (num2 > maior) {
                    maior = num2;
                }
                if (num3 > maior) {
                    maior = num3;
                }

                // Aqui é para encontrar o menor numero
                int menor = num1;
                if (num2 < menor) {
                    menor = num2;
                }
                if (num3 < menor) {
                    menor = num3;
                }

                // aqui ele vai verificar se os numeros são iguais, se for, ele mostrarar para o cliente
                if (num1 == num2 && num2 == num3) {
                    System.out.println("Todos os números são iguais: " + num1);
                } else {
                    System.out.println("Maior número: " + maior);
                    System.out.println("Menor número: " + menor);
                }
            }
        }*/

/*import java.util.Scanner;
public class AulaRevisaao {
    //atividade3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        System.out.println("Digite 5 números inteiros:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros na ordem inversa:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }
        double media = (double) soma / 10;

        System.out.printf("\nMédia dos números: %.2f\n", media);
        System.out.println("Números maiores que a média:");

        for (int numero : numeros) {
            if (numero > media) {
                System.out.println(numero);
            }
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade5
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
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //ativdade6
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (de 1 a 10) para ver sua tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Digite um valor entre 1 e 10.");
        } else {
            System.out.println("\nTabuada do " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número (1-10) para ver sua tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Número inválido! Use valores entre 1 e 10.");
        } else {
            System.out.println("\nTabuada do " + numero + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade8
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
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade9
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0; // Inicializa com valor padrão
        boolean operacaoValida = true;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Erro: divisão por zero!");
                    operacaoValida = false;
                }
                break;
            default:
                System.out.println("Operação inválida!");
                operacaoValida = false;
        }

        if (operacaoValida) {
            System.out.println("Resultado: " + resultado);
        }

        scanner.close();
    }
}*/

/*import java.util.Scanner;

public class AulaRevisao {
    //atividade10
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char opcao;

        do {
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println("a. Somar dois números");
            System.out.println("b. Subtrair dois números");
            System.out.println("c. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case 'a':
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 'b':
                    System.out.print("Digite o primeiro número: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num4 = scanner.nextDouble();
                    System.out.println("Resultado: " + (num3 - num4));
                    break;

                case 'c':
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 'c');

        scanner.close();
    }
}*/

/*import java.util.Scanner;
public class AulaRevisao {
    //atividade11
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        while (true) {
            System.out.println("\nMENU DE OPÇÕES");
            System.out.println("1. Somar dois números");
            System.out.println("2. Subtrair dois números");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção (1-3): ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = scanner.nextDouble();
                    System.out.println("Resultado da soma: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double num3 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num4 = scanner.nextDouble();
                    System.out.println("Resultado da subtração: " + (num3 - num4));
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida! Digite 1, 2 ou 3.");
            }
        }
    }
}*/

/*import java.util.ArrayList;
import java.util.Scanner;
public class AulaRevisao {
    //atividade12
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double nota;

        System.out.println("Digite as notas (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Nota: ");
            nota = scanner.nextDouble();

            if (nota < 0) {
                break;
            }

            notas.add(nota);
        }

        if (!notas.isEmpty()) {
            double soma = 0;
            for (double n : notas) {
                soma += n;
            }
            double media = soma / notas.size();
            System.out.printf("Média das notas: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi informada.");
        }

        scanner.close();
    }
}*/

/*import java.util.ArrayList;
import java.util.Scanner;
public class AulaRevisao {
        //atividade13
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
}*/

/*import java.util.ArrayList;
import java.util.List;
public class AulaRevisao {
        //atividade14
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(8);
        numeros.add(9);
        numeros.add(10);


        System.out.println("Lista original: " + numeros);

        numeros.removeIf(numero -> numero % 2 == 0);
//porque usei removeif? resumindo ele remove itens de uma lista que atendem a uma condição como coloquei em cima

        System.out.println("Lista sem pares: " + numeros);
    }
}*/

/*import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class AulaRevisao {
        //atividade15
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, ArrayList<Double>> alunosNotas = new HashMap<>();

        while (true) {
            System.out.println("\n1. Cadastrar nota");
            System.out.println("2. Calcular média");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do aluno: ");
                    String nome = scanner.nextLine();
                    System.out.print("Nota: ");
                    double nota = scanner.nextDouble();

                    alunosNotas.putIfAbsent(nome, new ArrayList<>());
                    alunosNotas.get(nome).add(nota);
                    break;

                case 2:
                    System.out.print("Aluno para cálculo: ");
                    String aluno = scanner.nextLine();

                    if (alunosNotas.containsKey(aluno)) {
                        ArrayList<Double> notas = alunosNotas.get(aluno);
                        double soma = 0;
                        for (double n : notas) {
                            soma += n;
                        }
                        System.out.printf("Média de %s: %.2f\n", aluno, soma/notas.size());
                    } else {
                        System.out.println("Aluno não encontrado!");
                    }
                    break;

                case 3:
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}*/

/*import java.util.HashMap;
import java.util.Scanner;
public class AulaRevisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> dicionario = new HashMap<>();

        while (true) {
            System.out.println("\nDICIONÁRIO PORTUGUÊS-INGLÊS");
            System.out.println("1. Consultar tradução");
            System.out.println("2. Adicionar palavra");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a palavra em português: ");
                    String palavra = scanner.nextLine();
                    System.out.println("Tradução: " +
                            dicionario.getOrDefault(palavra, "Palavra não encontrada"));
                    break;

                case 2:
                    System.out.print("Palavra em português: ");
                    String pt = scanner.nextLine();
                    System.out.print("Tradução em inglês: ");
                    String en = scanner.nextLine();
                    dicionario.put(pt, en);
                    System.out.println("Cadastrado com sucesso!");
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}*/