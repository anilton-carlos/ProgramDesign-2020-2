/**
 * Classe Professor - Representa um professor na aplica��o
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class Professor {
	/**
	 * T�tulo do professor
	 */
    String titulacao;
    /**
     * Nome do Professor
     */
    String nome;
    /**
     * Matr�cula do professor
     */
    int matricula;
    
    /**
     * Construtor da classe.
     */
    Professor(){
        titulacao = "";
        nome = "";
        matricula = 0;
    }
    
    /**
     * Construtor da classe.
     * @param titulacao titula��o do professor
     * @param nome nome do professor
     * @param matricula matr�cula do professor
     */
    Professor(String titulacao, String nome, int matricula){
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }
    
    /**
     * Descri��o do professor
     * @return String descri��o do professor
     */
    String getDescricao(){
        String mat = Integer.toString(matricula);
        String desc = "Prof. " + titulacao + " " + nome + " - mat " + mat;
        return desc;
    }
}
