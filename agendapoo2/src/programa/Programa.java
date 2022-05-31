package programa;

import java.util.ArrayList;
import java.util.List;

import tipobasico.Nome;
import tipobasico.Celular;
import tipobasico.Email;

import tipo.Agenda;
import tipo.Contato;

public class Programa {
	
	public void main (String[] args) {

	Nome nome1 = new Nome ("joao") ;
	Email email1 = new Email ("joao@gmail.com") ;
	Celular cell1 = new Celular ("41933000682") ;
	
	Nome nome2 = new Nome ("lucas") ;
	Email email2 = new Email ("lucas@gmail.com") ;
	Celular cell2 = new Celular ("41933000683") ;
	
	Contato contato1 = new Contato(nome1, email1, cell1);
	Contato contato2 = new Contato(nome2, email2, cell2);

	List<Contato> contatoLista1 = new ArrayList<Contato>();
	contatoLista1.add(contato1);
	contatoLista1.add(contato2);

	Agenda agenda = new Agenda(contatoLista1);
	System.out.println(agenda);
	}
}
	
