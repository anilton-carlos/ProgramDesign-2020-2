import java.util.Scanner;

class IdadeUfam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int anoFundacao = 1909;
        int anoAtual = scanner.nextInt();

        System.out.printf("A UFAM tem %d anos de fundacao\n", anoAtual-anoFundacao);

        scanner.close();
    }
}