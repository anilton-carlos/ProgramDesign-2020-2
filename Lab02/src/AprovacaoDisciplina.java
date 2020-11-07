import java.util.Scanner;

class AprovacaoDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double notas[] = new double[25];
        int presencas[] = new int[25];
        int cargaH, qntdA = 0, qAprov = 0, qRepN = 0, qRepF = 0;

        double nota = scanner.nextDouble();
        while (nota >= 0) {
            notas[qntdA] = nota;
            nota = scanner.nextDouble();
            qntdA++;
        }
        qntdA = 0;
        int presenca = scanner.nextInt();
        while (presenca >= 0) {
            presencas[qntdA] = presenca;
            presenca = scanner.nextInt();
            qntdA++;
        }

        cargaH = scanner.nextInt();

        int i = 0;
        while (i < qntdA) {
            if (presencas[i] < (int) (0.75 * cargaH)) {
                qRepF++;
            } else if (notas[i] < 5.0) {
                qRepN++;
            } else {
                qAprov++;
            }
            i++;
        }

        System.out.printf("%d %d %d\n", qAprov, qRepN, qRepF);
        scanner.close();
    }
}