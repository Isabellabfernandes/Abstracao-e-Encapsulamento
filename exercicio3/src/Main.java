import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String inputHoras1 = JOptionPane.showInputDialog("Digite as horas do primeiro horário:");
        int horas1 = Integer.parseInt(inputHoras1);

        String inputMinutos1 = JOptionPane.showInputDialog("Digite os minutos do primeiro horário:");
        int minutos1 = Integer.parseInt(inputMinutos1);

        String inputSegundos1 = JOptionPane.showInputDialog("Digite os segundos do primeiro horário:");
        int segundos1 = Integer.parseInt(inputSegundos1);

        //cria o objeto Hora para o primeiro horário
        Hora hora1 = new Hora(horas1, minutos1, segundos1);

        JOptionPane.showMessageDialog(null, "Primeiro horário " + "\nHoras: " + hora1.getHoras() + "\nMinutos: " + hora1.getMinutos() + "\nSegundos: " + hora1.getSegundos() + "\nHora Completa: " + hora1.displayHora());
        
        String inputHoras2 = JOptionPane.showInputDialog("Digite as horas do segundo horário:");
        int horas2 = Integer.parseInt(inputHoras2);

        String inputMinutos2 = JOptionPane.showInputDialog("Digite os minutos do segundo horário:");
        int minutos2 = Integer.parseInt(inputMinutos2);

        String inputSegundos2 = JOptionPane.showInputDialog("Digite os segundos do segundo horário:");
        int segundos2 = Integer.parseInt(inputSegundos2);

        //cria o objeto Hora para o segundo horário
        Hora hora2 = new Hora(horas2, minutos2, segundos2);

        JOptionPane.showMessageDialog(null, "Segundo horário " + "\nHoras: " + hora2.getHoras() + "\nMinutos: " + hora2.getMinutos() + "\nSegundos: " + hora2.getSegundos() + "\nHora Completa: " + hora2.displayHora());

        //comparação dos horários
        int diferencaSegundos = hora1.compara(hora2);

        //diferença em segundos entre os horários
        if (diferencaSegundos == 0) {
            JOptionPane.showMessageDialog(null, "As horas são iguais.");
        } else {
            JOptionPane.showMessageDialog(null, "A diferença em segundos entre os horários é: " + Math.abs(diferencaSegundos));
        }
    }
}
