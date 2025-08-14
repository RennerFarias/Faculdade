package codigo;

import java.util.Scanner;

public class Questao1 {

    public static void executar(Scanner scanner) {
        String entradaUsuario;
        boolean continuar = true;
        
        do {
            System.out.println("Olá Mundo!");
            
            System.out.println("Deseja imprimir novamente? (sim/ não)");
            entradaUsuario = scanner.nextLine();
            
            if (entradaUsuario.equalsIgnoreCase("sim")) {
                continuar = true;
            } else if (entradaUsuario.equalsIgnoreCase("não")) {
                continuar = false;
            } else {
                continuar = false;
                System.out.println("Entrada inválida");
            }
            
        } while (continuar);
    }
}