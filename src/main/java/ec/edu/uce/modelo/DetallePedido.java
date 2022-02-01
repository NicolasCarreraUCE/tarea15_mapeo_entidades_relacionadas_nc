package ec.edu.uce.modelo;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "pedido_detalle")
public class DetallePedido {

	@Id
	@Column(name = "depe_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pedido_detalle") // General el id aprtir de una secuancia
	@SequenceGenerator(name = "seq_pedido_detalle", sequenceName = "seq_pedido_detalle", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "pedi_id")
	private Pedido pedido;
	
	@Column(name = "depe_cantidad")
	private Integer cantidad;
	
	@Column(name = "depe_nombre")
	private String nombre;
	
	@Column(name = "depe_precio")
	private BigDecimal precio;
	
	
	
	
	// SET-GET	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
}
