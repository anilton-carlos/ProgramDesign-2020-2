import java.util.Calendar;
/**
 * Classe Aluno - Representa um Aluno na aplica��o
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 * 
 */
public class Aluno {
	
	/** Nome do Aluno */
	String nome;
	/** N�mero de matr�cula do aluno */
	int matricula;
	/** Ano de nascimento do aluno */
	int anoNascimento;
	
	/**
	 * Construtor da classe.
	 */
	Aluno(){
	nome = "";	
	matricula = 0;
	anoNascimento = 0;
	}
	
	/**
	 * Construtor da classe.
	 * @param nome nome do aluno
	 * @param matricula matr�cula do aluno
	 * @param ano ano de nascimento do aluno
 	 */
	Aluno(String nome, int matricula, int anoNascimento){
		this.nome = nome;
		this.matricula = matricula;
		this.anoNascimento = anoNascimento;
	}
	
	/**
	 * Calcula da idade do aluno
	 * @return int idade do aluno
	 */
	int getIdade(){
		int anoAtual = Calendar.getInstance().get(Calendar.YEAR);

		return anoAtual - anoNascimento;
	}
	
	/**
	 * Descri��o do aluno
	 * @return String descri��o do aluno
	 */
	String getDescricao(){
		String mat = Integer.toString(matricula);
		String idade = Integer.toString(getIdade());
		String desc = nome + "(mat=" + mat + ", idade=" + idade + ")";

		return desc;
	}
}
