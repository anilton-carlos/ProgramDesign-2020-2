import java.util.Scanner;

class PontoReta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double Px = scanner.nextDouble();
        double Py = scanner.nextDouble();

        if ((2.0 * Px + Py) == 3.0) {
            System.out.printf("Ponto (%.1f, %.1f) pertence a reta 2x + y = 3.", Px, Py);
        } else {
            System.out.printf("Ponto (%.1f, %.1f) nao pertence a reta 2x + y = 3.", Px, Py);
        }

        scanner.close();
    }
}