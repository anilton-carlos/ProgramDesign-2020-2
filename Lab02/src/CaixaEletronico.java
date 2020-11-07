import java.util.Scanner;

class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorInserido = scanner.nextInt();

        if (valorInserido % 2 != 0 || valorInserido < 0) {
            System.out.println("Valor Invalido - Anilton");
        } else {
            int qntd50 = valorInserido / 50;
            valorInserido = valorInserido % 50;

            int qntd10 = valorInserido / 10;
            valorInserido = valorInserido % 10;

            int qntd02 = valorInserido / 2;

            System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", qntd50, qntd10, qntd02);

        }

        scanner.close();
    }
}