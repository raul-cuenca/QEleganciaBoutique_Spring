package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Producto;

public interface ProductoService {
	List<Producto> listar();

	Producto obtenerId(Integer id);

	void guardar(Producto a);

	void eliminar(Integer id);

	void actualizar(Producto a);
}
