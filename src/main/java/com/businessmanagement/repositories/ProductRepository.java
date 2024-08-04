package com.businessmanagement.repositories;

import com.businessmanagement.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer>
{
    public Product findByPname(String name);

}

