package pe.cuenca.service;

import java.util.List;

import pe.cuenca.model.Proveedor;

public interface ProveedorService {
	List<Proveedor> listar();

	Proveedor obtenerId(Integer id);

	void guardar(Proveedor a);

	void eliminar(Integer id);

	void actualizar(Proveedor a);
}
