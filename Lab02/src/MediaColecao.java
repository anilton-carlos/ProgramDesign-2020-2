import java.util.Scanner;

class MediaColecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double media = 0;
        int qntdNum = 0;
        int number = scanner.nextInt();

        while (number != -1) {
            media += number;
            qntdNum++;
            number = scanner.nextInt();
        }

        media = media / (double) qntdNum;
        System.out.printf("%.2f\n", media);

        scanner.close();
    }
}