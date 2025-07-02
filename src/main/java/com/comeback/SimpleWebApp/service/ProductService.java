package com.comeback.SimpleWebApp.service;

import com.comeback.SimpleWebApp.model.Product;
import com.comeback.SimpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

     @Autowired
     ProductRepo repo;

    //    Service Layer : This is Service Layer is used to handle the business logic
//    List <Product> products= new ArrayList<>(Arrays.asList(
//           new Product("Iphone",130000,101),
//            new Product("Canon Camera",70000,102),
//            new Product("Mac",150000,103)
//
//    ));

    public List<Product> getProducts(){

//        return products;
        return repo.findAll();
    }


    public Product getProductById(int prodId) {
//        return products.stream().filter(p->p.getProdId()==prodId).findFirst().get();
//        return products.stream().filter(p->p.getProdId()==prodId).findFirst().orElse(new Product("No Item",0,0));//Similar to for loop you can apply the forloop as welaswell

        return repo.findById(prodId).orElse(new Product("None",0,0));

    }

    public void addProduct(Product prod){
//        products.add(prod);
           repo.save(prod);
    }

    public void UpdateProduct(Product prod){

//        int index=0;
//        for(int i=0;i< products.size();i++)
//        {
//            if(prod.getProdId()==products.get(i).getProdId()){
//
//                index=i;
//
//            }
//        }
//
//        products.set(index,prod); //to update the arrayList.
        repo.save(prod);

    }

    public void DeleteProduct(int prodid) {
//        int index=0;
//        for(int i=0;i< products.size();i++)
//        {
//            if(prodid==products.get(i).getProdId()){
//
//                index=i;
//
//            }
//        }
//
//        products.remove(index);
        repo.deleteById(prodid);
    }
}
