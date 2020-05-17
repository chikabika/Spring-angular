package org.ang.catservice.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Produit implements	Serializable {
	
	

	public Produit() {
		super();
	}
	public Produit(Long id, String description, double price, int quantite) {
		super();
		this.id = id;
		this.description = description;
		this.price = price;
		this.quantite = quantite;
	}
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String description;
	private double price;
	private int quantite;
	
	
	

}
