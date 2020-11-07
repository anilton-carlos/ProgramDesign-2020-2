import java.util.*;

public class Ensalamento {
	ArrayList<Sala> salas;
	ArrayList<Turma> turmas;
	ArrayList<TurmaEmSala> ensalamento;

	Ensalamento() {
		salas = new ArrayList<Sala>();
		turmas = new ArrayList<Turma>();
		ensalamento = new ArrayList<TurmaEmSala>();
	}

	void addSala(Sala sala) {
		salas.add(sala);
	}

	void addTurma(Turma turma) {
		turmas.add(turma);
	}

	Sala getSala(Turma turma) {
		for (int i = 0; i < ensalamento.size(); i++) {
			if (ensalamento.get(i).turma == turma) {
				return ensalamento.get(i).sala;
			}
		}
		return null;
	}

	boolean salaDisponivel(Sala sala, int horario) {
		for (int index = 0; index < ensalamento.size(); index++) {
			if (ensalamento.get(index).sala == sala) {
				for (int indexJ = 0; indexJ < ensalamento.get(index).turma.horarios.size(); indexJ++) {
					if (ensalamento.get(index).turma.horarios.get(indexJ) == horario) {
						return false;
					}
				}
			}
		}
		return true;
	}

	boolean salaDisponivel(Sala sala, ArrayList<Integer> horarios) {
		for (int index = 0; index < ensalamento.size(); index++) {
			if (ensalamento.get(index).sala == sala) {
				for (int indexJ = 0; indexJ < ensalamento.get(index).turma.horarios.size(); indexJ++) {
					for (int indexK = 0; indexK < horarios.size(); indexK++) {
						if (horarios.get(indexK) == ensalamento.get(index).turma.horarios.get(indexJ)) {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

	boolean alocar(Turma turma, Sala sala) {
		if (!(turma.acessivel && !sala.acessivel) && !(turma.numAlunos > sala.capacidade)) {
			if (salaDisponivel(sala, turma.horarios)) {
				TurmaEmSala turmaSala = new TurmaEmSala(turma, sala);
				ensalamento.add(turmaSala);
				return true;
			}
			return false;
		}
		return false;
	}

	private double PCT(int x, int y) {
		return ((double) x * 100.0) / (double) y;
	}

	private void alocaMelhorSala(Turma turma) {
		Sala salaMelhor = null;
		double melPCT = 0.0;
		boolean salaM = false;
		if (turma.acessivel) {
			int i = 0;
			while (i < this.salas.size() && !salaM) {
				if (this.salas.get(i).acessivel) {
					if (salaDisponivel(this.salas.get(i), turma.horarios)) {
						if (PCT(turma.numAlunos, this.salas.get(i).capacidade) > melPCT
								&& PCT(turma.numAlunos, this.salas.get(i).capacidade) <= 100.00) {
							salaMelhor = this.salas.get(i);
							melPCT = PCT(turma.numAlunos, this.salas.get(i).capacidade);
							if (melPCT == 100.00) {
								salaM = true;
							}
						}
					}
				}
				i++;
			}
		} else {
			int i = 0;
			while (i < this.salas.size() && !salaM) {
				if (this.salas.get(i).acessivel == false) {
					if (salaDisponivel(this.salas.get(i), turma.horarios)) {
						if (PCT(turma.numAlunos, this.salas.get(i).capacidade) > melPCT
								&& PCT(turma.numAlunos, this.salas.get(i).capacidade) <= 100.00) {
							salaMelhor = this.salas.get(i);
							melPCT = PCT(turma.numAlunos, this.salas.get(i).capacidade);
							if (melPCT == 100.00) {
								salaM = true;
							}
						}
					}
				}
				i++;
			}

			if (salaMelhor == null) {
				i = 0;
				while (i < this.salas.size() && !salaM) {
					if (this.salas.get(i).acessivel) {
						if (salaDisponivel(this.salas.get(i), turma.horarios)) {
							if (PCT(turma.numAlunos, this.salas.get(i).capacidade) > melPCT
									&& PCT(turma.numAlunos, this.salas.get(i).capacidade) <= 100.00) {
								salaMelhor = this.salas.get(i);
								melPCT = PCT(turma.numAlunos, this.salas.get(i).capacidade);
								if (melPCT == 100.00) {
									salaM = true;
								}
							}
						}
					}
					i++;
				}
			}

		}
		if (salaMelhor != null) {
			TurmaEmSala turmaSala = new TurmaEmSala(turma, salaMelhor);
			ensalamento.add(turmaSala);
		}

	}

	void alocarTodas() {
		for (int i = 0; i < this.turmas.size(); i++) {
			alocaMelhorSala(this.turmas.get(i));
		}
	}

	int getTotalTurmasAlocadas() {
		int total = 0;
		for (int i = 0; i < this.ensalamento.size(); i++) {
			if (this.ensalamento.get(i).sala != null) {
				total++;
			}
		}
		return total;
	}

	int getTotalEspacoLivre() {
		int total = 0;
		for (int i = 0; i < this.ensalamento.size(); i++) {
			if (this.ensalamento.get(i).sala != null) {
				total += this.ensalamento.get(i).sala.capacidade - this.ensalamento.get(i).turma.numAlunos;
			}
		}
		return total;
	}

	String relatorioResumoEnsalamento() {
		String saida = "Total de Salas: " + Integer.toString(this.salas.size()) + "\nTotal de Turmas: "
				+ Integer.toString(this.turmas.size()) + "\nTurmas Alocadas: "
				+ Integer.toString(getTotalTurmasAlocadas()) + "\nEspaços Livres: "
				+ Integer.toString(getTotalEspacoLivre());
		return saida;
	}

	String relatorioTurmasPorSala() {
		String saida = this.relatorioResumoEnsalamento() + "\n";
		for (int i = 0; i < this.salas.size(); i++) {
			saida += "\n--- " + this.salas.get(i).getDescricao() + " ---\n";
			for (int j = 0; j < this.ensalamento.size(); j++) {
				if (this.ensalamento.get(j).sala == this.salas.get(i)) {
					saida += "\n" + this.ensalamento.get(j).turma.getDescricao() + "\n";
				}
			}
		}
		return saida;
	}

	String relatorioSalasPorTurma() {
		String saida = this.relatorioResumoEnsalamento() + "\n";
		for (int i = 0; i < this.turmas.size(); i++) {
			saida += "\n" + this.turmas.get(i).getDescricao() + "\n";
			if (this.getSala(this.turmas.get(i)) == null) {
				saida += "Sala: SEM SALA\n";
			} else {
				saida += "Sala: " + this.getSala(this.turmas.get(i)).getDescricao() + "\n";
			}
		}

		return saida;
	}
}
