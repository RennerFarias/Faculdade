public class atividade1 {
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
}