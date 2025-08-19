public class calculadora {

    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();

        System.out.println("Soma 1: " + calc.somar(5, 3));
        System.out.println("Soma 2: " + calc.somar(1, 2, 3));
    }
}