package pe.cuenca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pe.cuenca.model.Cliente;
import pe.cuenca.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
	@Autowired
	private ClienteService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Cliente>> get() {
		return new ResponseEntity<List<Cliente>>(service.listar(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Cliente producto) {

		service.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> getId(@PathVariable Integer id) {

		Cliente objproducto = service.obtenerId(id);

		if (objproducto != null) {
			return new ResponseEntity<Cliente>(objproducto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Cliente>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Cliente producto) {

		Cliente objproducto = service.obtenerId(producto.getIdCliente());

		if (objproducto != null) {
			service.actualizar(objproducto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {

		Cliente objproducto = service.obtenerId(id);

		if (objproducto != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
