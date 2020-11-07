import java.util.Scanner;

class ContaEnergia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double consEnerg = scanner.nextDouble();
        char tipoInst = scanner.next().charAt(0);

        if (consEnerg < 0) {
            System.out.println(-1.00);
        } else {
            switch (tipoInst) {
                case 'R':
                    if (consEnerg <= 500) {
                        System.out.printf("%.2f\n", consEnerg * 0.40);
                    } else {
                        System.out.printf("%.2f\n", consEnerg * 0.65);
                    }
                    break;

                case 'C':
                    if (consEnerg <= 1000) {
                        System.out.printf("%.2f\n", consEnerg * 0.55);
                    } else {
                        System.out.printf("%.2f\n", consEnerg * 0.60);
                    }
                    break;
                case 'I':
                    if (consEnerg <= 5000) {
                        System.out.printf("%.2f\n", consEnerg * 0.55);
                    } else {
                        System.out.printf("%.2f\n", consEnerg * 0.60);
                    }
                    break;
                default:
                    System.out.println(-1.00);
                    break;
            }
        }
        scanner.close();
    }
}