package com.lnsoft.module.pms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TZhZtjxSymbxbExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public TZhZtjxSymbxbExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
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
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
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

        public Criteria andObjIdIsNull() {
            addCriterion("OBJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andObjIdIsNotNull() {
            addCriterion("OBJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andObjIdEqualTo(String value) {
            addCriterion("OBJ_ID =", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotEqualTo(String value) {
            addCriterion("OBJ_ID <>", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThan(String value) {
            addCriterion("OBJ_ID >", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdGreaterThanOrEqualTo(String value) {
            addCriterion("OBJ_ID >=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThan(String value) {
            addCriterion("OBJ_ID <", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLessThanOrEqualTo(String value) {
            addCriterion("OBJ_ID <=", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdLike(String value) {
            addCriterion("OBJ_ID like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotLike(String value) {
            addCriterion("OBJ_ID not like", value, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdIn(List<String> values) {
            addCriterion("OBJ_ID in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotIn(List<String> values) {
            addCriterion("OBJ_ID not in", values, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdBetween(String value1, String value2) {
            addCriterion("OBJ_ID between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andObjIdNotBetween(String value1, String value2) {
            addCriterion("OBJ_ID not between", value1, value2, "objId");
            return (Criteria) this;
        }

        public Criteria andMbxmidIsNull() {
            addCriterion("MBXMID is null");
            return (Criteria) this;
        }

        public Criteria andMbxmidIsNotNull() {
            addCriterion("MBXMID is not null");
            return (Criteria) this;
        }

        public Criteria andMbxmidEqualTo(String value) {
            addCriterion("MBXMID =", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidNotEqualTo(String value) {
            addCriterion("MBXMID <>", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidGreaterThan(String value) {
            addCriterion("MBXMID >", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidGreaterThanOrEqualTo(String value) {
            addCriterion("MBXMID >=", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidLessThan(String value) {
            addCriterion("MBXMID <", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidLessThanOrEqualTo(String value) {
            addCriterion("MBXMID <=", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidLike(String value) {
            addCriterion("MBXMID like", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidNotLike(String value) {
            addCriterion("MBXMID not like", value, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidIn(List<String> values) {
            addCriterion("MBXMID in", values, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidNotIn(List<String> values) {
            addCriterion("MBXMID not in", values, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidBetween(String value1, String value2) {
            addCriterion("MBXMID between", value1, value2, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andMbxmidNotBetween(String value1, String value2) {
            addCriterion("MBXMID not between", value1, value2, "mbxmid");
            return (Criteria) this;
        }

        public Criteria andSyxbIsNull() {
            addCriterion("SYXB is null");
            return (Criteria) this;
        }

        public Criteria andSyxbIsNotNull() {
            addCriterion("SYXB is not null");
            return (Criteria) this;
        }

        public Criteria andSyxbEqualTo(String value) {
            addCriterion("SYXB =", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbNotEqualTo(String value) {
            addCriterion("SYXB <>", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbGreaterThan(String value) {
            addCriterion("SYXB >", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbGreaterThanOrEqualTo(String value) {
            addCriterion("SYXB >=", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbLessThan(String value) {
            addCriterion("SYXB <", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbLessThanOrEqualTo(String value) {
            addCriterion("SYXB <=", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbLike(String value) {
            addCriterion("SYXB like", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbNotLike(String value) {
            addCriterion("SYXB not like", value, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbIn(List<String> values) {
            addCriterion("SYXB in", values, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbNotIn(List<String> values) {
            addCriterion("SYXB not in", values, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbBetween(String value1, String value2) {
            addCriterion("SYXB between", value1, value2, "syxb");
            return (Criteria) this;
        }

        public Criteria andSyxbNotBetween(String value1, String value2) {
            addCriterion("SYXB not between", value1, value2, "syxb");
            return (Criteria) this;
        }

        public Criteria andSbxbIsNull() {
            addCriterion("SBXB is null");
            return (Criteria) this;
        }

        public Criteria andSbxbIsNotNull() {
            addCriterion("SBXB is not null");
            return (Criteria) this;
        }

        public Criteria andSbxbEqualTo(String value) {
            addCriterion("SBXB =", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbNotEqualTo(String value) {
            addCriterion("SBXB <>", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbGreaterThan(String value) {
            addCriterion("SBXB >", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbGreaterThanOrEqualTo(String value) {
            addCriterion("SBXB >=", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbLessThan(String value) {
            addCriterion("SBXB <", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbLessThanOrEqualTo(String value) {
            addCriterion("SBXB <=", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbLike(String value) {
            addCriterion("SBXB like", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbNotLike(String value) {
            addCriterion("SBXB not like", value, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbIn(List<String> values) {
            addCriterion("SBXB in", values, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbNotIn(List<String> values) {
            addCriterion("SBXB not in", values, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbBetween(String value1, String value2) {
            addCriterion("SBXB between", value1, value2, "sbxb");
            return (Criteria) this;
        }

        public Criteria andSbxbNotBetween(String value1, String value2) {
            addCriterion("SBXB not between", value1, value2, "sbxb");
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

        public Criteria andXhEqualTo(Long value) {
            addCriterion("XH =", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotEqualTo(Long value) {
            addCriterion("XH <>", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThan(Long value) {
            addCriterion("XH >", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhGreaterThanOrEqualTo(Long value) {
            addCriterion("XH >=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThan(Long value) {
            addCriterion("XH <", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhLessThanOrEqualTo(Long value) {
            addCriterion("XH <=", value, "xh");
            return (Criteria) this;
        }

        public Criteria andXhIn(List<Long> values) {
            addCriterion("XH in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotIn(List<Long> values) {
            addCriterion("XH not in", values, "xh");
            return (Criteria) this;
        }

        public Criteria andXhBetween(Long value1, Long value2) {
            addCriterion("XH between", value1, value2, "xh");
            return (Criteria) this;
        }

        public Criteria andXhNotBetween(Long value1, Long value2) {
            addCriterion("XH not between", value1, value2, "xh");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 16 15:12:59 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ZH_ZTJX_SYMBXB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
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