import java.util.Scanner;

class DistanciaAviao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabela[][] = { { 0, 2, 11, 6, 15, 11, 1 }, { 2, 0, 7, 12, 4, 2, 15 }, { 11, 7, 0, 11, 8, 3, 13 },
                { 6, 12, 11, 0, 10, 2, 1 }, { 15, 4, 8, 10, 0, 5, 13 }, { 11, 2, 3, 2, 5, 0, 14 },
                { 1, 15, 13, 1, 13, 14, 0 } };

        int cidAtual, cidAnt, tempoV = 0;
        boolean init = true;
        cidAtual = (scanner.nextInt()) / 100 - 1;
        cidAnt = cidAtual;

        while (cidAtual != -1) {
            if (!init) {
                cidAtual = (cidAtual / 100) - 1;
            } else {
                init = !init;
            }
            tempoV += tabela[cidAnt][cidAtual];
            cidAnt = cidAtual;
            cidAtual = scanner.nextInt();
        }

        System.out.println(tempoV);
        scanner.close();
    }
}