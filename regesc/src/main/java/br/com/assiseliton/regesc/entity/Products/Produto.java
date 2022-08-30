package br.com.assiseliton.regesc.entity.Products;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
@Entity
@Table(name = "ELITON_PROJECT_PRODUTOS")
public class Produto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private BigDecimal amount;
    @Column(nullable = false)
    private BigDecimal price;

    @ManyToOne()
    @JoinColumn(name = "category_ID", nullable = false)
    private Category category = new Category();
/////////////////////////////////////////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
