/**
 * Classe main para testes de aplicaÁ„o das classe que compıem uma turma
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class TurmaMain {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Emmett L. Brown", 7714, 1998);
        Aluno aluno2 = new Aluno("Egon Spengler", 5907, 2000);
        Aluno aluno3 = new Aluno("Peter Weyland", 7734, 2001);
        Aluno aluno4 = new Aluno("Anilton Carlos", 5907, 1999);
        
        Professor prof = new Professor("Dr.", "Hubert J. Farnsworth", 2208);

        Turma turma = new Turma("Inicia√ß√£o Tecnol√≥gica e Cient√≠fica", 2016, 1, prof);
        turma.addAluno(aluno1);
        turma.addAluno(aluno2);
        turma.addAluno(aluno3);
        turma.addAluno(aluno4);

        System.out.printf("Media de Idade: %.2f\n", turma.getMediaIdade());

        System.out.println(turma.getDescricao());
    }
}
