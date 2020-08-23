package com.gaoyh.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gaoyh.app.model.Product;

import lombok.Data;

@Data
@Controller
@RequestMapping(value = "/product")
@DependsOn({"initSysProp"})
public class ProductController {
	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

	@Value("${name}")
//	@Value("#{database-config['name']}")
	private String name;
	
	@RequestMapping("")
	public String page() {
		logger.info("name:{}", name);
		return "product";
	}

	@RequestMapping(value = "/{productId}", method = RequestMethod.GET, produces = "application/json")
	@ResponseBody
	public Product getProductById(@PathVariable Long productId) {
		Product p = new Product();
		p.setId(productId);
		p.setNameName("苹果");
		logger.info("product:{}", p);
		return p;
	}

}
