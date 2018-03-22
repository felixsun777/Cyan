package com.cyan.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class ProductExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public ProductExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()), property);
		}

		protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property + " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andProductIdIsNull() {
			addCriterion("product_id is null");
			return (Criteria) this;
		}

		public Criteria andProductIdIsNotNull() {
			addCriterion("product_id is not null");
			return (Criteria) this;
		}

		public Criteria andProductIdEqualTo(Integer value) {
			addCriterion("product_id =", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotEqualTo(Integer value) {
			addCriterion("product_id <>", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThan(Integer value) {
			addCriterion("product_id >", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("product_id >=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThan(Integer value) {
			addCriterion("product_id <", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdLessThanOrEqualTo(Integer value) {
			addCriterion("product_id <=", value, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdIn(List<Integer> values) {
			addCriterion("product_id in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotIn(List<Integer> values) {
			addCriterion("product_id not in", values, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdBetween(Integer value1, Integer value2) {
			addCriterion("product_id between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
			addCriterion("product_id not between", value1, value2, "productId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIsNull() {
			addCriterion("category_id is null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIsNotNull() {
			addCriterion("category_id is not null");
			return (Criteria) this;
		}

		public Criteria andCategoryIdEqualTo(Integer value) {
			addCriterion("category_id =", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotEqualTo(Integer value) {
			addCriterion("category_id <>", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThan(Integer value) {
			addCriterion("category_id >", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
			addCriterion("category_id >=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThan(Integer value) {
			addCriterion("category_id <", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
			addCriterion("category_id <=", value, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdIn(List<Integer> values) {
			addCriterion("category_id in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotIn(List<Integer> values) {
			addCriterion("category_id not in", values, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
			addCriterion("category_id between", value1, value2, "categoryId");
			return (Criteria) this;
		}

		public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
			addCriterion("category_id not between", value1, value2, "categoryId");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNull() {
			addCriterion("product_name is null");
			return (Criteria) this;
		}

		public Criteria andProductNameIsNotNull() {
			addCriterion("product_name is not null");
			return (Criteria) this;
		}

		public Criteria andProductNameEqualTo(String value) {
			addCriterion("product_name =", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotEqualTo(String value) {
			addCriterion("product_name <>", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThan(String value) {
			addCriterion("product_name >", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameGreaterThanOrEqualTo(String value) {
			addCriterion("product_name >=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThan(String value) {
			addCriterion("product_name <", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLessThanOrEqualTo(String value) {
			addCriterion("product_name <=", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameLike(String value) {
			addCriterion("product_name like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotLike(String value) {
			addCriterion("product_name not like", value, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameIn(List<String> values) {
			addCriterion("product_name in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotIn(List<String> values) {
			addCriterion("product_name not in", values, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameBetween(String value1, String value2) {
			addCriterion("product_name between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andProductNameNotBetween(String value1, String value2) {
			addCriterion("product_name not between", value1, value2, "productName");
			return (Criteria) this;
		}

		public Criteria andStockIsNull() {
			addCriterion("stock is null");
			return (Criteria) this;
		}

		public Criteria andStockIsNotNull() {
			addCriterion("stock is not null");
			return (Criteria) this;
		}

		public Criteria andStockEqualTo(Integer value) {
			addCriterion("stock =", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockNotEqualTo(Integer value) {
			addCriterion("stock <>", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockGreaterThan(Integer value) {
			addCriterion("stock >", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockGreaterThanOrEqualTo(Integer value) {
			addCriterion("stock >=", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockLessThan(Integer value) {
			addCriterion("stock <", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockLessThanOrEqualTo(Integer value) {
			addCriterion("stock <=", value, "stock");
			return (Criteria) this;
		}

		public Criteria andStockIn(List<Integer> values) {
			addCriterion("stock in", values, "stock");
			return (Criteria) this;
		}

		public Criteria andStockNotIn(List<Integer> values) {
			addCriterion("stock not in", values, "stock");
			return (Criteria) this;
		}

		public Criteria andStockBetween(Integer value1, Integer value2) {
			addCriterion("stock between", value1, value2, "stock");
			return (Criteria) this;
		}

		public Criteria andStockNotBetween(Integer value1, Integer value2) {
			addCriterion("stock not between", value1, value2, "stock");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("price is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("price is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(Double value) {
			addCriterion("price =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(Double value) {
			addCriterion("price <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(Double value) {
			addCriterion("price >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(Double value) {
			addCriterion("price >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(Double value) {
			addCriterion("price <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(Double value) {
			addCriterion("price <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<Double> values) {
			addCriterion("price in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<Double> values) {
			addCriterion("price not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(Double value1, Double value2) {
			addCriterion("price between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(Double value1, Double value2) {
			addCriterion("price not between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andMsrpIsNull() {
			addCriterion("msrp is null");
			return (Criteria) this;
		}

		public Criteria andMsrpIsNotNull() {
			addCriterion("msrp is not null");
			return (Criteria) this;
		}

		public Criteria andMsrpEqualTo(Double value) {
			addCriterion("msrp =", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpNotEqualTo(Double value) {
			addCriterion("msrp <>", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpGreaterThan(Double value) {
			addCriterion("msrp >", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpGreaterThanOrEqualTo(Double value) {
			addCriterion("msrp >=", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpLessThan(Double value) {
			addCriterion("msrp <", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpLessThanOrEqualTo(Double value) {
			addCriterion("msrp <=", value, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpIn(List<Double> values) {
			addCriterion("msrp in", values, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpNotIn(List<Double> values) {
			addCriterion("msrp not in", values, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpBetween(Double value1, Double value2) {
			addCriterion("msrp between", value1, value2, "msrp");
			return (Criteria) this;
		}

		public Criteria andMsrpNotBetween(Double value1, Double value2) {
			addCriterion("msrp not between", value1, value2, "msrp");
			return (Criteria) this;
		}

		public Criteria andAvailableDateIsNull() {
			addCriterion("available_date is null");
			return (Criteria) this;
		}

		public Criteria andAvailableDateIsNotNull() {
			addCriterion("available_date is not null");
			return (Criteria) this;
		}

		public Criteria andAvailableDateEqualTo(Date value) {
			addCriterionForJDBCDate("available_date =", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateNotEqualTo(Date value) {
			addCriterionForJDBCDate("available_date <>", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateGreaterThan(Date value) {
			addCriterionForJDBCDate("available_date >", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("available_date >=", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateLessThan(Date value) {
			addCriterionForJDBCDate("available_date <", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("available_date <=", value, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateIn(List<Date> values) {
			addCriterionForJDBCDate("available_date in", values, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateNotIn(List<Date> values) {
			addCriterionForJDBCDate("available_date not in", values, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("available_date between", value1, value2, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAvailableDateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("available_date not between", value1, value2, "availableDate");
			return (Criteria) this;
		}

		public Criteria andAverageRankingIsNull() {
			addCriterion("average_ranking is null");
			return (Criteria) this;
		}

		public Criteria andAverageRankingIsNotNull() {
			addCriterion("average_ranking is not null");
			return (Criteria) this;
		}

		public Criteria andAverageRankingEqualTo(Double value) {
			addCriterion("average_ranking =", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingNotEqualTo(Double value) {
			addCriterion("average_ranking <>", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingGreaterThan(Double value) {
			addCriterion("average_ranking >", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingGreaterThanOrEqualTo(Double value) {
			addCriterion("average_ranking >=", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingLessThan(Double value) {
			addCriterion("average_ranking <", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingLessThanOrEqualTo(Double value) {
			addCriterion("average_ranking <=", value, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingIn(List<Double> values) {
			addCriterion("average_ranking in", values, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingNotIn(List<Double> values) {
			addCriterion("average_ranking not in", values, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingBetween(Double value1, Double value2) {
			addCriterion("average_ranking between", value1, value2, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andAverageRankingNotBetween(Double value1, Double value2) {
			addCriterion("average_ranking not between", value1, value2, "averageRanking");
			return (Criteria) this;
		}

		public Criteria andImageIsNull() {
			addCriterion("image is null");
			return (Criteria) this;
		}

		public Criteria andImageIsNotNull() {
			addCriterion("image is not null");
			return (Criteria) this;
		}

		public Criteria andImageEqualTo(String value) {
			addCriterion("image =", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotEqualTo(String value) {
			addCriterion("image <>", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThan(String value) {
			addCriterion("image >", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageGreaterThanOrEqualTo(String value) {
			addCriterion("image >=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThan(String value) {
			addCriterion("image <", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLessThanOrEqualTo(String value) {
			addCriterion("image <=", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageLike(String value) {
			addCriterion("image like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotLike(String value) {
			addCriterion("image not like", value, "image");
			return (Criteria) this;
		}

		public Criteria andImageIn(List<String> values) {
			addCriterion("image in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotIn(List<String> values) {
			addCriterion("image not in", values, "image");
			return (Criteria) this;
		}

		public Criteria andImageBetween(String value1, String value2) {
			addCriterion("image between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andImageNotBetween(String value1, String value2) {
			addCriterion("image not between", value1, value2, "image");
			return (Criteria) this;
		}

		public Criteria andBrandIsNull() {
			addCriterion("brand is null");
			return (Criteria) this;
		}

		public Criteria andBrandIsNotNull() {
			addCriterion("brand is not null");
			return (Criteria) this;
		}

		public Criteria andBrandEqualTo(String value) {
			addCriterion("brand =", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotEqualTo(String value) {
			addCriterion("brand <>", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandGreaterThan(String value) {
			addCriterion("brand >", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandGreaterThanOrEqualTo(String value) {
			addCriterion("brand >=", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLessThan(String value) {
			addCriterion("brand <", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLessThanOrEqualTo(String value) {
			addCriterion("brand <=", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandLike(String value) {
			addCriterion("brand like", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotLike(String value) {
			addCriterion("brand not like", value, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandIn(List<String> values) {
			addCriterion("brand in", values, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotIn(List<String> values) {
			addCriterion("brand not in", values, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandBetween(String value1, String value2) {
			addCriterion("brand between", value1, value2, "brand");
			return (Criteria) this;
		}

		public Criteria andBrandNotBetween(String value1, String value2) {
			addCriterion("brand not between", value1, value2, "brand");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table product
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	public static class Criterion {
		private String condition;
		private Object value;
		private Object secondValue;
		private boolean noValue;
		private boolean singleValue;
		private boolean betweenValue;
		private boolean listValue;
		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table product
     *
     * @mbg.generated do_not_delete_during_merge Sun Jan 28 18:44:57 EST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}