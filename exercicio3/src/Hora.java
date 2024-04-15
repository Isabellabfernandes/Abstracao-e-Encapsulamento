class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    //construtor
    public Hora(int horas, int minutos, int segundos) {
        if (isHoraValida(horas, minutos, segundos)) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        } else {
            this.horas = 0;
            this.minutos = 0;
            this.segundos = 0;
        }
    }

    //método para verificar se a hora está correta
    public boolean isHoraValida(int horas, int minutos, int segundos) {
        return horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60;
    }

    //método para comparar os horários e retornar a diferença em segundos entre eles
    public int compara(Hora outraHora) {
        int segundosAtual = this.horas * 3600 + this.minutos * 60 + this.segundos;
        int segundosOutraHora = outraHora.horas * 3600 + outraHora.minutos * 60 + outraHora.segundos;
        return segundosAtual - segundosOutraHora;
    }

    //getters
    public int getHoras() {
        return horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    //método para exibir a hora completa
    public String displayHora() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }
}
