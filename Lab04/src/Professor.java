/**
 * Classe Professor - Representa um professor na aplicação
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class Professor {
	/**
	 * Título do professor
	 */
    String titulacao;
    /**
     * Nome do Professor
     */
    String nome;
    /**
     * Matrícula do professor
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
     * @param titulacao titulação do professor
     * @param nome nome do professor
     * @param matricula matrícula do professor
     */
    Professor(String titulacao, String nome, int matricula){
        this.matricula = matricula;
        this.nome = nome;
        this.titulacao = titulacao;
    }
    
    /**
     * Descrição do professor
     * @return String descrição do professor
     */
    String getDescricao(){
        String mat = Integer.toString(matricula);
        String desc = "Prof. " + titulacao + " " + nome + " - mat " + mat;
        return desc;
    }
}
