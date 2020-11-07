import java.util.*;

class ArteAscii{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int qnt = scan.nextInt();		
		int k = qnt;
		
		while(k>0) {	
			for(int i=0;i < k; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			k--;
		}
		while(qnt>0) {	
			for(int i=0;i < qnt; i++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			qnt--;
		}
		scan.close();
	}
	
}