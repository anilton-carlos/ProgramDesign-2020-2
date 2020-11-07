import java.util.Scanner;

class SomaDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorEntrada = scanner.nextInt();
        int qntdAlgarismos = Integer.toString(valorEntrada).length();

        int soma = 0;
        for (int i = 0; i <= qntdAlgarismos; i++) {
            soma += valorEntrada / (Math.pow(10, qntdAlgarismos - i));
            valorEntrada = valorEntrada % (int) (Math.pow(10, qntdAlgarismos - i));
        }
        System.out.println(soma);

        scanner.close();
    }
}