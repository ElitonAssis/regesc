package br.com.assiseliton.regesc.rest.produto;

import br.com.assiseliton.regesc.entity.Products.Category;
import br.com.assiseliton.regesc.entity.Products.Produto;
import br.com.assiseliton.regesc.service.product.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("product")
public class ProductController {
  @Autowired
  private ProductService productService;
    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody Category product){
        return this.productService.register(product);
    }
    @GetMapping("desc/{desc}")
    public ResponseEntity<?> getBydesc(@PathVariable("desc")String desc){
      return  this.productService.getDesc(desc);
    }
    @DeleteMapping("delete/{id}" )
    public ResponseEntity<?> delete(@PathVariable("id")int id ){
      return this.productService.delete(id);
    }
    @PutMapping("update")
  public ResponseEntity<?> update(@RequestBody Produto product){
      return this.productService.update(product);
    }

}
