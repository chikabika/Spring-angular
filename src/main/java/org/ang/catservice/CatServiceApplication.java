package org.ang.catservice;

import org.ang.catservice.entites.Produit;
import org.ang.catservice.entites.doa.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CatServiceApplication implements CommandLineRunner {

	@Autowired
	 private  ProduitRepository produitRepository;
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	
	
	
	  
	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	restConfiguration.exposeIdsFor(Produit.class);
	
//	produitRepository.save(new Produit(null, "New PC", 1000,8));
  //  produitRepository.save(new Produit(null, "New SMArtPhoen", 999, 7));
	
	//produitRepository.findAll().forEach(p->{
		//System.out.println(p.toString());
	//});
		
		
	}

}
