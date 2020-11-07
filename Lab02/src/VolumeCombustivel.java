import java.util.Scanner;

class VolumeCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altTotal, altCom, raios, volumeComb = 0;

        altTotal = scanner.nextDouble();
        altCom = scanner.nextDouble();
        raios = scanner.nextDouble();

        double volSemEsf = (2.0 / 3.0) * Math.PI * Math.pow(raios, 3);

        double volCil = Math.PI * Math.pow(raios, 2) * (altTotal - 2 * raios);

        double volTotal = 2 * volSemEsf + volCil;

        if (altTotal <= 0 || altCom < 0 || raios <= 0 || altCom > altTotal) {
            System.out.printf("%.3f\n",-1.000);
        } else {
            if (altCom <= raios) {
                volumeComb = (Math.PI / 3.0) * Math.pow(altCom, 2) * (3 * raios - altCom);
            } else if (altCom <= altTotal - raios) {
                volumeComb = volSemEsf + Math.PI * Math.pow(raios, 2) * (altCom - raios);
            } else if (altCom <= altTotal) {
                volumeComb = volTotal
                        - (Math.PI / 3.0) * Math.pow(altTotal - altCom, 2) * (3 * raios - (altTotal - altCom));
            }
            System.out.printf("%.3f\n", volumeComb);
        }

        scanner.close();
    }
}