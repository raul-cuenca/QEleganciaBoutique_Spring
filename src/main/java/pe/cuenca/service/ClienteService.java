package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Cliente;

public interface ClienteService {
	List<Cliente> listar();

	Cliente obtenerId(Integer id);

	void guardar(Cliente a);

	void eliminar(Integer id);

	void actualizar(Cliente a);
}
