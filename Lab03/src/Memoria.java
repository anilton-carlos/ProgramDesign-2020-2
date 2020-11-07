class Memoria {
    String marca, tipo;
    double tamanho, velocidade;
    int numPentes;

    Memoria() {
        marca = "";
        tipo = "";
        tamanho = 0.0;
        velocidade = 0.0;
        numPentes = 0;
    }

    Memoria(String marca, String tipo, double tamanho, double velocidade, int numPentes) {
        this.marca = marca;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.velocidade = velocidade;
        this.numPentes = numPentes;
    }

    double getTamanhoTotal() {
        return tamanho * (double) numPentes;
    }

    double getVelocidadeParalela() {
        return velocidade * (double) numPentes;
    }

    String getDescricao() {
        String tam = Double.toString(tamanho);
        String vel = Double.toString(velocidade);
        String nP = Integer.toString(numPentes);
        String tamT = Double.toString(getTamanhoTotal());
        String velP = Double.toString(getVelocidadeParalela());

        String descricao = "Memoria: marca=" + marca + ", tipo=" + tipo + ", tamanho=" + tam + "GB, velocidade=" + vel
                + "GHz, numPentes=" + nP + ", tamanhoTotal=" + tamT + "GB, velocidadeParalela=" + velP + "GHz.";

        return descricao;
    }
}