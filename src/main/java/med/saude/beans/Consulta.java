package med.saude.beans;

import javax.persistence.Entity;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "CONSULTA")
public class Consulta extends AbstractEntity<Long>{
	Especialidade especialidade;
	Medico medico;
}
