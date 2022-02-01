package ec.edu.uce.modelo;

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
@Table(name = "hotel_cliente")
public class DetalleHotelCliente {

	@Id
	@Column(name = "clien_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hotel_cliente") // General el id aprtir de una secuancia
	@SequenceGenerator(name = "seq_hotel_cliente", sequenceName = "seq_hotel_cliente", allocationSize = 1)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;
	
	@Column(name = "clien_nombre")
	private String nombre;
	
	@Column(name = "clien_apellido")
	private String apellido;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
}
