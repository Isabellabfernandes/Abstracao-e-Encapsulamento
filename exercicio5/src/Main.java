import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        NumeroInteiro numero = new NumeroInteiro();
        JOptionPane.showMessageDialog(null, "Número inicial: " + numero.getNumero());

        String inputNumero = JOptionPane.showInputDialog("Digite um número inteiro para o paramêtro:");
        int numeroDigitado = Integer.parseInt(inputNumero);
        NumeroInteiro numero1 = new NumeroInteiro(numeroDigitado);

        //solicita números de soma e subtração
        String inputSoma = JOptionPane.showInputDialog("Digite um número inteiro para a soma:");
        int numeroSoma = Integer.parseInt(inputSoma);

        String inputSubtracao = JOptionPane.showInputDialog("Digite um número inteiro para a subtração:");
        int numeroSubtracao = Integer.parseInt(inputSubtracao);

        //realiza a soma e a subtração
        numero1.soma(numeroSoma);
        numero.subtracao(numeroSubtracao);
        JOptionPane.showMessageDialog(null, "Após a soma : " + numero1.getNumero());
        JOptionPane.showMessageDialog(null, "Após a subtração: " + numero.getNumero());

        JOptionPane.showMessageDialog(null, "O primeiro número é primo? " + numero.isPrimo());
    }
}