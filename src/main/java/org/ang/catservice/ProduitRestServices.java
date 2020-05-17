package org.ang.catservice;

import java.util.List;

import org.ang.catservice.entites.Produit;
import org.ang.catservice.entites.doa.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProduitRestServices {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping(value="/listproduits/{id}")
	public Produit listProduits(@PathVariable(name="id") Long id){
		
		return produitRepository.findById(id).get();
	}
	
	@PutMapping(value="/listproduits/{id}")
	public Produit update(@PathVariable(name="id") Long id,@RequestBody Produit p){
		
		p.setId(id);
		return produitRepository.save(p);
	}
	
	
	//Po(value="/listproduits")
	@GetMapping(value="/listPoduits")
	public List<Produit> listPoduits(){
		
		return produitRepository.findAll();
	}

	
	@DeleteMapping(value="/listproduits/{id}")
	public void delete(@PathVariable(name="id") Long id){
		
		
		 produitRepository.deleteById(id);
	}
}
