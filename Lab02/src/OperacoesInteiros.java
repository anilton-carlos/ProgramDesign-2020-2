import java.util.Scanner;

class Vetor {
    private static int qntdElem, qntdPar, qntdImp, somaTotal, maior, menor;
    private static double media;

    public void Add(int num) {
        qntdElem++;

        if (num % 2 == 0) {
            qntdPar++;
        } else {
            qntdImp++;
        }

        somaTotal += num;

        if (num > maior) {
            maior = num;
        }

        if (num < menor) {
            menor = num;
        }

        media = ((double) somaTotal) / ((double) qntdElem);
    }

    public void Info() {
        System.out.printf("%d\n%d\n%d\n%d\n%.2f\n%d\n%d\n", qntdElem, qntdPar, qntdImp, somaTotal, media, maior, menor);
    }

    public void Reset() {
        qntdElem = 0;
        qntdPar = 0;
        qntdImp = 0;
        somaTotal = 0;
        maior = 0;
        menor = 9999;
        media = 0;
    }
}

class OperacoesInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vetor vetor = new Vetor();
        vetor.Reset();
        boolean fim = false, fim_vetor = false;

        while (!fim) {
            int num = scanner.nextInt();
            if (num == -1) {
                if (fim_vetor) {
                    fim = !fim;
                } else {
                    fim_vetor = !fim_vetor;
                    vetor.Info();
                    vetor.Reset();
                }
            } else {
                fim_vetor = false;
                vetor.Add(num);
            }
        }

        scanner.close();
    }
}