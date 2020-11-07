import java.util.Scanner;

class CifraCesar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int desloc = scanner.nextInt();
        String texto = scanner.nextLine();
        int textoMaisc[] = new int[texto.length()];
        int index = 0;
        if ((int) texto.charAt(0) == 32) {
            index = 1;
        }

        while (index < texto.length()) {
            textoMaisc[index] = (int) texto.charAt(index);
            if (textoMaisc[index] > 96 && textoMaisc[index] < 123) {
                textoMaisc[index] -= 32;
                textoMaisc[index] += desloc;
                if (textoMaisc[index] > 90) {
                    textoMaisc[index] = (textoMaisc[index] - 90) + 64;
                }
            }
            System.out.print((char) textoMaisc[index]);
            index++;
        }

        scanner.close();
    }
}