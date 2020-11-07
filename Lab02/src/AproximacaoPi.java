import java.util.Scanner;

class AproximacaoPi {

    private static double termo(int n) {
        double saida = 0;
        double div = 2.0 * ((double) (n) - 1.0);

        if (n == 1) {
            saida = 3.0;
        } else if (n % 2 == 0) {
            saida = 4.0 / (div * (div + 1) * (div + 2));
        } else if (n % 2 != 0) {
            saida = -(4.0 / (div * (div + 1) * (div + 2)));
        }
        return saida;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntdTermos = scanner.nextInt();
        double pi = 0;
        for (int i = 1; i <= qntdTermos; i++) {
            pi = pi + termo(i);
            System.out.printf("%.6f\n", pi);
        }

        scanner.close();
    }
}