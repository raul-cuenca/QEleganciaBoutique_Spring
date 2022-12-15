package pe.cuenca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	private String nombre;
	private String descripcion;
	private String categoria;
	private String marca;
	private Double precio;
	private String urlimagen;
	private Boolean estado;

}
