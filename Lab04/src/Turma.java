import java.util.ArrayList;
/**
 * Classe Turma - Representa uma turma de alunos na aplicação
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class Turma {
	/**
	 * Nome da disciplina
	 */
    String disciplina;
    /**
     * Ano da turma
     */
    int ano;
    /**
     * Semestre da turma
     */
    int semestre;
    /**
     * Professor da disciplina
     */
    Professor professor;
    /**
     * Lista de alunos da turma
     */
    ArrayList<Aluno> alunos;
    
    /**
     * Construtor da classe.
     * @param disciplina disciplina ministrada
     * @param ano ano da turma
     * @param semestre semestre da turma
     * @param professor professor da disciplina
     */
    Turma(String disciplina, int ano, int semestre, Professor professor) {
        this.disciplina = disciplina;
        this.ano = ano;
        this.semestre = semestre;
        this.professor = professor;
        alunos = new ArrayList<>();
    }
    
    /**
     * Pega um aluno na lista de alunos da turma
     * @param matricula matrícula do aluno
     * @return Aluno aluno
     */
    Aluno getAluno(int matricula) {
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).matricula == matricula)
                return alunos.get(i);
        }
        return null;
    }
    
    /**
     * Adiciona um aluno da lista de alunos
     * @param aluno
     */
    void addAluno(Aluno aluno) {
        if (getAluno(aluno.matricula) == null)
            alunos.add(aluno);
    }
    
    /**
     * Calcula a média de idade da turma
     * @return double media de idade
     */
    double getMediaIdade() {
        double sum = 0.0;
        for (int i = 0; i < alunos.size(); i++) {
            sum += (double) alunos.get(i).getIdade();
        }

        return sum / (double) alunos.size();
    }
    
    /**
     * Descrição da turma
     * @return String descrição
     */
    String getDescricao() {
        String desc = "Turma " + disciplina + " - " + Integer.toString(ano) + "/" + Integer.toString(semestre) + " "
                + "("+ professor.getDescricao() + "):";
        for (int i = 0; i < alunos.size(); i++) {
            desc += "\n  - Aluno " + Integer.toString(i + 1) + ": " + alunos.get(i).getDescricao();
        }

        return desc;
    }
}
