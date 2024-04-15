import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        String aluno;
        int matricula;
        double notaProva1;
        double notaProva2;
        double notaTrabalho;

        //solicita as informações do aluno
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno:");
        aluno = JOptionPane.showInputDialog("Informe a matrícula do aluno:");
        matricula = Integer.parseInt(aluno);

        //cria objeto Aluno
        Aluno aluno1 = new Aluno(matricula, nome);

        //insere notas do aluno
        aluno = JOptionPane.showInputDialog("Nota da Prova 1:");
        notaProva1 = Double.parseDouble(aluno);
        aluno = JOptionPane.showInputDialog("Nota da Prova 2:");
        notaProva2 = Double.parseDouble(aluno);
        aluno = JOptionPane.showInputDialog("Nota do Trabalho:");
        notaTrabalho = Double.parseDouble(aluno);

        aluno1.setNotas(notaProva1, notaProva2, notaTrabalho);

        //nota total e status de aprovação
        JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nMatrícula: " + matricula + "\nNota total: " + aluno1.notaTotal() + "\nSituação: " + aluno1.isAprovado());
    }
}