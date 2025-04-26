package com.example.demo.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.dao.ProductRepository;
import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;

//import lombok.Data;

@Service
//@Data

public class ProductServiceImpl implements ProductService

{
	
	@Autowired
	 ProductRepository productRepository;

	@Override
	public List<ProductDTO> getProductDetailsById(String productId) {
	
		//ProductResponseDTO product1 = new ProductResponseDTO();
		
		
		ProductEntity product1 = new ProductEntity();
	
		
		ProductDTO dto = new ProductDTO();
		Optional<ProductEntity> productOpt = productRepository.findById(productId);
		
		List<ProductDTO> dtos = new ArrayList<>();
		if(! productOpt.isEmpty()) {
			
		ProductEntity product1 = productOpt.get();
		dto.setProductId(product1.getProductId());
		dto.setProductName(product1.getProductName());
		dto.setProductQty(product1.getProductQty());
		dto.setProductMRP(product1.getProductMRP());
		dto.setProductPrice(product1.getProductPrice());
		dto.setProductTax(product1.getProductTax());
		}
		return dtos;
	}
}

