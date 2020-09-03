package com.dxctraining.Product.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxctraining.Product.document.Product;

public interface IProductDao extends MongoRepository<Product,String>{

}
