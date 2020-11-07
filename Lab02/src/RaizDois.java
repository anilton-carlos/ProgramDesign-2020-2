import java.util.Scanner;

class RaizDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            double raizD = 1.0;
            double ciclo = 1.0;
            for (int j = 0; j <= i; j++) {
                ciclo = 1.0 / (2 + ciclo);
            }
            raizD += ciclo;
            System.out.printf("%.14f\n", raizD);
        }

        scanner.close();
    }
}