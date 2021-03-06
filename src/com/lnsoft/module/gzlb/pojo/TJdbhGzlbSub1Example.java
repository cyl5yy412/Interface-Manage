package com.lnsoft.module.gzlb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TJdbhGzlbSub1Example {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public TJdbhGzlbSub1Example() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
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
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
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
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_SUB1
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
     * This class corresponds to the database table T_JDBH_GZLB_SUB1
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

        public Criteria andIdEqualTo(BigDecimal value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(BigDecimal value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(BigDecimal value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(BigDecimal value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<BigDecimal> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<BigDecimal> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("MID is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("MID is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(BigDecimal value) {
            addCriterion("MID =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(BigDecimal value) {
            addCriterion("MID <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(BigDecimal value) {
            addCriterion("MID >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MID >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(BigDecimal value) {
            addCriterion("MID <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MID <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<BigDecimal> values) {
            addCriterion("MID in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<BigDecimal> values) {
            addCriterion("MID not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MID not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andBdcIsNull() {
            addCriterion("BDC is null");
            return (Criteria) this;
        }

        public Criteria andBdcIsNotNull() {
            addCriterion("BDC is not null");
            return (Criteria) this;
        }

        public Criteria andBdcEqualTo(String value) {
            addCriterion("BDC =", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcNotEqualTo(String value) {
            addCriterion("BDC <>", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcGreaterThan(String value) {
            addCriterion("BDC >", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcGreaterThanOrEqualTo(String value) {
            addCriterion("BDC >=", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcLessThan(String value) {
            addCriterion("BDC <", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcLessThanOrEqualTo(String value) {
            addCriterion("BDC <=", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcLike(String value) {
            addCriterion("BDC like", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcNotLike(String value) {
            addCriterion("BDC not like", value, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcIn(List<String> values) {
            addCriterion("BDC in", values, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcNotIn(List<String> values) {
            addCriterion("BDC not in", values, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcBetween(String value1, String value2) {
            addCriterion("BDC between", value1, value2, "bdc");
            return (Criteria) this;
        }

        public Criteria andBdcNotBetween(String value1, String value2) {
            addCriterion("BDC not between", value1, value2, "bdc");
            return (Criteria) this;
        }

        public Criteria andSsdwIsNull() {
            addCriterion("SSDW is null");
            return (Criteria) this;
        }

        public Criteria andSsdwIsNotNull() {
            addCriterion("SSDW is not null");
            return (Criteria) this;
        }

        public Criteria andSsdwEqualTo(String value) {
            addCriterion("SSDW =", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwNotEqualTo(String value) {
            addCriterion("SSDW <>", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwGreaterThan(String value) {
            addCriterion("SSDW >", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwGreaterThanOrEqualTo(String value) {
            addCriterion("SSDW >=", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwLessThan(String value) {
            addCriterion("SSDW <", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwLessThanOrEqualTo(String value) {
            addCriterion("SSDW <=", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwLike(String value) {
            addCriterion("SSDW like", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwNotLike(String value) {
            addCriterion("SSDW not like", value, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwIn(List<String> values) {
            addCriterion("SSDW in", values, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwNotIn(List<String> values) {
            addCriterion("SSDW not in", values, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwBetween(String value1, String value2) {
            addCriterion("SSDW between", value1, value2, "ssdw");
            return (Criteria) this;
        }

        public Criteria andSsdwNotBetween(String value1, String value2) {
            addCriterion("SSDW not between", value1, value2, "ssdw");
            return (Criteria) this;
        }

        public Criteria andCzmcIsNull() {
            addCriterion("CZMC is null");
            return (Criteria) this;
        }

        public Criteria andCzmcIsNotNull() {
            addCriterion("CZMC is not null");
            return (Criteria) this;
        }

        public Criteria andCzmcEqualTo(String value) {
            addCriterion("CZMC =", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotEqualTo(String value) {
            addCriterion("CZMC <>", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThan(String value) {
            addCriterion("CZMC >", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcGreaterThanOrEqualTo(String value) {
            addCriterion("CZMC >=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThan(String value) {
            addCriterion("CZMC <", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLessThanOrEqualTo(String value) {
            addCriterion("CZMC <=", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcLike(String value) {
            addCriterion("CZMC like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotLike(String value) {
            addCriterion("CZMC not like", value, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcIn(List<String> values) {
            addCriterion("CZMC in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotIn(List<String> values) {
            addCriterion("CZMC not in", values, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcBetween(String value1, String value2) {
            addCriterion("CZMC between", value1, value2, "czmc");
            return (Criteria) this;
        }

        public Criteria andCzmcNotBetween(String value1, String value2) {
            addCriterion("CZMC not between", value1, value2, "czmc");
            return (Criteria) this;
        }

        public Criteria andSblxIsNull() {
            addCriterion("SBLX is null");
            return (Criteria) this;
        }

        public Criteria andSblxIsNotNull() {
            addCriterion("SBLX is not null");
            return (Criteria) this;
        }

        public Criteria andSblxEqualTo(String value) {
            addCriterion("SBLX =", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotEqualTo(String value) {
            addCriterion("SBLX <>", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThan(String value) {
            addCriterion("SBLX >", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxGreaterThanOrEqualTo(String value) {
            addCriterion("SBLX >=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThan(String value) {
            addCriterion("SBLX <", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLessThanOrEqualTo(String value) {
            addCriterion("SBLX <=", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxLike(String value) {
            addCriterion("SBLX like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotLike(String value) {
            addCriterion("SBLX not like", value, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxIn(List<String> values) {
            addCriterion("SBLX in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotIn(List<String> values) {
            addCriterion("SBLX not in", values, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxBetween(String value1, String value2) {
            addCriterion("SBLX between", value1, value2, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxNotBetween(String value1, String value2) {
            addCriterion("SBLX not between", value1, value2, "sblx");
            return (Criteria) this;
        }

        public Criteria andSblxbIsNull() {
            addCriterion("SBLXB is null");
            return (Criteria) this;
        }

        public Criteria andSblxbIsNotNull() {
            addCriterion("SBLXB is not null");
            return (Criteria) this;
        }

        public Criteria andSblxbEqualTo(String value) {
            addCriterion("SBLXB =", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbNotEqualTo(String value) {
            addCriterion("SBLXB <>", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbGreaterThan(String value) {
            addCriterion("SBLXB >", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbGreaterThanOrEqualTo(String value) {
            addCriterion("SBLXB >=", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbLessThan(String value) {
            addCriterion("SBLXB <", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbLessThanOrEqualTo(String value) {
            addCriterion("SBLXB <=", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbLike(String value) {
            addCriterion("SBLXB like", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbNotLike(String value) {
            addCriterion("SBLXB not like", value, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbIn(List<String> values) {
            addCriterion("SBLXB in", values, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbNotIn(List<String> values) {
            addCriterion("SBLXB not in", values, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbBetween(String value1, String value2) {
            addCriterion("SBLXB between", value1, value2, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSblxbNotBetween(String value1, String value2) {
            addCriterion("SBLXB not between", value1, value2, "sblxb");
            return (Criteria) this;
        }

        public Criteria andSbidIsNull() {
            addCriterion("SBID is null");
            return (Criteria) this;
        }

        public Criteria andSbidIsNotNull() {
            addCriterion("SBID is not null");
            return (Criteria) this;
        }

        public Criteria andSbidEqualTo(String value) {
            addCriterion("SBID =", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotEqualTo(String value) {
            addCriterion("SBID <>", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThan(String value) {
            addCriterion("SBID >", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidGreaterThanOrEqualTo(String value) {
            addCriterion("SBID >=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThan(String value) {
            addCriterion("SBID <", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLessThanOrEqualTo(String value) {
            addCriterion("SBID <=", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidLike(String value) {
            addCriterion("SBID like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotLike(String value) {
            addCriterion("SBID not like", value, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidIn(List<String> values) {
            addCriterion("SBID in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotIn(List<String> values) {
            addCriterion("SBID not in", values, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidBetween(String value1, String value2) {
            addCriterion("SBID between", value1, value2, "sbid");
            return (Criteria) this;
        }

        public Criteria andSbidNotBetween(String value1, String value2) {
            addCriterion("SBID not between", value1, value2, "sbid");
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

        public Criteria andFzdl1IsNull() {
            addCriterion("FZDL1 is null");
            return (Criteria) this;
        }

        public Criteria andFzdl1IsNotNull() {
            addCriterion("FZDL1 is not null");
            return (Criteria) this;
        }

        public Criteria andFzdl1EqualTo(String value) {
            addCriterion("FZDL1 =", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1NotEqualTo(String value) {
            addCriterion("FZDL1 <>", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1GreaterThan(String value) {
            addCriterion("FZDL1 >", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1GreaterThanOrEqualTo(String value) {
            addCriterion("FZDL1 >=", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1LessThan(String value) {
            addCriterion("FZDL1 <", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1LessThanOrEqualTo(String value) {
            addCriterion("FZDL1 <=", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1Like(String value) {
            addCriterion("FZDL1 like", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1NotLike(String value) {
            addCriterion("FZDL1 not like", value, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1In(List<String> values) {
            addCriterion("FZDL1 in", values, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1NotIn(List<String> values) {
            addCriterion("FZDL1 not in", values, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1Between(String value1, String value2) {
            addCriterion("FZDL1 between", value1, value2, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl1NotBetween(String value1, String value2) {
            addCriterion("FZDL1 not between", value1, value2, "fzdl1");
            return (Criteria) this;
        }

        public Criteria andFzdl2IsNull() {
            addCriterion("FZDL2 is null");
            return (Criteria) this;
        }

        public Criteria andFzdl2IsNotNull() {
            addCriterion("FZDL2 is not null");
            return (Criteria) this;
        }

        public Criteria andFzdl2EqualTo(String value) {
            addCriterion("FZDL2 =", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2NotEqualTo(String value) {
            addCriterion("FZDL2 <>", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2GreaterThan(String value) {
            addCriterion("FZDL2 >", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2GreaterThanOrEqualTo(String value) {
            addCriterion("FZDL2 >=", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2LessThan(String value) {
            addCriterion("FZDL2 <", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2LessThanOrEqualTo(String value) {
            addCriterion("FZDL2 <=", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2Like(String value) {
            addCriterion("FZDL2 like", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2NotLike(String value) {
            addCriterion("FZDL2 not like", value, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2In(List<String> values) {
            addCriterion("FZDL2 in", values, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2NotIn(List<String> values) {
            addCriterion("FZDL2 not in", values, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2Between(String value1, String value2) {
            addCriterion("FZDL2 between", value1, value2, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andFzdl2NotBetween(String value1, String value2) {
            addCriterion("FZDL2 not between", value1, value2, "fzdl2");
            return (Criteria) this;
        }

        public Criteria andPms2idIsNull() {
            addCriterion("PMS2ID is null");
            return (Criteria) this;
        }

        public Criteria andPms2idIsNotNull() {
            addCriterion("PMS2ID is not null");
            return (Criteria) this;
        }

        public Criteria andPms2idEqualTo(String value) {
            addCriterion("PMS2ID =", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idNotEqualTo(String value) {
            addCriterion("PMS2ID <>", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idGreaterThan(String value) {
            addCriterion("PMS2ID >", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idGreaterThanOrEqualTo(String value) {
            addCriterion("PMS2ID >=", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idLessThan(String value) {
            addCriterion("PMS2ID <", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idLessThanOrEqualTo(String value) {
            addCriterion("PMS2ID <=", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idLike(String value) {
            addCriterion("PMS2ID like", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idNotLike(String value) {
            addCriterion("PMS2ID not like", value, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idIn(List<String> values) {
            addCriterion("PMS2ID in", values, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idNotIn(List<String> values) {
            addCriterion("PMS2ID not in", values, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idBetween(String value1, String value2) {
            addCriterion("PMS2ID between", value1, value2, "pms2id");
            return (Criteria) this;
        }

        public Criteria andPms2idNotBetween(String value1, String value2) {
            addCriterion("PMS2ID not between", value1, value2, "pms2id");
            return (Criteria) this;
        }

        public Criteria andCzidIsNull() {
            addCriterion("CZID is null");
            return (Criteria) this;
        }

        public Criteria andCzidIsNotNull() {
            addCriterion("CZID is not null");
            return (Criteria) this;
        }

        public Criteria andCzidEqualTo(String value) {
            addCriterion("CZID =", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotEqualTo(String value) {
            addCriterion("CZID <>", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThan(String value) {
            addCriterion("CZID >", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidGreaterThanOrEqualTo(String value) {
            addCriterion("CZID >=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThan(String value) {
            addCriterion("CZID <", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLessThanOrEqualTo(String value) {
            addCriterion("CZID <=", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidLike(String value) {
            addCriterion("CZID like", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotLike(String value) {
            addCriterion("CZID not like", value, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidIn(List<String> values) {
            addCriterion("CZID in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotIn(List<String> values) {
            addCriterion("CZID not in", values, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidBetween(String value1, String value2) {
            addCriterion("CZID between", value1, value2, "czid");
            return (Criteria) this;
        }

        public Criteria andCzidNotBetween(String value1, String value2) {
            addCriterion("CZID not between", value1, value2, "czid");
            return (Criteria) this;
        }

        public Criteria andBzIsNull() {
            addCriterion("BZ is null");
            return (Criteria) this;
        }

        public Criteria andBzIsNotNull() {
            addCriterion("BZ is not null");
            return (Criteria) this;
        }

        public Criteria andBzEqualTo(String value) {
            addCriterion("BZ =", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotEqualTo(String value) {
            addCriterion("BZ <>", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThan(String value) {
            addCriterion("BZ >", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzGreaterThanOrEqualTo(String value) {
            addCriterion("BZ >=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThan(String value) {
            addCriterion("BZ <", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLessThanOrEqualTo(String value) {
            addCriterion("BZ <=", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzLike(String value) {
            addCriterion("BZ like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotLike(String value) {
            addCriterion("BZ not like", value, "bz");
            return (Criteria) this;
        }

        public Criteria andBzIn(List<String> values) {
            addCriterion("BZ in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotIn(List<String> values) {
            addCriterion("BZ not in", values, "bz");
            return (Criteria) this;
        }

        public Criteria andBzBetween(String value1, String value2) {
            addCriterion("BZ between", value1, value2, "bz");
            return (Criteria) this;
        }

        public Criteria andBzNotBetween(String value1, String value2) {
            addCriterion("BZ not between", value1, value2, "bz");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_JDBH_GZLB_SUB1
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
     * This class corresponds to the database table T_JDBH_GZLB_SUB1
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