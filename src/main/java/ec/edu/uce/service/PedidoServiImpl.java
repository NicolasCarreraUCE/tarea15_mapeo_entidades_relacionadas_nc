package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Pedido;
import ec.edu.uce.repository.IPedidoRepo;

@Service
public class PedidoServiImpl implements IPedidoServi {

	@Autowired
	private IPedidoRepo pedidoRepo;
	
	@Override
	public void insertarPedido(Pedido pedido) {
		// TODO Auto-generated method stub
		this.pedidoRepo.insertarPedido(pedido);
	}

}
