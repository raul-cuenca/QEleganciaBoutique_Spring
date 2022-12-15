package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Producto;
import pe.cuenca.model.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

	@Autowired
	private ProductoRepository repository;

	@Override
	public List<Producto> listar() {
		return repository.findAll();
	}

	@Override
	public Producto obtenerId(Integer id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Producto a) {
		repository.save(a);
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Producto a) {
		repository.saveAndFlush(a);
	}

}
