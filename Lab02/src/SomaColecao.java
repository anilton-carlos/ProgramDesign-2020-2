import java.util.Scanner;

class SomaColecao {
    private static volatile int colecao[] = new int[15];
    private static volatile int instaQuntd = -1;
    private static volatile boolean finished = false;

    public static void addNumber(Scanner scanner) {
        int number = scanner.nextInt();
        if (number == -1) {
            finished = true;
        } else {
            instaQuntd++;
            colecao[instaQuntd] = number;
        }
    }

    private static void somaColec(){
        int soma = 0;
        for(int i = 0; i <= instaQuntd; i++){
            soma = soma + colecao[i];
        }
        System.out.println(soma);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(!finished){
            addNumber(scanner);
        }
        somaColec();

        scanner.close();
    }
}