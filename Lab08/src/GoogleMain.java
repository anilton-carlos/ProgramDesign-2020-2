
public class GoogleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaInvertida lista = new ListaInvertida();
		lista.insere("force", "document1.txt");
		lista.insere("force", "document2.txt");
		lista.insere("force", "document3.txt");
		
		lista.insere("always", "document1.txt");
		
		lista.insere("one", "document3.txt");
		
		lista.insere("is", "document2.txt");
		lista.insere("is", "document3.txt");
		
		lista.insere("be", "document1.txt");
		
		lista.insere("will", "document1.txt");
		
		lista.insere("you", "document1.txt");
		lista.insere("you", "document2.txt");
		
		lista.insere("the", "document1.txt");
		lista.insere("the", "document2.txt");
		lista.insere("the", "document3.txt");
		
		lista.insere("remember", "document1.txt");
		
		lista.insere("this", "document3.txt");
		
		lista.insere("strong", "document1.txt");
		lista.insere("strong", "document2.txt");
		
		lista.insere("with", "document1.txt");
		lista.insere("with", "document2.txt");
		lista.insere("with", "document3.txt");
		
		
		System.out.println(lista.busca("strong"));
		
		System.out.println(lista.busca("projeto"));
		
		System.out.print(lista.toString());
	}

}
