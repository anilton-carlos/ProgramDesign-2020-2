import java.util.Scanner;

class AreaVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Um circulo com raio de %.2f centimetros tem uma area de %.2f centimetros quadrados.\n", raio,
                area);

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        System.out.printf("Uma esfera com raio de %.2f centimetros tem um volume de %.2f centimetros cubicos.", raio,
                volume);

        scanner.close();
    }
}