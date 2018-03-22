package com.cyan.entity;

import java.util.ArrayList;
import java.util.List;

public class CreditcardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public CreditcardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(Integer value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(Integer value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(Integer value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(Integer value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(Integer value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<Integer> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<Integer> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(Integer value1, Integer value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(Integer value1, Integer value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNull() {
            addCriterion("card_number is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("card_number is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(Long value) {
            addCriterion("card_number =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(Long value) {
            addCriterion("card_number <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(Long value) {
            addCriterion("card_number >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("card_number >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(Long value) {
            addCriterion("card_number <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(Long value) {
            addCriterion("card_number <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<Long> values) {
            addCriterion("card_number in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<Long> values) {
            addCriterion("card_number not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(Long value1, Long value2) {
            addCriterion("card_number between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(Long value1, Long value2) {
            addCriterion("card_number not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNull() {
            addCriterion("holder_name is null");
            return (Criteria) this;
        }

        public Criteria andHolderNameIsNotNull() {
            addCriterion("holder_name is not null");
            return (Criteria) this;
        }

        public Criteria andHolderNameEqualTo(String value) {
            addCriterion("holder_name =", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotEqualTo(String value) {
            addCriterion("holder_name <>", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThan(String value) {
            addCriterion("holder_name >", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameGreaterThanOrEqualTo(String value) {
            addCriterion("holder_name >=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThan(String value) {
            addCriterion("holder_name <", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLessThanOrEqualTo(String value) {
            addCriterion("holder_name <=", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameLike(String value) {
            addCriterion("holder_name like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotLike(String value) {
            addCriterion("holder_name not like", value, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameIn(List<String> values) {
            addCriterion("holder_name in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotIn(List<String> values) {
            addCriterion("holder_name not in", values, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameBetween(String value1, String value2) {
            addCriterion("holder_name between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andHolderNameNotBetween(String value1, String value2) {
            addCriterion("holder_name not between", value1, value2, "holderName");
            return (Criteria) this;
        }

        public Criteria andCvvIsNull() {
            addCriterion("cvv is null");
            return (Criteria) this;
        }

        public Criteria andCvvIsNotNull() {
            addCriterion("cvv is not null");
            return (Criteria) this;
        }

        public Criteria andCvvEqualTo(Integer value) {
            addCriterion("cvv =", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotEqualTo(Integer value) {
            addCriterion("cvv <>", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvGreaterThan(Integer value) {
            addCriterion("cvv >", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvGreaterThanOrEqualTo(Integer value) {
            addCriterion("cvv >=", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvLessThan(Integer value) {
            addCriterion("cvv <", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvLessThanOrEqualTo(Integer value) {
            addCriterion("cvv <=", value, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvIn(List<Integer> values) {
            addCriterion("cvv in", values, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotIn(List<Integer> values) {
            addCriterion("cvv not in", values, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvBetween(Integer value1, Integer value2) {
            addCriterion("cvv between", value1, value2, "cvv");
            return (Criteria) this;
        }

        public Criteria andCvvNotBetween(Integer value1, Integer value2) {
            addCriterion("cvv not between", value1, value2, "cvv");
            return (Criteria) this;
        }

        public Criteria andExpireYearIsNull() {
            addCriterion("expire_year is null");
            return (Criteria) this;
        }

        public Criteria andExpireYearIsNotNull() {
            addCriterion("expire_year is not null");
            return (Criteria) this;
        }

        public Criteria andExpireYearEqualTo(Integer value) {
            addCriterion("expire_year =", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotEqualTo(Integer value) {
            addCriterion("expire_year <>", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearGreaterThan(Integer value) {
            addCriterion("expire_year >", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_year >=", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearLessThan(Integer value) {
            addCriterion("expire_year <", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearLessThanOrEqualTo(Integer value) {
            addCriterion("expire_year <=", value, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearIn(List<Integer> values) {
            addCriterion("expire_year in", values, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotIn(List<Integer> values) {
            addCriterion("expire_year not in", values, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearBetween(Integer value1, Integer value2) {
            addCriterion("expire_year between", value1, value2, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireYearNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_year not between", value1, value2, "expireYear");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNull() {
            addCriterion("expire_month is null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIsNotNull() {
            addCriterion("expire_month is not null");
            return (Criteria) this;
        }

        public Criteria andExpireMonthEqualTo(Integer value) {
            addCriterion("expire_month =", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotEqualTo(Integer value) {
            addCriterion("expire_month <>", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThan(Integer value) {
            addCriterion("expire_month >", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("expire_month >=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThan(Integer value) {
            addCriterion("expire_month <", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthLessThanOrEqualTo(Integer value) {
            addCriterion("expire_month <=", value, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthIn(List<Integer> values) {
            addCriterion("expire_month in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotIn(List<Integer> values) {
            addCriterion("expire_month not in", values, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthBetween(Integer value1, Integer value2) {
            addCriterion("expire_month between", value1, value2, "expireMonth");
            return (Criteria) this;
        }

        public Criteria andExpireMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("expire_month not between", value1, value2, "expireMonth");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table creditcard
     *
     * @mbg.generated do_not_delete_during_merge Mon Feb 26 10:47:49 EST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table creditcard
     *
     * @mbg.generated Mon Feb 26 10:47:49 EST 2018
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
}