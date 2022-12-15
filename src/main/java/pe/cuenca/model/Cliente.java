package pe.cuenca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private String apellido;
	private String nroDocumento;
	private String telefono;
	private String direccion;
	private String urlimagen;

}
