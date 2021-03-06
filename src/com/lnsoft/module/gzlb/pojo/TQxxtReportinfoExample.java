package com.lnsoft.module.gzlb.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TQxxtReportinfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public TQxxtReportinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
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
     * This method corresponds to the database table T_QXXT_REPORTINFO
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
     * This method corresponds to the database table T_QXXT_REPORTINFO
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_QXXT_REPORTINFO
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
     * This class corresponds to the database table T_QXXT_REPORTINFO
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

        public Criteria andActiontimeIsNull() {
            addCriterion("ACTIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andActiontimeIsNotNull() {
            addCriterion("ACTIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andActiontimeEqualTo(String value) {
            addCriterion("ACTIONTIME =", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotEqualTo(String value) {
            addCriterion("ACTIONTIME <>", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThan(String value) {
            addCriterion("ACTIONTIME >", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIONTIME >=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThan(String value) {
            addCriterion("ACTIONTIME <", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLessThanOrEqualTo(String value) {
            addCriterion("ACTIONTIME <=", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeLike(String value) {
            addCriterion("ACTIONTIME like", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotLike(String value) {
            addCriterion("ACTIONTIME not like", value, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeIn(List<String> values) {
            addCriterion("ACTIONTIME in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotIn(List<String> values) {
            addCriterion("ACTIONTIME not in", values, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeBetween(String value1, String value2) {
            addCriterion("ACTIONTIME between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andActiontimeNotBetween(String value1, String value2) {
            addCriterion("ACTIONTIME not between", value1, value2, "actiontime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeIsNull() {
            addCriterion("SUBMITETIME is null");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeIsNotNull() {
            addCriterion("SUBMITETIME is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeEqualTo(String value) {
            addCriterion("SUBMITETIME =", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeNotEqualTo(String value) {
            addCriterion("SUBMITETIME <>", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeGreaterThan(String value) {
            addCriterion("SUBMITETIME >", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeGreaterThanOrEqualTo(String value) {
            addCriterion("SUBMITETIME >=", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeLessThan(String value) {
            addCriterion("SUBMITETIME <", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeLessThanOrEqualTo(String value) {
            addCriterion("SUBMITETIME <=", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeLike(String value) {
            addCriterion("SUBMITETIME like", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeNotLike(String value) {
            addCriterion("SUBMITETIME not like", value, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeIn(List<String> values) {
            addCriterion("SUBMITETIME in", values, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeNotIn(List<String> values) {
            addCriterion("SUBMITETIME not in", values, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeBetween(String value1, String value2) {
            addCriterion("SUBMITETIME between", value1, value2, "submitetime");
            return (Criteria) this;
        }

        public Criteria andSubmitetimeNotBetween(String value1, String value2) {
            addCriterion("SUBMITETIME not between", value1, value2, "submitetime");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNull() {
            addCriterion("DEVICETYPE is null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIsNotNull() {
            addCriterion("DEVICETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicetypeEqualTo(String value) {
            addCriterion("DEVICETYPE =", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotEqualTo(String value) {
            addCriterion("DEVICETYPE <>", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThan(String value) {
            addCriterion("DEVICETYPE >", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE >=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThan(String value) {
            addCriterion("DEVICETYPE <", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLessThanOrEqualTo(String value) {
            addCriterion("DEVICETYPE <=", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeLike(String value) {
            addCriterion("DEVICETYPE like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotLike(String value) {
            addCriterion("DEVICETYPE not like", value, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeIn(List<String> values) {
            addCriterion("DEVICETYPE in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotIn(List<String> values) {
            addCriterion("DEVICETYPE not in", values, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeBetween(String value1, String value2) {
            addCriterion("DEVICETYPE between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andDevicetypeNotBetween(String value1, String value2) {
            addCriterion("DEVICETYPE not between", value1, value2, "devicetype");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNull() {
            addCriterion("VOLTAGE is null");
            return (Criteria) this;
        }

        public Criteria andVoltageIsNotNull() {
            addCriterion("VOLTAGE is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageEqualTo(String value) {
            addCriterion("VOLTAGE =", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotEqualTo(String value) {
            addCriterion("VOLTAGE <>", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThan(String value) {
            addCriterion("VOLTAGE >", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageGreaterThanOrEqualTo(String value) {
            addCriterion("VOLTAGE >=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThan(String value) {
            addCriterion("VOLTAGE <", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLessThanOrEqualTo(String value) {
            addCriterion("VOLTAGE <=", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageLike(String value) {
            addCriterion("VOLTAGE like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotLike(String value) {
            addCriterion("VOLTAGE not like", value, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageIn(List<String> values) {
            addCriterion("VOLTAGE in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotIn(List<String> values) {
            addCriterion("VOLTAGE not in", values, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageBetween(String value1, String value2) {
            addCriterion("VOLTAGE between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andVoltageNotBetween(String value1, String value2) {
            addCriterion("VOLTAGE not between", value1, value2, "voltage");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNull() {
            addCriterion("DEVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andDevicenameIsNotNull() {
            addCriterion("DEVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andDevicenameEqualTo(String value) {
            addCriterion("DEVICENAME =", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotEqualTo(String value) {
            addCriterion("DEVICENAME <>", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThan(String value) {
            addCriterion("DEVICENAME >", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICENAME >=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThan(String value) {
            addCriterion("DEVICENAME <", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLessThanOrEqualTo(String value) {
            addCriterion("DEVICENAME <=", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameLike(String value) {
            addCriterion("DEVICENAME like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotLike(String value) {
            addCriterion("DEVICENAME not like", value, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameIn(List<String> values) {
            addCriterion("DEVICENAME in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotIn(List<String> values) {
            addCriterion("DEVICENAME not in", values, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameBetween(String value1, String value2) {
            addCriterion("DEVICENAME between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andDevicenameNotBetween(String value1, String value2) {
            addCriterion("DEVICENAME not between", value1, value2, "devicename");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIsNull() {
            addCriterion("FAULTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIsNotNull() {
            addCriterion("FAULTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andFaulttypeEqualTo(String value) {
            addCriterion("FAULTTYPE =", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotEqualTo(String value) {
            addCriterion("FAULTTYPE <>", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeGreaterThan(String value) {
            addCriterion("FAULTTYPE >", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeGreaterThanOrEqualTo(String value) {
            addCriterion("FAULTTYPE >=", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLessThan(String value) {
            addCriterion("FAULTTYPE <", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLessThanOrEqualTo(String value) {
            addCriterion("FAULTTYPE <=", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeLike(String value) {
            addCriterion("FAULTTYPE like", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotLike(String value) {
            addCriterion("FAULTTYPE not like", value, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeIn(List<String> values) {
            addCriterion("FAULTTYPE in", values, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotIn(List<String> values) {
            addCriterion("FAULTTYPE not in", values, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeBetween(String value1, String value2) {
            addCriterion("FAULTTYPE between", value1, value2, "faulttype");
            return (Criteria) this;
        }

        public Criteria andFaulttypeNotBetween(String value1, String value2) {
            addCriterion("FAULTTYPE not between", value1, value2, "faulttype");
            return (Criteria) this;
        }

        public Criteria andActionassessIsNull() {
            addCriterion("ACTIONASSESS is null");
            return (Criteria) this;
        }

        public Criteria andActionassessIsNotNull() {
            addCriterion("ACTIONASSESS is not null");
            return (Criteria) this;
        }

        public Criteria andActionassessEqualTo(BigDecimal value) {
            addCriterion("ACTIONASSESS =", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessNotEqualTo(BigDecimal value) {
            addCriterion("ACTIONASSESS <>", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessGreaterThan(BigDecimal value) {
            addCriterion("ACTIONASSESS >", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIONASSESS >=", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessLessThan(BigDecimal value) {
            addCriterion("ACTIONASSESS <", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIONASSESS <=", value, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessIn(List<BigDecimal> values) {
            addCriterion("ACTIONASSESS in", values, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessNotIn(List<BigDecimal> values) {
            addCriterion("ACTIONASSESS not in", values, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIONASSESS between", value1, value2, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActionassessNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIONASSESS not between", value1, value2, "actionassess");
            return (Criteria) this;
        }

        public Criteria andActioninfoIsNull() {
            addCriterion("ACTIONINFO is null");
            return (Criteria) this;
        }

        public Criteria andActioninfoIsNotNull() {
            addCriterion("ACTIONINFO is not null");
            return (Criteria) this;
        }

        public Criteria andActioninfoEqualTo(String value) {
            addCriterion("ACTIONINFO =", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoNotEqualTo(String value) {
            addCriterion("ACTIONINFO <>", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoGreaterThan(String value) {
            addCriterion("ACTIONINFO >", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIONINFO >=", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoLessThan(String value) {
            addCriterion("ACTIONINFO <", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoLessThanOrEqualTo(String value) {
            addCriterion("ACTIONINFO <=", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoLike(String value) {
            addCriterion("ACTIONINFO like", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoNotLike(String value) {
            addCriterion("ACTIONINFO not like", value, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoIn(List<String> values) {
            addCriterion("ACTIONINFO in", values, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoNotIn(List<String> values) {
            addCriterion("ACTIONINFO not in", values, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoBetween(String value1, String value2) {
            addCriterion("ACTIONINFO between", value1, value2, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andActioninfoNotBetween(String value1, String value2) {
            addCriterion("ACTIONINFO not between", value1, value2, "actioninfo");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("WEATHER is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("WEATHER is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("WEATHER =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("WEATHER <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("WEATHER >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("WEATHER >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("WEATHER <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("WEATHER <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("WEATHER like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("WEATHER not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("WEATHER in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("WEATHER not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("WEATHER between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("WEATHER not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andInsertimeIsNull() {
            addCriterion("INSERTIME is null");
            return (Criteria) this;
        }

        public Criteria andInsertimeIsNotNull() {
            addCriterion("INSERTIME is not null");
            return (Criteria) this;
        }

        public Criteria andInsertimeEqualTo(Date value) {
            addCriterion("INSERTIME =", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeNotEqualTo(Date value) {
            addCriterion("INSERTIME <>", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeGreaterThan(Date value) {
            addCriterion("INSERTIME >", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSERTIME >=", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeLessThan(Date value) {
            addCriterion("INSERTIME <", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeLessThanOrEqualTo(Date value) {
            addCriterion("INSERTIME <=", value, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeIn(List<Date> values) {
            addCriterion("INSERTIME in", values, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeNotIn(List<Date> values) {
            addCriterion("INSERTIME not in", values, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeBetween(Date value1, Date value2) {
            addCriterion("INSERTIME between", value1, value2, "insertime");
            return (Criteria) this;
        }

        public Criteria andInsertimeNotBetween(Date value1, Date value2) {
            addCriterion("INSERTIME not between", value1, value2, "insertime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table T_QXXT_REPORTINFO
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
     * This class corresponds to the database table T_QXXT_REPORTINFO
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