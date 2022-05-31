package tipo;

import tipobasico.Celular;
import tipobasico.Email;
import tipobasico.Nome;

public class Contato {
	private Nome nome;
	private Email email;
	private Celular celular;
	
	public Contato (Nome nome, Email email, Celular celular) {
		super();
		this.nome = nome;
		this.email= email;
		this.celular = celular;
	}
	
	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", email= " + email + ",celular= " + celular + "]";
		
	}
}
