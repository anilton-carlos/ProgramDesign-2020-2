class Processador {
    String marca, modelo;
    double velocidade;
    int numNucleos;

    Processador() {
        marca = "";
        modelo = "";
        velocidade = 0.0;
        numNucleos = 0;
    }

    Processador(String marca, String modelo, double velocidade, int numNucleos) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.numNucleos = numNucleos;
    }

    double getVelocidadeParalela() {
        return velocidade * (double) numNucleos;
    }

    String getDescricao() {
        String velocPar = Double.toString(getVelocidadeParalela());
        String velo = Double.toString(velocidade);
        String nNuc = Integer.toString(numNucleos);
        String descricao = "Processador: " + "marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velo
                + "GHz, numNucleos=" + nNuc + ", velocidadeParalela=" + velocPar + "GHz.";
        return descricao;
    }
}