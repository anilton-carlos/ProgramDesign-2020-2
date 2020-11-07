import java.util.*;

public class ListaInvertida {
	private Hashtable<String, LinkedList<String>> tabela;
	
	public ListaInvertida() {
		tabela = new Hashtable<String, LinkedList<String>>();
	}
	
	public boolean insere(String palavra, String documento) {
		// Busca da palavra na tabela
		if(tabela.get(palavra) == null) {
			// Nao existe na tabela, Insere na tabela hash
			LinkedList<String> newLista = new LinkedList<String>();
			newLista.add(documento);
			tabela.put(palavra, newLista);
			return true;
		}
		// Existe na tabela
		else {
			//Busca do documento na lista
			if(tabela.get(palavra).contains(documento) == true) {
				//O documento ja existe na lista
				return false;
			}
			else {
				// Nao existe, inserir na lista
				tabela.get(palavra).add(documento);
				return true;
			}
		}
	}
	
	public LinkedList<String> busca(String palavra){
		return tabela.get(palavra);
	}
	
	public String toString() {
		return tabela.toString();
	}
}
