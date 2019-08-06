package mx.edu.uacm.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Libro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter Long id;

	private @Getter @Setter int isbn;

	@Column(length = 45)
	private @Getter @Setter String nombre;

	@Column(length = 45)
	private @Getter @Setter String autor;

	@Column(length = 500)
	private @Getter @Setter String sipnosis;

	private @Getter @Setter byte descatalogado;

	@ManyToOne
	private @Getter @Setter Publicacion publicacion;

	@ManyToOne
	private @Getter @Setter Valoracion valoracion;

	@ManyToOne
	private @Getter @Setter Stock stock;

	@ManyToOne
	private @Getter @Setter Categoria categoria;

}
