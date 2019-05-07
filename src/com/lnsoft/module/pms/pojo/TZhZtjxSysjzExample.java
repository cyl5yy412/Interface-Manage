package com.lnsoft.module.pms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TZhZtjxSysjzExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public TZhZtjxSysjzExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
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
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
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
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYSJZ
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
     * This class corresponds to the database table T_ZH_ZTJX_SYSJZ
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

        public Criteria andSysbxmidIsNull() {
            addCriterion("SYSBXMID is null");
            return (Criteria) this;
        }

        public Criteria andSysbxmidIsNotNull() {
            addCriterion("SYSBXMID is not null");
            return (Criteria) this;
        }

        public Criteria andSysbxmidEqualTo(String value) {
            addCriterion("SYSBXMID =", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidNotEqualTo(String value) {
            addCriterion("SYSBXMID <>", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidGreaterThan(String value) {
            addCriterion("SYSBXMID >", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidGreaterThanOrEqualTo(String value) {
            addCriterion("SYSBXMID >=", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidLessThan(String value) {
            addCriterion("SYSBXMID <", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidLessThanOrEqualTo(String value) {
            addCriterion("SYSBXMID <=", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidLike(String value) {
            addCriterion("SYSBXMID like", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidNotLike(String value) {
            addCriterion("SYSBXMID not like", value, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidIn(List<String> values) {
            addCriterion("SYSBXMID in", values, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidNotIn(List<String> values) {
            addCriterion("SYSBXMID not in", values, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidBetween(String value1, String value2) {
            addCriterion("SYSBXMID between", value1, value2, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSysbxmidNotBetween(String value1, String value2) {
            addCriterion("SYSBXMID not between", value1, value2, "sysbxmid");
            return (Criteria) this;
        }

        public Criteria andSjzbhIsNull() {
            addCriterion("SJZBH is null");
            return (Criteria) this;
        }

        public Criteria andSjzbhIsNotNull() {
            addCriterion("SJZBH is not null");
            return (Criteria) this;
        }

        public Criteria andSjzbhEqualTo(Long value) {
            addCriterion("SJZBH =", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhNotEqualTo(Long value) {
            addCriterion("SJZBH <>", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhGreaterThan(Long value) {
            addCriterion("SJZBH >", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhGreaterThanOrEqualTo(Long value) {
            addCriterion("SJZBH >=", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhLessThan(Long value) {
            addCriterion("SJZBH <", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhLessThanOrEqualTo(Long value) {
            addCriterion("SJZBH <=", value, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhIn(List<Long> values) {
            addCriterion("SJZBH in", values, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhNotIn(List<Long> values) {
            addCriterion("SJZBH not in", values, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhBetween(Long value1, Long value2) {
            addCriterion("SJZBH between", value1, value2, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzbhNotBetween(Long value1, Long value2) {
            addCriterion("SJZBH not between", value1, value2, "sjzbh");
            return (Criteria) this;
        }

        public Criteria andSjzsmIsNull() {
            addCriterion("SJZSM is null");
            return (Criteria) this;
        }

        public Criteria andSjzsmIsNotNull() {
            addCriterion("SJZSM is not null");
            return (Criteria) this;
        }

        public Criteria andSjzsmEqualTo(String value) {
            addCriterion("SJZSM =", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmNotEqualTo(String value) {
            addCriterion("SJZSM <>", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmGreaterThan(String value) {
            addCriterion("SJZSM >", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmGreaterThanOrEqualTo(String value) {
            addCriterion("SJZSM >=", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmLessThan(String value) {
            addCriterion("SJZSM <", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmLessThanOrEqualTo(String value) {
            addCriterion("SJZSM <=", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmLike(String value) {
            addCriterion("SJZSM like", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmNotLike(String value) {
            addCriterion("SJZSM not like", value, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmIn(List<String> values) {
            addCriterion("SJZSM in", values, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmNotIn(List<String> values) {
            addCriterion("SJZSM not in", values, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmBetween(String value1, String value2) {
            addCriterion("SJZSM between", value1, value2, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSjzsmNotBetween(String value1, String value2) {
            addCriterion("SJZSM not between", value1, value2, "sjzsm");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNull() {
            addCriterion("SFYX is null");
            return (Criteria) this;
        }

        public Criteria andSfyxIsNotNull() {
            addCriterion("SFYX is not null");
            return (Criteria) this;
        }

        public Criteria andSfyxEqualTo(Short value) {
            addCriterion("SFYX =", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotEqualTo(Short value) {
            addCriterion("SFYX <>", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThan(Short value) {
            addCriterion("SFYX >", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxGreaterThanOrEqualTo(Short value) {
            addCriterion("SFYX >=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThan(Short value) {
            addCriterion("SFYX <", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxLessThanOrEqualTo(Short value) {
            addCriterion("SFYX <=", value, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxIn(List<Short> values) {
            addCriterion("SFYX in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotIn(List<Short> values) {
            addCriterion("SFYX not in", values, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxBetween(Short value1, Short value2) {
            addCriterion("SFYX between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andSfyxNotBetween(Short value1, Short value2) {
            addCriterion("SFYX not between", value1, value2, "sfyx");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("INSERTTIME is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("INSERTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("INSERTTIME =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("INSERTTIME <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("INSERTTIME >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERTTIME >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("INSERTTIME <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERTTIME <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("INSERTTIME in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("INSERTTIME not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("INSERTTIME between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERTTIME not between", value1, value2, "inserttime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ZH_ZTJX_SYSJZ
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
     * This class corresponds to the database table T_ZH_ZTJX_SYSJZ
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