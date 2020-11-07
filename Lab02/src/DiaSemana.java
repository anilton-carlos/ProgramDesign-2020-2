import java.util.Scanner;

class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabela[] = { 0, 0, 0, 0, 0, 0, 0 };
        boolean horasMT[] = new boolean[7];
        boolean fim = false;
        int i = 0;

        while (!fim) {
            int horas = scanner.nextInt();
            if (horas == -1) {
                fim = !fim;
                i = 0;
            } else {
                if (i == 7) {
                    i = 0;
                }
                tabela[i++] += horas;
            }
        }

        int maiorD = 0;
        while (i < 7) {
            if (tabela[i] < maiorD) {
                horasMT[i] = false;
            } else if (tabela[i] > maiorD) {
                for (int j = 0; j < i; j++) {
                    horasMT[j] = false;
                }
                horasMT[i] = true;
                maiorD = tabela[i];
            }

            if (tabela[i] == maiorD) {
                horasMT[i] = true;
            }

            i++;
        }

        i = 0;
        while(i < 7){
            if(horasMT[i]){
                System.out.println(i+1);
            }
            i++;
        }
        scanner.close();
    }
}