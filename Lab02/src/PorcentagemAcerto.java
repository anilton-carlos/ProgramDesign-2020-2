import java.util.Scanner;

class PorcentagemAcerto {
    private static boolean fimLeitura = false, fimResp = false;
    private static int respostas[][] = new int[2][50];
    private static int qntdQuest = 0;

    private static void Leitor(Scanner scanner) {
        int resp = scanner.nextInt();
        // while (!fimLeitura) {
        if (resp == -1) {
            if (!fimResp) {
                fimResp = true;
                qntdQuest = 0;
            } else {
                fimLeitura = true;
            }
        } else {

            if (!fimResp) {
                respostas[0][qntdQuest] = resp;
                qntdQuest++;
            } else {
                respostas[1][qntdQuest] = resp;
                qntdQuest++;
            }
        }
        // }
    }

    private static void Comparador() {
        int acertos = 0;
        for (int i = 0; i < qntdQuest; i++) {
            if (respostas[0][i] == respostas[1][i]) {
                acertos++;
            }
        }
        double percentual = ((double) (acertos) / (double) (qntdQuest));
        percentual = percentual * 100.0;

        System.out.printf("%.2f\n", percentual);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!fimLeitura) {
            Leitor(scanner);
        }
        Comparador();
        scanner.close();
    }
}