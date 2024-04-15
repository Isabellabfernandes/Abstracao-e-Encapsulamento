import javax.swing.JOptionPane;
class Aluno {
    private String nome;
    private int matricula;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    //construtor
    public Aluno(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    //define as notas do aluno
    public void setNotas(double notaProva1, double notaProva2, double notaTrabalho) {
        this.notaProva1 = (notaProva1);
        this.notaProva2 = (notaProva2);
        this.notaTrabalho = notaTrabalho;
    }

    //método para calcular nota total
    public double notaTotal() {
        return (notaProva1 + notaProva2 + notaTrabalho);
    }

    //método para verificar se o aluno foi aprovado e retornar o resultado
    public String isAprovado() {
        if (notaTotal() >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

}
