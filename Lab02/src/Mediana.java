import java.util.Scanner;

class Mediana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[100];

        int qntdE = 0;
        boolean fimL = false;

        while (!fimL) {
            int num = scanner.nextInt();
            if (num == -1) {
                fimL = !fimL;
            } else {
                vetor[qntdE] = num;
                qntdE++;
            }
        }

        if (qntdE % 2 != 0) {
            System.out.printf("%.1f\n", (double) vetor[(qntdE - 1) / 2]);
        } else {
            double mediana = (double) (vetor[qntdE / 2] + vetor[(qntdE / 2) - 1]) / 2.0;
            System.out.printf("%.1f\n", mediana);
        }
        scanner.close();
    }
}