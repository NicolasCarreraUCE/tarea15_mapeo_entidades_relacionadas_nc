package ec.edu.uce;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.DetalleHotelCliente;
import ec.edu.uce.modelo.DetallePedido;
import ec.edu.uce.modelo.Hotel;
import ec.edu.uce.modelo.Pedido;
import ec.edu.uce.repository.IPedidoRepo;
import ec.edu.uce.service.IHotelServi;
import ec.edu.uce.service.IPedidoServi;

@SpringBootApplication
public class Tarea15MapeoEntidadesRelacionadasNcApplication implements CommandLineRunner {

	@Autowired
	private IHotelServi hotelServi;
	
	@Autowired
	private IPedidoServi pedidoServi;
	
	public static void main(String[] args) {
		SpringApplication.run(Tarea15MapeoEntidadesRelacionadasNcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		// Hotel
		Hotel hotel = new Hotel();
		hotel.setNombre("Swissotel");
		hotel.setDireccion("Ave 12 de Octubre 1820 y, Quito 170525");
		hotel.setNumCuartos(200);
		// Hotel Detalle
		List<DetalleHotelCliente> detalleHotel = new ArrayList<>();
		
		DetalleHotelCliente dh1 = new DetalleHotelCliente();
		dh1.setHotel(hotel);
		dh1.setNombre("David");
		dh1.setApellido("Rodrigez");
		
		DetalleHotelCliente dh2 = new DetalleHotelCliente();
		dh2.setHotel(hotel);
		dh2.setNombre("Robeth");
		dh2.setApellido("Troya");
		
		detalleHotel.add(dh1);
		detalleHotel.add(dh2);
		
		hotel.setDetalle(detalleHotel);
		
		this.hotelServi.insertarHotel(hotel);
		
		// Pedido
		Pedido pedido = new Pedido();
		pedido.setDireccionDestino("Cuero y Caicedo y, Inglaterra");
		// Pedido Detalle
		List<DetallePedido> detallePedido = new ArrayList<>();
		
		DetallePedido dp1 = new DetallePedido();
		dp1.setPedido(pedido);
		dp1.setCantidad(12);
		dp1.setNombre("Huevos");
		dp1.setPrecio(new BigDecimal(1.5));
		
		DetallePedido dp2 = new DetallePedido();
		dp2.setPedido(pedido);
		dp2.setCantidad(3);
		dp2.setNombre("Leche");
		dp2.setPrecio(new BigDecimal(2.55));
		
		detallePedido.add(dp1);
		detallePedido.add(dp2);
		
		pedido.setDetalle(detallePedido);
		
		this.pedidoServi.insertarPedido(pedido);
	}

}
