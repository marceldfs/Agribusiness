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
@Table(name="pedido_produto")
public class Pedido_produto implements Serializable{

	@Id
	@GeneratedValue
	@Column(name="Id")
	public int id;
	
	@Column(name="Id_pedido")
	public int id_pedido;
	
	@Column(name="Id_produto")
	public int id_produto;

	@Column(name="Quantidade")
	public int Quantidade;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_pedido() {
		return id_pedido;
	}

	public void setId_pedido(int id_pedido) {
		this.id_pedido = id_pedido;
	}

	public int getId_produto() {
		return id_produto;
	}

	public void setId_produto(int id_produto) {
		this.id_produto = id_produto;
	}

	public int getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(int quantidade) {
		Quantidade = quantidade;
	}
	
	
}
