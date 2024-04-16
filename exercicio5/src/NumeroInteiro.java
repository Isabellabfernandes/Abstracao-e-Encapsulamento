class NumeroInteiro {
    private int numero;

    //primeiro construtor: sem parâmetros que vai instanciar um objeto com o número 0
    public NumeroInteiro() {
        this.numero = 0;
    }

    //segundo construtor: recebe o número que ele vai representar como parâmetro
    public NumeroInteiro(int numero) {
        this.numero = numero;
    }

    //método para soma
    public void soma(int numeroSoma) {
        this.numero += numeroSoma;
    }

    //método para subtração
    public void subtracao(int numeroSubtracao) {
        this.numero -= numeroSubtracao;
    }

    //método para verificar se o número é primo
    public boolean isPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getNumero() {
        return numero;
    }
}
