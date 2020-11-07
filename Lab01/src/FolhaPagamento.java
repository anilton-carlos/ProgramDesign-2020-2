import java.util.*;

class FolhaPagamento{
    public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	
    	double vlrHora = scan.nextDouble();
    	
    	int qntdHora = scan.nextInt();
    	
    	double salBruto = vlrHora * qntdHora;
    	
    	double impRenda = salBruto * 0.11;
    	
    	double inss = salBruto * 0.08;
    	
    	double descontos = impRenda + inss;
    	
    	double saLiq = salBruto - descontos;
    	
    	System.out.printf("Salario bruto: R$%.2f\n", salBruto);
    	System.out.printf("IR: R$%.2f\n", impRenda);
    	System.out.printf("INSS: R$%.2f\n", inss);
    	System.out.printf("Total de descontos: R$%.2f\n", descontos);
    	System.out.printf("Salario liquido: R$%.2f\n", saLiq);
    	
        scan.close();
    }
}