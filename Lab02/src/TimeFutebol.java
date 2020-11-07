import java.util.Scanner;

class TimeFutebol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int gols[][] = new int[2][50];
        int qntdPartidas = 0;
        boolean fimGM = false, fimGS = false;

        while (!fimGS) {
            int num = scanner.nextInt();
            if (num == -1) {
                if (!fimGM) {
                    fimGM = !fimGM;
                    qntdPartidas = 0;
                } else {
                    fimGS = !fimGS;
                }
            } else {
                if (!fimGM) {
                    gols[0][qntdPartidas] = num;
                } else {
                    gols[1][qntdPartidas] = num;
                }
                qntdPartidas++;
            }
        }

        int i = 0, qntdVit = 0, qntdEmp = 0, qntdDer = 0;

        while (i < qntdPartidas) {
            if (gols[0][i] > gols[1][i]) {
                qntdVit++;
            } else if (gols[0][i] == gols[1][i]) {
                qntdEmp++;
            } else {
                qntdDer++;
            }
            i++;
        }

        System.out.printf("%d %d %d\n", qntdVit, qntdEmp, qntdDer);
        scanner.close();
    }
}