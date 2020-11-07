import java.util.*;

class SomaColecoes {
    private static volatile int colecoes[][] = new int[15][15];
    private static volatile int qntdColecoes = 0;
    private static volatile int instaQuntd = 0;
    private static volatile boolean finished = false;

    private static void somaColec() {
        for (int i = 0; i < qntdColecoes; i++) {
            int soma = 0;
            for (int j = 1; j <= colecoes[i][0]; j++) {
                soma = soma + colecoes[i][j];
            }
            System.out.println(soma);
        }
    }

    public static void addNumber(Scanner scanner) {
        int number = scanner.nextInt();
        if (number == -1) {
            if (instaQuntd == 0) {
                finished = true;
            } else {
                colecoes[qntdColecoes][0] = instaQuntd;
                instaQuntd = 0;
                qntdColecoes++;
            }
        } else {
            colecoes[qntdColecoes][instaQuntd + 1] = number;
            instaQuntd++;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (!finished) {
            addNumber(scan);
        }
        somaColec();
        scan.close();
    }
}