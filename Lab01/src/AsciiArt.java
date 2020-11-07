import java.util.Scanner;

public class AsciiArt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        

        int entrada = scan.nextInt();
        int qntdEspacos, qntdAsteriscos;

        int i, j, k;

        for (i = entrada; i > 0; i--) {
            qntdAsteriscos = 2 * (i);
            qntdEspacos = 2 * entrada - qntdAsteriscos;

            for (j = qntdAsteriscos; j > 0; j--) {
                System.out.print('*');

                if (j == (qntdAsteriscos / 2 + 1)) {
                    for (k = qntdEspacos; k > 0; k--) {
                        System.out.print(' ');
                    }
                }
            }

            System.out.println();
        }

        scan.close();
    }
}
