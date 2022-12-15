package pe.cuenca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.cuenca.model.Cliente;
import pe.cuenca.model.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository repository;

	@Override
	public List<Cliente> listar() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public Cliente obtenerId(Integer id) {
		// TODO Auto-generated method stub
		return repository.findById(id).orElse(null);
	}

	@Override
	public void guardar(Cliente a) {
		repository.save(a);

	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);

	}

	@Override
	public void actualizar(Cliente a) {
		repository.saveAndFlush(a);

	}

}
