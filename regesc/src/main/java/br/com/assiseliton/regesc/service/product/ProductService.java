package br.com.assiseliton.regesc.service.product;

import br.com.assiseliton.regesc.entity.Products.Category;
import br.com.assiseliton.regesc.entity.Products.Produto;
import br.com.assiseliton.regesc.respository.CategoryRepository;
import br.com.assiseliton.regesc.respository.ProductRepository;
import br.com.assiseliton.regesc.utlity.ResponseMensage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ResponseMensage response;

    public ResponseEntity<?> register(Category product) {
        if (product != null) {
            return new ResponseEntity<>(this.categoryRepository.save(product), HttpStatus.OK);
        } else {
            response.setResponse("CADASTRO NÃO REALIZADO...");
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> getDesc(String description) {
        String desc = description;
        desc.toLowerCase();
        if (desc.contains("#") || desc.contains("$") || desc.contains("@") || desc.contains("&")) {
            return new ResponseEntity<>(this.productRepository.findByDescriptionContaining(desc), HttpStatus.OK);
        } else {
            response.setResponse("Não encontrado, 404");
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        }
    }
    public ResponseEntity<?> delete(Integer id) {
        if (id != null && id != 0) {
            response.setResponse(" Produto do " + id + " deletado...");
            return new ResponseEntity<>(response, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    public ResponseEntity<?> update(Produto product) {
        //se o produto não existe não quero salvar
        Produto produto = this.productRepository.findById(product.getId()).orElse(null);
        if (produto != null) {
            return new ResponseEntity<>(this.productRepository.save(product), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}


