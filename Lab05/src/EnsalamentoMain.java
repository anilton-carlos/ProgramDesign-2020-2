/**
 * Classe que contém a fuçnção main
 * 
 * @author Anilton Carlos; aclr@icomp.ufam.edu.br;
 *
 */
public class EnsalamentoMain {
	public static void main(String[] args) {
		
		/*
		Ensalamento ensalamento = new Ensalamento();
		Sala sala101 = new Sala(6, 101, 50, true);
		Sala sala102 = new Sala(6, 102, 70, true);
		Sala sala203 = new Sala(6, 203, 50, false);
		Sala sala204 = new Sala(6, 204, 70, false);
		
		//ensalamento.addSala(sala101);
		ensalamento.addSala(sala204);
		ensalamento.addSala(sala102);
		//ensalamento.addSala(sala203);
		
		//segunda 8hs, quarta 8hs, sexta 8hs
		Turma AED1 = new Turma("Algoritmos e Estrutura de Dados I", "Edleno Silva", 60, false);
		AED1.addHorario(1);
		AED1.addHorario(15);
		AED1.addHorario(29);
		
		//terça 14hs, quinta 14hs, sexta 14hs
		Turma TP = new Turma("Técnicas de Programação", "Horácio Fernandes", 50, false);
		TP.addHorario(11);
		TP.addHorario(25);
		TP.addHorario(32);
	
		//segunda 8hs, quarta 8hs, sexta 8hs
		Turma LPC = new Turma("Laboratório de Programação C", "Edson Nascimento", 25, true);
		LPC.addHorario(1);
		LPC.addHorario(15);
		LPC.addHorario(29);
		
		//segunda 10hs, quarta 10hs
		Turma RC = new Turma("Redes de Computadores", "Edjair Souza", 70, true);
		RC.addHorario(2);
		RC.addHorario(16);
		
		//ensalamento.addTurma(AED1);
		//ensalamento.addTurma(TP);
		//ensalamento.addTurma(LPC);
		ensalamento.addTurma(RC);
		
		ensalamento.alocarTodas();
		
		System.out.println(ensalamento.relatorioSalasPorTurma());
		*/
		
		Ensalamento e = new Ensalamento();
		Sala s1 = new Sala(1000, 101, 70, true);
		Sala s2 = new Sala(2000, 201, 100, false);
		Sala s3 = new Sala(3000, 301, 50, true);
		e.addSala(s1);
		e.addSala(s2);
		e.addSala(s3);
		Turma t1 = new Turma("Turma 1", "Prof. 1", 60, true);
		t1.addHorario(2);
		t1.addHorario(16);
		t1.addHorario(30);
		e.addTurma(t1);
		Turma t2 = new Turma("Turma 2", "Prof. 2", 60, true);
		t2.addHorario(2);
		t2.addHorario(18);
		e.addTurma(t2);
		e.alocarTodas();
		
		System.out.println(e.ensalamento.size());
		
		System.out.println(e.relatorioSalasPorTurma());
	}
}
