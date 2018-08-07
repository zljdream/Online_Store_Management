package com.kabir.onlinestoremanagementsystem.domain;
// Generated Jul 28, 2018 1:01:38 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * ProCategory generated by hbm2java
 */
@Entity
@Table(name="pro_category"
    ,catalog="online_store_management"
)
public class ProCategory  implements java.io.Serializable {


     private Integer categoryId;
     private String categoryName;
     private String description;
     private Set<Product> products = new HashSet<Product>(0);
     private Set<ProSubCategory> proSubCategories = new HashSet<ProSubCategory>(0);

    public ProCategory() {
    }

	
    public ProCategory(String categoryName, String description) {
        this.categoryName = categoryName;
        this.description = description;
    }
    public ProCategory(String categoryName, String description, Set<Product> products, Set<ProSubCategory> proSubCategories) {
       this.categoryName = categoryName;
       this.description = description;
       this.products = products;
       this.proSubCategories = proSubCategories;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="category_id", unique=true, nullable=false)
    public Integer getCategoryId() {
        return this.categoryId;
    }
    
    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    
    @Column(name="category_name", nullable=false, length=100)
    public String getCategoryName() {
        return this.categoryName;
    }
    
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    
    @Column(name="description", nullable=false, length=200)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="proCategory")
    public Set<Product> getProducts() {
        return this.products;
    }
    
    public void setProducts(Set<Product> products) {
        this.products = products;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="proCategory")
    public Set<ProSubCategory> getProSubCategories() {
        return this.proSubCategories;
    }
    
    public void setProSubCategories(Set<ProSubCategory> proSubCategories) {
        this.proSubCategories = proSubCategories;
    }




}


