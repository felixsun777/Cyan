package com.cyan.service;

import java.util.List;

import com.cyan.entity.Orderdetail;
import com.cyan.entity.Product;
import com.cyan.entity.Review;


public interface ProductService {

	List<Product> retrieveAllProducts();
	boolean insertProduct(Product product);
	boolean deleteProduct(Integer productId);
	boolean updateProduct(Product product);
	List<Review> retrieveProductReviews(Integer productId);

}
