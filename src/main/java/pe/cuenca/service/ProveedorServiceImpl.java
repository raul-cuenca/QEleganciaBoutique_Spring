package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Proveedor;
import pe.cuenca.model.repository.ProveedorRepository;

@Service
public class ProveedorServiceImpl implements ProveedorService {

	@Autowired
	private ProveedorRepository repository;

	@Override
	public List<Proveedor> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Proveedor obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Proveedor a) {
		repository.save(a);

	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Proveedor a) {
		repository.saveAndFlush(a);

	}

}
