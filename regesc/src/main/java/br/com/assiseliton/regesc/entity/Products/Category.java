package br.com.assiseliton.regesc.entity.Products;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ELITON_PROJECT_CATEGORY")
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private List<Produto> product = new ArrayList<>();
//////////////////////////////
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
}
