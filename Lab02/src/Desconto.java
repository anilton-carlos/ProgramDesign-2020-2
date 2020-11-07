import java.util.Scanner;

class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = scanner.nextDouble();
        if (preco >= 200.00) {
            preco = preco - (preco * 0.05);
        }
        System.out.printf("%.2f", preco);
        scanner.close();
    }
}