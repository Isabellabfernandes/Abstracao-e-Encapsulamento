import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Insira a primeira data");
        Data data1 = inserirData();

        JOptionPane.showMessageDialog(null, "Insira a segunda data");
        Data data2 = inserirData();

        JOptionPane.showMessageDialog(null, "Primeira data: " + data1);
        JOptionPane.showMessageDialog(null, "Segunda data: " + data2 + "\nMês por extenso: " + data2.getMesExtenso());

        //compara as datas
        int comparacao = data1.compara(data2);
        if (comparacao == 0) {
            JOptionPane.showMessageDialog(null, "As datas são iguais.");
        } else if (comparacao == 1) {
            JOptionPane.showMessageDialog(null, "A primeira data é maior que a segunda data.");
        } else {
            JOptionPane.showMessageDialog(null, "A segunda data é maior que a primeira data.");
        }
    }

    //método para o usuário inserir a data completa
    public static Data inserirData() {
        String inputDia = JOptionPane.showInputDialog("Digite o dia:");
        int dia = Integer.parseInt(inputDia);
        String inputMes = JOptionPane.showInputDialog("Digite o mês:");
        int mes = Integer.parseInt(inputMes);
        String inputAno = JOptionPane.showInputDialog("Digite o ano:");
        int ano = Integer.parseInt(inputAno);
        return new Data(dia, mes, ano);
    }
}
