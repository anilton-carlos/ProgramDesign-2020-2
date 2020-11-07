import java.util.Scanner;

class TanqueCombustivel {
    private static double raioTanque;
    private static double altAr;

    private static double VolumeTotal() {
        double volTot = (4.0 / 3.0) * Math.PI * Math.pow(raioTanque, 3);
        return volTot;
    }

    private static double VolumeAr() {
        double volAr = (Math.PI / 3.0) * Math.pow(altAr, 2) * (3 * raioTanque - altAr);
        return volAr;
    }

    private static double VolumeCombustivel() {
        double volComb = VolumeTotal() - VolumeAr();
        return volComb;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        raioTanque = scanner.nextDouble();
        altAr = scanner.nextDouble();
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.printf("%.4f\n", VolumeAr());
        } else {
            System.out.printf("%.4f\n", VolumeCombustivel());
        }
        scanner.close();
    }
}