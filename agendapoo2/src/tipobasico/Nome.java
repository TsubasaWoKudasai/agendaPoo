package tipobasico;

public class Nome {
		private String nome;
		public Nome(String nome) {
		super();
		this.nome = nome;
}
		
public String getNome() {
	return nome;
}
		
public void setNome (String nome) {
	this.nome = nome;
}

@Override
public String toString() {
	return nome;
}

}
