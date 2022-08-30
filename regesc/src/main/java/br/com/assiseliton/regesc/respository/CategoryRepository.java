package br.com.assiseliton.regesc.respository;

import br.com.assiseliton.regesc.entity.Products.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category,Integer> {
}
