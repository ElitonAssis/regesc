package br.com.assiseliton.regesc.respository;

import br.com.assiseliton.regesc.entity.Products.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Produto, Integer> {
   List <Produto> findByDescriptionContaining(String desc);
}
