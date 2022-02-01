package ec.edu.uce.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "hotel")
public class Hotel {

	@Id
	@Column(name = "hote_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_hotel") // General el id aprtir de una secuancia
	@SequenceGenerator(name = "seq_hotel", sequenceName = "seq_hotel", allocationSize = 1)	
	private Integer id;
	
	@Column(name = "hote_nombre")
	private String nombre;
	
	@Column(name = "hote_direccion")
	private String direccion;
	
	@Column(name = "hote_num_cuartos")
	private Integer numCuartos;
	
	
	@OneToMany(mappedBy = "hotel", cascade = CascadeType.ALL)
	private List<DetalleHotelCliente> detalle;
	
	// SET-GET
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getNumCuartos() {
		return numCuartos;
	}
	public void setNumCuartos(Integer numCuartos) {
		this.numCuartos = numCuartos;
	}
	public List<DetalleHotelCliente> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<DetalleHotelCliente> detalle) {
		this.detalle = detalle;
	}
	
}
