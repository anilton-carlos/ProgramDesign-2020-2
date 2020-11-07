
public class TurmaEmSala {
	Turma turma;
	Sala sala;
	
	TurmaEmSala(){
		turma = null;
		sala = null;
	}
	
	TurmaEmSala(Turma turma, Sala sala){
		this.sala = sala;
		this.turma = turma;
	}
}
