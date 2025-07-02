package com.comeback.SimpleWebApp.repository;

import com.comeback.SimpleWebApp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
//    JpaRepository<T, ID>
//    T → The Entity class you're managing (in your case, Product)
//
//    ID → The data type of the primary key (@Id) field of that entity

}
