package mx.edu.uacm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Paypal {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private Long id;
	private String cuenta;
	private double sobreCostePay;

}
