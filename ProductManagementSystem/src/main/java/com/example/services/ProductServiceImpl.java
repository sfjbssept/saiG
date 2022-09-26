package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Product;
import com.example.repo.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	IProductRepository iproductrepo;
	
	@Override
	public Integer addProduct(Product product) {
		Product productNew = iproductrepo.save(product);
		return productNew.getProductId();
	}

}
