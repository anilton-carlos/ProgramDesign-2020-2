import java.util.Scanner;

class RotaOrtodromica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pontos[] = new double[4];

        for (int i = 0; i < 4; i++) {
            pontos[i] = scanner.nextDouble();
            pontos[i] = Math.toRadians(pontos[i]);
        }

        double raioTerra = 6371.0;

        double distancia = raioTerra * Math.acos((Math.sin(pontos[0]) * Math.sin(pontos[2]))
                + (Math.cos(pontos[0]) * Math.cos(pontos[2]) * Math.cos(pontos[1] - pontos[3])));

        for (int i = 0; i < 4; i++) {
            pontos[i] = Math.toDegrees(pontos[i]);
        }
        System.out.printf("A distancia entre os pontos (%.6f, %.6f) e (%.6f, %.6f) e de %.2f km\n", pontos[0],
                pontos[1], pontos[2], pontos[3], distancia);

        scanner.close();
    }
}