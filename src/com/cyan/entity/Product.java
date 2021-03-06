package com.cyan.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Product {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.product_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Integer productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.category_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Integer categoryId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.product_name
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private String productName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.stock
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Integer stock;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.price
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Double price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.msrp
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Double msrp;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.available_date
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	@DateTimeFormat(pattern = "MM-dd-yyyy")
	private Date availableDate;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.average_ranking
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private Double averageRanking;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.image
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private String image;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.brand
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private String brand;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product.description
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	private String description;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.product_id
	 * @return  the value of product.product_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.product_id
	 * @param productId  the value for product.product_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.category_id
	 * @return  the value of product.category_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getCategoryId() {
		return categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.category_id
	 * @param categoryId  the value for product.category_id
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.product_name
	 * @return  the value of product.product_name
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.product_name
	 * @param productName  the value for product.product_name
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.stock
	 * @return  the value of product.stock
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.stock
	 * @param stock  the value for product.stock
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.price
	 * @return  the value of product.price
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.price
	 * @param price  the value for product.price
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.msrp
	 * @return  the value of product.msrp
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getMsrp() {
		return msrp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.msrp
	 * @param msrp  the value for product.msrp
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setMsrp(Double msrp) {
		this.msrp = msrp;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.available_date
	 * @return  the value of product.available_date
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Date getAvailableDate() {
		return availableDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.available_date
	 * @param availableDate  the value for product.available_date
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setAvailableDate(Date availableDate) {
		this.availableDate = availableDate;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.average_ranking
	 * @return  the value of product.average_ranking
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Double getAverageRanking() {
		return averageRanking;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.average_ranking
	 * @param averageRanking  the value for product.average_ranking
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setAverageRanking(Double averageRanking) {
		this.averageRanking = averageRanking;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.image
	 * @return  the value of product.image
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public String getImage() {
		return image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.image
	 * @param image  the value for product.image
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.brand
	 * @return  the value of product.brand
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.brand
	 * @param brand  the value for product.brand
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product.description
	 * @return  the value of product.description
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product.description
	 * @param description  the value for product.description
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}