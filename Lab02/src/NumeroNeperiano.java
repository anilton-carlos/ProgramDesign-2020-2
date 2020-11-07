import java.util.Scanner;

class NumeroNeperiano {

	private static double fatorial(int n) {
		double saida = 1;
		while(n >= 1) {
			saida *= n--;
		}
		return saida;
	}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qntdTermos = scanner.nextInt();
        double nep = 0;
        qntdTermos--;
        while(qntdTermos >= 0 ) {
        	nep += 1.0/fatorial(qntdTermos--);
        }
        
        System.out.printf("%.6f\n", nep);

        scanner.close();
    }
}