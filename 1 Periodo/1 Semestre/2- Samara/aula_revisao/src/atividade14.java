import java.util.ArrayList;
import java.util.List;
public class atividade14 {
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
}
