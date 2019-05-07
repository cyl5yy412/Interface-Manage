package com.lnsoft.module.gzlb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TJdbhGzlbDataExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public TJdbhGzlbDataExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
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
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNull() {
            addCriterion("KEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andKeyIdIsNotNull() {
            addCriterion("KEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andKeyIdEqualTo(BigDecimal value) {
            addCriterion("KEY_ID =", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotEqualTo(BigDecimal value) {
            addCriterion("KEY_ID <>", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThan(BigDecimal value) {
            addCriterion("KEY_ID >", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("KEY_ID >=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThan(BigDecimal value) {
            addCriterion("KEY_ID <", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("KEY_ID <=", value, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdIn(List<BigDecimal> values) {
            addCriterion("KEY_ID in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotIn(List<BigDecimal> values) {
            addCriterion("KEY_ID not in", values, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KEY_ID between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andKeyIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("KEY_ID not between", value1, value2, "keyId");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNull() {
            addCriterion("DATA_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andDataValueIsNotNull() {
            addCriterion("DATA_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andDataValueEqualTo(BigDecimal value) {
            addCriterion("DATA_VALUE =", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotEqualTo(BigDecimal value) {
            addCriterion("DATA_VALUE <>", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThan(BigDecimal value) {
            addCriterion("DATA_VALUE >", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VALUE >=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThan(BigDecimal value) {
            addCriterion("DATA_VALUE <", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DATA_VALUE <=", value, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueIn(List<BigDecimal> values) {
            addCriterion("DATA_VALUE in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotIn(List<BigDecimal> values) {
            addCriterion("DATA_VALUE not in", values, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VALUE between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andDataValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DATA_VALUE not between", value1, value2, "dataValue");
            return (Criteria) this;
        }

        public Criteria andXhIsNull() {
            addCriterion("XH is null");
            return (Criteria) this;
        }

        public Criteria andXhIsNotNull() {
            addCriterion("XH is not null");
            return (Criteria) this;
        }

        public Criteria andXhEqualTo(BigDecimal value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(BigDecimal value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(BigDecimal value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(BigDecimal value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(BigDecimal value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<BigDecimal> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<BigDecimal> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 16 16:23:22 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_JDBH_GZLB_DATA
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
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