package app;

public class OrdernarAlunos {
	CadastroAlunos source;
	String matricula1;
	String matricula2;
	Aluno respostas[];
	Aluno t;
	
	public OrdernarAlunos(CadastroAlunos source) {
		this.source = source;
	}
	
	public Aluno[] ordenar() {
		this.respostas = new Aluno[this.source.alunos.length];
		//copia o vetor para o vetor de resposta
		for (int i=0; i < this.source.alunos.length; i++) {
			this.respostas[i] = this.source.alunos[i]; 
		}
		
		for (int i = 0; i < this.respostas.length - 1; i++) {
			for (int j = i; j < this.respostas.length; j++) {
				this.matricula1 = this.source.matriculaAluno(this.respostas[i]);
				this.matricula2 = this.source.matriculaAluno(this.respostas[j]);
				if (matricula1.compareTo(matricula2) > 0) {
					this.t = this.respostas[i]; 
					this.respostas[i] = this.respostas[j];
					this.respostas[j] = this.t;
				}
			}
		}
		
		return this.respostas;
	}
}
