class Disco {
    String marca, tipo;
    double capacidade;
    int rpm;

    Disco() {
        marca = "";
        tipo = "";
        capacidade = 0.0;
        rpm = 0;
    }

    Disco(String marca, String tipo, double capacidade, int rpm) {
        this.marca = marca;
        this.tipo = tipo;
        this.capacidade = capacidade;
        this.rpm = rpm;
    }

    String getDescricao() {
        String cap = Double.toString(capacidade);
        String rpmS = Integer.toString(rpm);

        String descricao = "Disco: marca=" + marca + ", tipo=" + tipo + ", capacidade=" + cap + "GB, rpm=" + rpmS
                + "rpm.";
        return descricao;
    }
}