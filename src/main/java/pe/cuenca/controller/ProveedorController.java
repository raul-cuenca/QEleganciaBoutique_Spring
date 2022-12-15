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

import pe.cuenca.model.Proveedor;
import pe.cuenca.service.ProveedorService;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedorController {
	@Autowired
	private ProveedorService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Proveedor>> get() {
		return new ResponseEntity<List<Proveedor>>(service.listar(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Proveedor producto) {

		service.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Proveedor> getId(@PathVariable Integer id) {

		Proveedor objproducto = service.obtenerId(id);

		if (objproducto != null) {
			return new ResponseEntity<Proveedor>(objproducto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Proveedor>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Proveedor producto) {

		Proveedor objproducto = service.obtenerId(producto.getIdProveedor());

		if (objproducto != null) {
			service.actualizar(objproducto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {

		Proveedor objproducto = service.obtenerId(id);

		if (objproducto != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
