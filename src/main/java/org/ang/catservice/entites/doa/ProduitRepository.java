package org.ang.catservice.entites.doa;

import java.awt.print.Pageable;
import java.util.List;

import org.ang.catservice.entites.Produit;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
 
 @CrossOrigin("*")
 @RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit,Long>  {

	 @RestResource(path="ByDescription")
	 public List<Produit> findByDescriptionContains(@Param("mc") String des);
	 
	 @RestResource(path="ByDescriptionPage")
	 public Page<Produit> findByDescriptionContains(@Param("mc") String des,org.springframework.data.domain.Pageable pageable);
}
