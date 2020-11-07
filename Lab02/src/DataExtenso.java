import java.util.Scanner;

class DataExtenso {
    private static String mesExtenso(int mes) {
        switch (mes) {
            case 1:
                return "janeiro";
            case 2:
                return "fevereiro";
            case 3:
                return "marco";
            case 4:
                return "abril";
            case 5:
                return "maio";
            case 6:
                return "junho";
            case 7:
                return "julho";
            case 8:
                return "agosto";
            case 9:
                return "setembro";
            case 10:
                return "outubro";
            case 11:
                return "novembro";
            default:
                return "dezembro";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataString = scanner.next();

        int dia = Integer.parseInt(dataString.substring(0, 2));
        int mes = Integer.parseInt(dataString.substring(2, 4));
        String mesExt = mesExtenso(mes);
        int ano = Integer.parseInt(dataString.substring(4, 8));

        System.out.printf("%d de %s de %d\n", dia, mesExt, ano);

        scanner.close();
    }
}