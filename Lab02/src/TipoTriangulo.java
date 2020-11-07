import java.util.*;

class TipoTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean invalido = false;

        double lados[] = new double[3];
        lados[0] = 0;
        lados[1] = 0;
        lados[2] = 0;

        for (int i = 0; i < 3; i++) {
            lados[i] = scan.nextDouble();
            if (lados[i] <= 0) {
                invalido = true;
            }
        }

        if (lados[0] + lados[1] <= lados[2]) {
            invalido = true;
        } else if (lados[0] + lados[2] <= lados[1]) {
            invalido = true;
        } else if (lados[2] + lados[1] <= lados[0]) {
            invalido = true;
        }

        if (invalido) {
            System.out.println("invalido");
        } else {
            if (lados[0] == lados[1]) {
                if (lados[1] == lados[2]) {
                    System.out.println("equilatero");
                } else {
                    System.out.println("isosceles");
                }
            } else if (lados[1] == lados[2]) {
                if (lados[2] == lados[0]) {
                    System.out.println("equilatero");
                } else {
                    System.out.println("isosceles");
                }
            } else if (lados[0] == lados[2]) {
                if (lados[0] == lados[1]) {
                    System.out.println("equilatero");
                } else {
                    System.out.println("isosceles");
                }
            } else {
                System.out.println("escaleno");
            }
        }
        scan.close();
    }
}