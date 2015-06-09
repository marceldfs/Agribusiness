package hibernate.model;
import java.io.Serializable;
import java.util.Date;

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
@Table(name="pedido")
public class Pedido implements Serializable {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	
	@Column(name="Id_entidade")
	private int id_entidade;
	
	@Column(name="Data_entrega")
	private Date data_entrega;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_entidade() {
		return id_entidade;
	}

	public void setId_entidade(int id_entidade) {
		this.id_entidade = id_entidade;
	}

	public Date getData_entrega() {
		return data_entrega;
	}

	public void setData_entrega(Date data_entrega) {
		this.data_entrega = data_entrega;
	}
	
	
}
