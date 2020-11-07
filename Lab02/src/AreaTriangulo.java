import java.util.Scanner;

class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ladoA = scanner.nextInt();
        int ladoB = scanner.nextInt();
        int ladoC = scanner.nextInt();

        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            System.out.println("Triangulo Invalido");
        } else {
            int s = (ladoA + ladoB + ladoC) / 2;
            int areaQuad = s * (s - ladoA) * (s - ladoB) * (s - ladoC);
            double area = Math.sqrt(areaQuad);

            System.out.printf("%.2f\n", area);
        }

        scanner.close();
    }
}