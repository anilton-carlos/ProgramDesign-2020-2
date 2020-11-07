import java.util.Scanner;

class RaizQuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorLido = scanner.nextDouble();
        double raizQuad = Math.sqrt(valorLido);

        System.out.printf("%.4f\n", raizQuad);

        scanner.close();
    }
}