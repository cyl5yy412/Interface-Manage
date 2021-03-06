package com.lnsoft.module.pms.pojo;

import java.util.ArrayList;
import java.util.List;

public class TZhZtjxSyxmExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public TZhZtjxSyxmExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
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
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
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
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYXM
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
     * This class corresponds to the database table T_ZH_ZTJX_SYXM
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

        public Criteria andSyzyidIsNull() {
            addCriterion("SYZYID is null");
            return (Criteria) this;
        }

        public Criteria andSyzyidIsNotNull() {
            addCriterion("SYZYID is not null");
            return (Criteria) this;
        }

        public Criteria andSyzyidEqualTo(String value) {
            addCriterion("SYZYID =", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidNotEqualTo(String value) {
            addCriterion("SYZYID <>", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidGreaterThan(String value) {
            addCriterion("SYZYID >", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidGreaterThanOrEqualTo(String value) {
            addCriterion("SYZYID >=", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidLessThan(String value) {
            addCriterion("SYZYID <", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidLessThanOrEqualTo(String value) {
            addCriterion("SYZYID <=", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidLike(String value) {
            addCriterion("SYZYID like", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidNotLike(String value) {
            addCriterion("SYZYID not like", value, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidIn(List<String> values) {
            addCriterion("SYZYID in", values, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidNotIn(List<String> values) {
            addCriterion("SYZYID not in", values, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidBetween(String value1, String value2) {
            addCriterion("SYZYID between", value1, value2, "syzyid");
            return (Criteria) this;
        }

        public Criteria andSyzyidNotBetween(String value1, String value2) {
            addCriterion("SYZYID not between", value1, value2, "syzyid");
            return (Criteria) this;
        }

        public Criteria andMcIsNull() {
            addCriterion("MC is null");
            return (Criteria) this;
        }

        public Criteria andMcIsNotNull() {
            addCriterion("MC is not null");
            return (Criteria) this;
        }

        public Criteria andMcEqualTo(String value) {
            addCriterion("MC =", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotEqualTo(String value) {
            addCriterion("MC <>", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThan(String value) {
            addCriterion("MC >", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcGreaterThanOrEqualTo(String value) {
            addCriterion("MC >=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThan(String value) {
            addCriterion("MC <", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLessThanOrEqualTo(String value) {
            addCriterion("MC <=", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcLike(String value) {
            addCriterion("MC like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotLike(String value) {
            addCriterion("MC not like", value, "mc");
            return (Criteria) this;
        }

        public Criteria andMcIn(List<String> values) {
            addCriterion("MC in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotIn(List<String> values) {
            addCriterion("MC not in", values, "mc");
            return (Criteria) this;
        }

        public Criteria andMcBetween(String value1, String value2) {
            addCriterion("MC between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andMcNotBetween(String value1, String value2) {
            addCriterion("MC not between", value1, value2, "mc");
            return (Criteria) this;
        }

        public Criteria andXmmsIsNull() {
            addCriterion("XMMS is null");
            return (Criteria) this;
        }

        public Criteria andXmmsIsNotNull() {
            addCriterion("XMMS is not null");
            return (Criteria) this;
        }

        public Criteria andXmmsEqualTo(String value) {
            addCriterion("XMMS =", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsNotEqualTo(String value) {
            addCriterion("XMMS <>", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsGreaterThan(String value) {
            addCriterion("XMMS >", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsGreaterThanOrEqualTo(String value) {
            addCriterion("XMMS >=", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsLessThan(String value) {
            addCriterion("XMMS <", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsLessThanOrEqualTo(String value) {
            addCriterion("XMMS <=", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsLike(String value) {
            addCriterion("XMMS like", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsNotLike(String value) {
            addCriterion("XMMS not like", value, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsIn(List<String> values) {
            addCriterion("XMMS in", values, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsNotIn(List<String> values) {
            addCriterion("XMMS not in", values, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsBetween(String value1, String value2) {
            addCriterion("XMMS between", value1, value2, "xmms");
            return (Criteria) this;
        }

        public Criteria andXmmsNotBetween(String value1, String value2) {
            addCriterion("XMMS not between", value1, value2, "xmms");
            return (Criteria) this;
        }

        public Criteria andXsfsIsNull() {
            addCriterion("XSFS is null");
            return (Criteria) this;
        }

        public Criteria andXsfsIsNotNull() {
            addCriterion("XSFS is not null");
            return (Criteria) this;
        }

        public Criteria andXsfsEqualTo(String value) {
            addCriterion("XSFS =", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsNotEqualTo(String value) {
            addCriterion("XSFS <>", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsGreaterThan(String value) {
            addCriterion("XSFS >", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsGreaterThanOrEqualTo(String value) {
            addCriterion("XSFS >=", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsLessThan(String value) {
            addCriterion("XSFS <", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsLessThanOrEqualTo(String value) {
            addCriterion("XSFS <=", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsLike(String value) {
            addCriterion("XSFS like", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsNotLike(String value) {
            addCriterion("XSFS not like", value, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsIn(List<String> values) {
            addCriterion("XSFS in", values, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsNotIn(List<String> values) {
            addCriterion("XSFS not in", values, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsBetween(String value1, String value2) {
            addCriterion("XSFS between", value1, value2, "xsfs");
            return (Criteria) this;
        }

        public Criteria andXsfsNotBetween(String value1, String value2) {
            addCriterion("XSFS not between", value1, value2, "xsfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsIsNull() {
            addCriterion("ZXMDWFS is null");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsIsNotNull() {
            addCriterion("ZXMDWFS is not null");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsEqualTo(String value) {
            addCriterion("ZXMDWFS =", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsNotEqualTo(String value) {
            addCriterion("ZXMDWFS <>", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsGreaterThan(String value) {
            addCriterion("ZXMDWFS >", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsGreaterThanOrEqualTo(String value) {
            addCriterion("ZXMDWFS >=", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsLessThan(String value) {
            addCriterion("ZXMDWFS <", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsLessThanOrEqualTo(String value) {
            addCriterion("ZXMDWFS <=", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsLike(String value) {
            addCriterion("ZXMDWFS like", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsNotLike(String value) {
            addCriterion("ZXMDWFS not like", value, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsIn(List<String> values) {
            addCriterion("ZXMDWFS in", values, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsNotIn(List<String> values) {
            addCriterion("ZXMDWFS not in", values, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsBetween(String value1, String value2) {
            addCriterion("ZXMDWFS between", value1, value2, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andZxmdwfsNotBetween(String value1, String value2) {
            addCriterion("ZXMDWFS not between", value1, value2, "zxmdwfs");
            return (Criteria) this;
        }

        public Criteria andSflrwdIsNull() {
            addCriterion("SFLRWD is null");
            return (Criteria) this;
        }

        public Criteria andSflrwdIsNotNull() {
            addCriterion("SFLRWD is not null");
            return (Criteria) this;
        }

        public Criteria andSflrwdEqualTo(Short value) {
            addCriterion("SFLRWD =", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdNotEqualTo(Short value) {
            addCriterion("SFLRWD <>", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdGreaterThan(Short value) {
            addCriterion("SFLRWD >", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdGreaterThanOrEqualTo(Short value) {
            addCriterion("SFLRWD >=", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdLessThan(Short value) {
            addCriterion("SFLRWD <", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdLessThanOrEqualTo(Short value) {
            addCriterion("SFLRWD <=", value, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdIn(List<Short> values) {
            addCriterion("SFLRWD in", values, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdNotIn(List<Short> values) {
            addCriterion("SFLRWD not in", values, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdBetween(Short value1, Short value2) {
            addCriterion("SFLRWD between", value1, value2, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrwdNotBetween(Short value1, Short value2) {
            addCriterion("SFLRWD not between", value1, value2, "sflrwd");
            return (Criteria) this;
        }

        public Criteria andSflrsdIsNull() {
            addCriterion("SFLRSD is null");
            return (Criteria) this;
        }

        public Criteria andSflrsdIsNotNull() {
            addCriterion("SFLRSD is not null");
            return (Criteria) this;
        }

        public Criteria andSflrsdEqualTo(Short value) {
            addCriterion("SFLRSD =", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdNotEqualTo(Short value) {
            addCriterion("SFLRSD <>", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdGreaterThan(Short value) {
            addCriterion("SFLRSD >", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdGreaterThanOrEqualTo(Short value) {
            addCriterion("SFLRSD >=", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdLessThan(Short value) {
            addCriterion("SFLRSD <", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdLessThanOrEqualTo(Short value) {
            addCriterion("SFLRSD <=", value, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdIn(List<Short> values) {
            addCriterion("SFLRSD in", values, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdNotIn(List<Short> values) {
            addCriterion("SFLRSD not in", values, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdBetween(Short value1, Short value2) {
            addCriterion("SFLRSD between", value1, value2, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrsdNotBetween(Short value1, Short value2) {
            addCriterion("SFLRSD not between", value1, value2, "sflrsd");
            return (Criteria) this;
        }

        public Criteria andSflrywIsNull() {
            addCriterion("SFLRYW is null");
            return (Criteria) this;
        }

        public Criteria andSflrywIsNotNull() {
            addCriterion("SFLRYW is not null");
            return (Criteria) this;
        }

        public Criteria andSflrywEqualTo(Short value) {
            addCriterion("SFLRYW =", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywNotEqualTo(Short value) {
            addCriterion("SFLRYW <>", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywGreaterThan(Short value) {
            addCriterion("SFLRYW >", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywGreaterThanOrEqualTo(Short value) {
            addCriterion("SFLRYW >=", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywLessThan(Short value) {
            addCriterion("SFLRYW <", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywLessThanOrEqualTo(Short value) {
            addCriterion("SFLRYW <=", value, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywIn(List<Short> values) {
            addCriterion("SFLRYW in", values, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywNotIn(List<Short> values) {
            addCriterion("SFLRYW not in", values, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywBetween(Short value1, Short value2) {
            addCriterion("SFLRYW between", value1, value2, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrywNotBetween(Short value1, Short value2) {
            addCriterion("SFLRYW not between", value1, value2, "sflryw");
            return (Criteria) this;
        }

        public Criteria andSflrfhIsNull() {
            addCriterion("SFLRFH is null");
            return (Criteria) this;
        }

        public Criteria andSflrfhIsNotNull() {
            addCriterion("SFLRFH is not null");
            return (Criteria) this;
        }

        public Criteria andSflrfhEqualTo(Short value) {
            addCriterion("SFLRFH =", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhNotEqualTo(Short value) {
            addCriterion("SFLRFH <>", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhGreaterThan(Short value) {
            addCriterion("SFLRFH >", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhGreaterThanOrEqualTo(Short value) {
            addCriterion("SFLRFH >=", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhLessThan(Short value) {
            addCriterion("SFLRFH <", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhLessThanOrEqualTo(Short value) {
            addCriterion("SFLRFH <=", value, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhIn(List<Short> values) {
            addCriterion("SFLRFH in", values, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhNotIn(List<Short> values) {
            addCriterion("SFLRFH not in", values, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhBetween(Short value1, Short value2) {
            addCriterion("SFLRFH between", value1, value2, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSflrfhNotBetween(Short value1, Short value2) {
            addCriterion("SFLRFH not between", value1, value2, "sflrfh");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzIsNull() {
            addCriterion("SFBWKKZ is null");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzIsNotNull() {
            addCriterion("SFBWKKZ is not null");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzEqualTo(Short value) {
            addCriterion("SFBWKKZ =", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzNotEqualTo(Short value) {
            addCriterion("SFBWKKZ <>", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzGreaterThan(Short value) {
            addCriterion("SFBWKKZ >", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzGreaterThanOrEqualTo(Short value) {
            addCriterion("SFBWKKZ >=", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzLessThan(Short value) {
            addCriterion("SFBWKKZ <", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzLessThanOrEqualTo(Short value) {
            addCriterion("SFBWKKZ <=", value, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzIn(List<Short> values) {
            addCriterion("SFBWKKZ in", values, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzNotIn(List<Short> values) {
            addCriterion("SFBWKKZ not in", values, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzBetween(Short value1, Short value2) {
            addCriterion("SFBWKKZ between", value1, value2, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andSfbwkkzNotBetween(Short value1, Short value2) {
            addCriterion("SFBWKKZ not between", value1, value2, "sfbwkkz");
            return (Criteria) this;
        }

        public Criteria andBmIsNull() {
            addCriterion("BM is null");
            return (Criteria) this;
        }

        public Criteria andBmIsNotNull() {
            addCriterion("BM is not null");
            return (Criteria) this;
        }

        public Criteria andBmEqualTo(String value) {
            addCriterion("BM =", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotEqualTo(String value) {
            addCriterion("BM <>", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThan(String value) {
            addCriterion("BM >", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmGreaterThanOrEqualTo(String value) {
            addCriterion("BM >=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThan(String value) {
            addCriterion("BM <", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLessThanOrEqualTo(String value) {
            addCriterion("BM <=", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmLike(String value) {
            addCriterion("BM like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotLike(String value) {
            addCriterion("BM not like", value, "bm");
            return (Criteria) this;
        }

        public Criteria andBmIn(List<String> values) {
            addCriterion("BM in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotIn(List<String> values) {
            addCriterion("BM not in", values, "bm");
            return (Criteria) this;
        }

        public Criteria andBmBetween(String value1, String value2) {
            addCriterion("BM between", value1, value2, "bm");
            return (Criteria) this;
        }

        public Criteria andBmNotBetween(String value1, String value2) {
            addCriterion("BM not between", value1, value2, "bm");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_ZH_ZTJX_SYXM
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
     * This class corresponds to the database table T_ZH_ZTJX_SYXM
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