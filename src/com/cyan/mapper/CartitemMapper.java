package com.cyan.mapper;

import com.cyan.entity.Cartitem;
import com.cyan.entity.CartitemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartitemMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	long countByExample(CartitemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int deleteByExample(CartitemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int deleteByPrimaryKey(Integer itemId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int insert(Cartitem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int insertSelective(Cartitem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	List<Cartitem> selectByExample(CartitemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	Cartitem selectByPrimaryKey(Integer itemId);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int updateByExampleSelective(@Param("record") Cartitem record, @Param("example") CartitemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int updateByExample(@Param("record") Cartitem record, @Param("example") CartitemExample example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int updateByPrimaryKeySelective(Cartitem record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table cartitem
	 * @mbg.generated  Mon Feb 26 10:47:49 EST 2018
	 */
	int updateByPrimaryKey(Cartitem record);
}