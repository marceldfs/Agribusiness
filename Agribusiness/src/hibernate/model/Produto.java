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
@Table(name="produto")
public class Produto implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Nome")
	private String nome;
	
	@Column(name="Id_categoria")
	private String id_categoria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(String id_categoria) {
		this.id_categoria = id_categoria;
	}
	
	
	

}
