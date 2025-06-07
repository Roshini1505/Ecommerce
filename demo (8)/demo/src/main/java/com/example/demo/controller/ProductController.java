package com.example.demo.controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.service.ProductService;

import lombok.Data;

@RestController

@RequestMapping("api")

//@Data

public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	@PostMapping("/product")
	
	public ResponseEntity<ResponseDTO> saveProductDetails(@RequestBody ProductDTO dto){
		return null;
		
	}
		
	@GetMapping("/product")
	
	public ResponseEntity<List<ProductDTO>> getProductDetailsById(@RequestParam("ProductId") String productId){
		
		return null;
		
	}
	
	@DeleteMapping
	
}




