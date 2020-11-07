import java.util.Scanner;

class AreaPoligono {
    private static double coordenadas[][] = new double[2][20];
    private static boolean fimX = false, fimY = false;
    private static int qntdCoord = 0;

    private static void Leitor() {
        Scanner scanner = new Scanner(System.in);
        while (!fimY) {
            double coord = scanner.nextDouble();
            if (!fimX) {
                if (coord == -1) {
                    qntdCoord = 0;
                    fimX = !fimX;
                } else {
                    coordenadas[0][qntdCoord++] = coord;
                }
            } else {
                if (coord == -1) {
                    fimY = !fimY;
                } else {
                    coordenadas[1][qntdCoord++] = coord;
                }
            }
        }
        scanner.close();
    }

    private static void Area() {
        double somatorio = 0.0;
        for (int i = 0; i <= qntdCoord - 2; i++) {
            somatorio += ((coordenadas[0][i + 1] + coordenadas[0][i]) * (coordenadas[1][i + 1] - coordenadas[1][i]));
        }
        double area = (1.0 / 2.0) * Math.abs(somatorio);
        System.out.printf("%.4f\n", area);
    }

    public static void main(String[] args) {
        Leitor();
        Area();
    }
}