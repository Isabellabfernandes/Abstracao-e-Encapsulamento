class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Configurada como 01/01/0001.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    //método para verificar se a data está correta
    public boolean validarData(int dia, int mes, int ano) {
        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || ano < 1) {
            return false;
        }
        if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
            return false;
        }
        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 != 0)) {
                if (dia > 29) {
                    return false;
                }
            } else {
                if (dia > 28) {
                    return false;
                }
            }
        }
        return true;
    }

    //método para comparar as duas datas
    public int compara(Data outraData) {
        if (this.ano == outraData.ano) {
            if (this.mes == outraData.mes) {
                if (this.dia == outraData.dia) {
                    return 0;
                } else if (this.dia > outraData.dia) {
                    return 1;
                } else {
                    return -1;
                }
            } else if (this.mes > outraData.mes) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.ano > outraData.ano) {
            return 1;
        } else {
            return -1;
        }
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    //método para retornar o mês por extenso
    public String getMesExtenso() {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        return meses[mes - 1];
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
