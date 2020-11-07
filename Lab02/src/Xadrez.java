import java.util.Scanner;

class Xadrez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qntdLinhas = scanner.nextInt();
        boolean linhaPar = false;

        for (int i = 0; i < qntdLinhas; i++) {
            for (int j = 0; j < qntdLinhas; j++) {
                if (!linhaPar) {
                    System.out.print("* ");
                } else {
                    System.out.print(" *");
                }
            }
            linhaPar = !linhaPar;
            System.out.println("");
        }

        scanner.close();
    }
}