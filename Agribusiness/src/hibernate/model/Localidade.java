package hibernate.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * @author Tassio Do Rosario
 *
 */

@SuppressWarnings("serial")
@Entity
@Table(name="localidade")
public class Localidade implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Id_distrito")
	private String id_distrito;
	
	@Column(name="Nome")
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getId_distrito() {
		return id_distrito;
	}

	public void setId_distrito(String id_distrito) {
		this.id_distrito = id_distrito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
