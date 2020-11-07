import java.util.Scanner;

class Palindromos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String texto = scanner.nextLine();
        texto = texto.toUpperCase();
        texto = texto.replace(" ", "");

        int i = 0, j = texto.length() - 1;
        int palind = 1;

        while (i < texto.length()) {
            if (texto.charAt(i) != texto.charAt(j)) {
                palind = 0;
            }
            i++;
            j--;
        }

        System.out.print(texto);
        System.out.printf(" %d\n", palind);

        scanner.close();
    }
}