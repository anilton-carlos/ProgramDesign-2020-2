import java.util.*;

class PinturaMuro{
    public static void main(String[] args){
    	double area = 12 * 3;
    	double material = 100;
    	
    	Scanner scan = new Scanner(System.in);
    	double preco = scan.nextDouble();
    	
    	double custoTotal = (preco * area) + material;
    	
        System.out.printf("%.1f\n", custoTotal);
        
        scan.close();
    }
}