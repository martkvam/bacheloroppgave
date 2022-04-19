package com.finbev.services.caseservice.services;

import com.finbev.services.caseservice.models.Product;
import com.finbev.services.caseservice.repos.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product findApplication(){
        List<Product> productList = productRepository.findAll();
        for (Product aProduct : productList){
            if (aProduct.getType().equals("House loan application")){
                return aProduct;
            }
        }
        return null;
    }

    public Product findLoanType(String type) {
        List<Product> productList = productRepository.findAll();
        for (Product product : productList){
            if (product.getType().equals(type)){
                return product;
            }
        }
        return null;
    }
}

