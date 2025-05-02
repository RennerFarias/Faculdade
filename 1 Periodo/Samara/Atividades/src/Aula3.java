import javax.swing.JOptionPane;

public class Aula3 {
    public static void main(String[] args) {

        //atvidade1//
        String num1str = JOptionPane.showInputDialog("digite sua nota");
        String num2str = JOptionPane.showInputDialog("digite sua segunda nota");
        String num3str = JOptionPane.showInputDialog("digite sua terceira nota");

        int num1 = Integer.parseInt(num1str);
        int num2 = Integer.parseInt(num2str);
        int num3 = Integer.parseInt(num3str);

        int soma = num1 + num2 + num3;
        int media = soma / 3;
        int multiplicacao = num1 * num2 * num3;

        String resultado = "RESULTADOS:\n"
                + "Soma: " + soma + "\n"
                + "Média: " + media + "\n"
                + "Multiplicação: " + multiplicacao;

        JOptionPane.showMessageDialog(null, resultado);

        //atividade2//

                String alturaStr = JOptionPane.showInputDialog("Digite sua altura (ex: 1.75):");
                String pesoStr = JOptionPane.showInputDialog("Digite seu peso (ex: 68.5):");

                double altura = Double.parseDouble(alturaStr);
                double peso = Double.parseDouble(pesoStr);

                double imc = peso / (altura * altura);

                JOptionPane.showMessageDialog(null, "Seu IMC: " + String.format("%.1f", imc));



                /*
                como essa porcaria funciona, o str para salvar o valor para depois converter
                 */



    }
}