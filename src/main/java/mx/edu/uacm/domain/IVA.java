package mx.edu.uacm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Entity
@Data
public class IVA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private double valor;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true) // siempre se pondra del lado donde esta el array //
	// orphanRemoval espara que no este relacionado a otra
	// cosa
	private List<DetalleCompra> listDetalleCompra = new ArrayList<DetalleCompra>();

}
