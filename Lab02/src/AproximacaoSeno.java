import java.util.Scanner;

class AproximacaoSeno {
    private static double fatorial(double x) {
        if (x >= 1.0) {
            double fat = x;
            double i = fat - 1;
            while (i > 0.0) {
                fat = fat * i;
                i = i - 1.0;
            }
            return fat;
        } else {
            return 1.0;
        }
    }

    private static double nTermo(double ang, int n) {
        double fator = (2.0 * ((double) (n) - 1)) + 1;
        double termo = Math.pow(-1.0, n + 1) * (Math.pow(ang, fator) / fatorial(fator));
        return termo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angulo = scanner.nextDouble();
        int nTermos = scanner.nextInt();
        int n = 1;
        double somatorio = 0;

        angulo = Math.toRadians(angulo);
        while (n <= nTermos) {
            somatorio += nTermo(angulo, n);
            System.out.printf("%.10f\n", somatorio);
            n++;
        }
        scanner.close();
    }
}