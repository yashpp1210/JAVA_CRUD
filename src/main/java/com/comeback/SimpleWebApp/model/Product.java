package com.comeback.SimpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@NoArgsConstructor
@Entity
@Data
public class Product {

    //Model layer : Which contains mostly the data part.

    @Id
    private int prodId;
    private String prodName;
    private int price;




    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public Product(String prodName, int price, int prodId) {
        this.prodName = prodName;
        this.price = price;
        this.prodId = prodId;
    }
    

}
