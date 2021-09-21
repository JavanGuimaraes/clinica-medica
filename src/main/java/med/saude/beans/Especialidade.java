package med.saude.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "ESPECIALIDADE")
public class Especialidade extends AbstractEntity<Long> {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Especialidade() {
		
	}
}
