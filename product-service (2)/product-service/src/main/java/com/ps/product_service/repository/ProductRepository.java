package com.ps.product_service.repository;

import com.ps.product_service.modal.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product,String> {
}
