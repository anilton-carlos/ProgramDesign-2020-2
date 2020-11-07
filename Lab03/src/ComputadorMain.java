class ComputadorMain {
    public static void main(String[] args) {
        Processador processador = new Processador();
        processador.marca = "Intel";
        processador.modelo = "i7";
        processador.velocidade = 3.2;
        processador.numNucleos = 8;

        // System.out.println(proc.getDescricao());

        Memoria memoria = new Memoria("Kingston", "DDR4", 8.0, 3.2, 4);
        // System.out.println(mem.getDescricao());

        Disco disco = new Disco("Western Digital", "HDD", 4000.0, 9600);
        // System.out.println(disco.getDescricao());

        Computador computador = new Computador("Dell", processador, memoria, disco);
        System.out.println(computador.getDescricao());

    }
}