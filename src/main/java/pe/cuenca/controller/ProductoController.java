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

import pe.cuenca.model.Producto;
import pe.cuenca.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	@Autowired
	private ProductoService service;

	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Producto>> get() {
		return new ResponseEntity<List<Producto>>(service.listar(), HttpStatus.OK);
	}

	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> save(@RequestBody Producto producto) {

		service.guardar(producto);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@RequestMapping(path = "/listar/{id}", method = RequestMethod.GET)
	public ResponseEntity<Producto> getId(@PathVariable Integer id) {

		Producto objproducto = service.obtenerId(id);

		if (objproducto != null) {
			return new ResponseEntity<Producto>(objproducto, HttpStatus.OK);
		} else {
			return new ResponseEntity<Producto>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(path = "/actualizar", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Producto producto) {

		Producto objproducto = service.obtenerId(producto.getIdProducto());

		if (objproducto != null) {
			service.actualizar(objproducto);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}

	}

	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {

		Producto objproducto = service.obtenerId(id);

		if (objproducto != null) {
			service.eliminar(id);
			return new ResponseEntity<Void>(HttpStatus.OK);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
	}

}
