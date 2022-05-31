package tipo;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<Contato> contatos = new ArrayList<Contato> ();
	
		public Agenda(List<Contato> contatos) {
			this.contatos = contatos;
		}
	
		public List<Contato> getContatos(){
			return contatos;
		}

		public void setContatos(List<Contato> contatos) {
			this.contatos = contatos;
		}
		
		@Override
		public String toString() {
			return "[contatos=" + contatos + "]";
		}
		
}
