package com.lnsoft.module.sbdzxjc.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmstAirpressureExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public CmstAirpressureExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
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
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
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

        public Criteria andObjDispidxIsNull() {
            addCriterion("OBJ_DISPIDX is null");
            return (Criteria) this;
        }

        public Criteria andObjDispidxIsNotNull() {
            addCriterion("OBJ_DISPIDX is not null");
            return (Criteria) this;
        }

        public Criteria andObjDispidxEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX =", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <>", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxGreaterThan(BigDecimal value) {
            addCriterion("OBJ_DISPIDX >", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX >=", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxLessThan(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OBJ_DISPIDX <=", value, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxIn(List<BigDecimal> values) {
            addCriterion("OBJ_DISPIDX in", values, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotIn(List<BigDecimal> values) {
            addCriterion("OBJ_DISPIDX not in", values, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_DISPIDX between", value1, value2, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andObjDispidxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OBJ_DISPIDX not between", value1, value2, "objDispidx");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceIsNull() {
            addCriterion("LINKEDDEVICE is null");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceIsNotNull() {
            addCriterion("LINKEDDEVICE is not null");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceEqualTo(String value) {
            addCriterion("LINKEDDEVICE =", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceNotEqualTo(String value) {
            addCriterion("LINKEDDEVICE <>", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceGreaterThan(String value) {
            addCriterion("LINKEDDEVICE >", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceGreaterThanOrEqualTo(String value) {
            addCriterion("LINKEDDEVICE >=", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceLessThan(String value) {
            addCriterion("LINKEDDEVICE <", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceLessThanOrEqualTo(String value) {
            addCriterion("LINKEDDEVICE <=", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceLike(String value) {
            addCriterion("LINKEDDEVICE like", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceNotLike(String value) {
            addCriterion("LINKEDDEVICE not like", value, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceIn(List<String> values) {
            addCriterion("LINKEDDEVICE in", values, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceNotIn(List<String> values) {
            addCriterion("LINKEDDEVICE not in", values, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceBetween(String value1, String value2) {
            addCriterion("LINKEDDEVICE between", value1, value2, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andLinkeddeviceNotBetween(String value1, String value2) {
            addCriterion("LINKEDDEVICE not between", value1, value2, "linkeddevice");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNull() {
            addCriterion("DEVICECODE is null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIsNotNull() {
            addCriterion("DEVICECODE is not null");
            return (Criteria) this;
        }

        public Criteria andDevicecodeEqualTo(String value) {
            addCriterion("DEVICECODE =", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotEqualTo(String value) {
            addCriterion("DEVICECODE <>", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThan(String value) {
            addCriterion("DEVICECODE >", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEVICECODE >=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThan(String value) {
            addCriterion("DEVICECODE <", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLessThanOrEqualTo(String value) {
            addCriterion("DEVICECODE <=", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeLike(String value) {
            addCriterion("DEVICECODE like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotLike(String value) {
            addCriterion("DEVICECODE not like", value, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeIn(List<String> values) {
            addCriterion("DEVICECODE in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotIn(List<String> values) {
            addCriterion("DEVICECODE not in", values, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeBetween(String value1, String value2) {
            addCriterion("DEVICECODE between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andDevicecodeNotBetween(String value1, String value2) {
            addCriterion("DEVICECODE not between", value1, value2, "devicecode");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeIsNull() {
            addCriterion("ACQUISITIONTIME is null");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeIsNotNull() {
            addCriterion("ACQUISITIONTIME is not null");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeEqualTo(Date value) {
            addCriterion("ACQUISITIONTIME =", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeNotEqualTo(Date value) {
            addCriterion("ACQUISITIONTIME <>", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeGreaterThan(Date value) {
            addCriterion("ACQUISITIONTIME >", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ACQUISITIONTIME >=", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeLessThan(Date value) {
            addCriterion("ACQUISITIONTIME <", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeLessThanOrEqualTo(Date value) {
            addCriterion("ACQUISITIONTIME <=", value, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeIn(List<Date> values) {
            addCriterion("ACQUISITIONTIME in", values, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeNotIn(List<Date> values) {
            addCriterion("ACQUISITIONTIME not in", values, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeBetween(Date value1, Date value2) {
            addCriterion("ACQUISITIONTIME between", value1, value2, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andAcquisitiontimeNotBetween(Date value1, Date value2) {
            addCriterion("ACQUISITIONTIME not between", value1, value2, "acquisitiontime");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("TEMPERATURE is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("TEMPERATURE is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(BigDecimal value) {
            addCriterion("TEMPERATURE >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(BigDecimal value) {
            addCriterion("TEMPERATURE <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TEMPERATURE <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<BigDecimal> values) {
            addCriterion("TEMPERATURE in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<BigDecimal> values) {
            addCriterion("TEMPERATURE not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPERATURE between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TEMPERATURE not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureIsNull() {
            addCriterion("ABSOLUTEPRESSURE is null");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureIsNotNull() {
            addCriterion("ABSOLUTEPRESSURE is not null");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureEqualTo(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE =", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureNotEqualTo(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE <>", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureGreaterThan(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE >", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE >=", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureLessThan(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE <", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ABSOLUTEPRESSURE <=", value, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureIn(List<BigDecimal> values) {
            addCriterion("ABSOLUTEPRESSURE in", values, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureNotIn(List<BigDecimal> values) {
            addCriterion("ABSOLUTEPRESSURE not in", values, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ABSOLUTEPRESSURE between", value1, value2, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andAbsolutepressureNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ABSOLUTEPRESSURE not between", value1, value2, "absolutepressure");
            return (Criteria) this;
        }

        public Criteria andDensityIsNull() {
            addCriterion("DENSITY is null");
            return (Criteria) this;
        }

        public Criteria andDensityIsNotNull() {
            addCriterion("DENSITY is not null");
            return (Criteria) this;
        }

        public Criteria andDensityEqualTo(BigDecimal value) {
            addCriterion("DENSITY =", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotEqualTo(BigDecimal value) {
            addCriterion("DENSITY <>", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThan(BigDecimal value) {
            addCriterion("DENSITY >", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DENSITY >=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThan(BigDecimal value) {
            addCriterion("DENSITY <", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DENSITY <=", value, "density");
            return (Criteria) this;
        }

        public Criteria andDensityIn(List<BigDecimal> values) {
            addCriterion("DENSITY in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotIn(List<BigDecimal> values) {
            addCriterion("DENSITY not in", values, "density");
            return (Criteria) this;
        }

        public Criteria andDensityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DENSITY between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andDensityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DENSITY not between", value1, value2, "density");
            return (Criteria) this;
        }

        public Criteria andPressure20cIsNull() {
            addCriterion("PRESSURE20C is null");
            return (Criteria) this;
        }

        public Criteria andPressure20cIsNotNull() {
            addCriterion("PRESSURE20C is not null");
            return (Criteria) this;
        }

        public Criteria andPressure20cEqualTo(BigDecimal value) {
            addCriterion("PRESSURE20C =", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cNotEqualTo(BigDecimal value) {
            addCriterion("PRESSURE20C <>", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cGreaterThan(BigDecimal value) {
            addCriterion("PRESSURE20C >", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE20C >=", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cLessThan(BigDecimal value) {
            addCriterion("PRESSURE20C <", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRESSURE20C <=", value, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cIn(List<BigDecimal> values) {
            addCriterion("PRESSURE20C in", values, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cNotIn(List<BigDecimal> values) {
            addCriterion("PRESSURE20C not in", values, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE20C between", value1, value2, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andPressure20cNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRESSURE20C not between", value1, value2, "pressure20c");
            return (Criteria) this;
        }

        public Criteria andIshandledIsNull() {
            addCriterion("ISHANDLED is null");
            return (Criteria) this;
        }

        public Criteria andIshandledIsNotNull() {
            addCriterion("ISHANDLED is not null");
            return (Criteria) this;
        }

        public Criteria andIshandledEqualTo(String value) {
            addCriterion("ISHANDLED =", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledNotEqualTo(String value) {
            addCriterion("ISHANDLED <>", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledGreaterThan(String value) {
            addCriterion("ISHANDLED >", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledGreaterThanOrEqualTo(String value) {
            addCriterion("ISHANDLED >=", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledLessThan(String value) {
            addCriterion("ISHANDLED <", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledLessThanOrEqualTo(String value) {
            addCriterion("ISHANDLED <=", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledLike(String value) {
            addCriterion("ISHANDLED like", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledNotLike(String value) {
            addCriterion("ISHANDLED not like", value, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledIn(List<String> values) {
            addCriterion("ISHANDLED in", values, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledNotIn(List<String> values) {
            addCriterion("ISHANDLED not in", values, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledBetween(String value1, String value2) {
            addCriterion("ISHANDLED between", value1, value2, "ishandled");
            return (Criteria) this;
        }

        public Criteria andIshandledNotBetween(String value1, String value2) {
            addCriterion("ISHANDLED not between", value1, value2, "ishandled");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNull() {
            addCriterion("PHASE is null");
            return (Criteria) this;
        }

        public Criteria andPhaseIsNotNull() {
            addCriterion("PHASE is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseEqualTo(String value) {
            addCriterion("PHASE =", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotEqualTo(String value) {
            addCriterion("PHASE <>", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThan(String value) {
            addCriterion("PHASE >", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseGreaterThanOrEqualTo(String value) {
            addCriterion("PHASE >=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThan(String value) {
            addCriterion("PHASE <", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLessThanOrEqualTo(String value) {
            addCriterion("PHASE <=", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseLike(String value) {
            addCriterion("PHASE like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotLike(String value) {
            addCriterion("PHASE not like", value, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseIn(List<String> values) {
            addCriterion("PHASE in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotIn(List<String> values) {
            addCriterion("PHASE not in", values, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseBetween(String value1, String value2) {
            addCriterion("PHASE between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andPhaseNotBetween(String value1, String value2) {
            addCriterion("PHASE not between", value1, value2, "phase");
            return (Criteria) this;
        }

        public Criteria andResaveTimeIsNull() {
            addCriterion("RESAVE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andResaveTimeIsNotNull() {
            addCriterion("RESAVE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andResaveTimeEqualTo(Date value) {
            addCriterion("RESAVE_TIME =", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeNotEqualTo(Date value) {
            addCriterion("RESAVE_TIME <>", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeGreaterThan(Date value) {
            addCriterion("RESAVE_TIME >", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("RESAVE_TIME >=", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeLessThan(Date value) {
            addCriterion("RESAVE_TIME <", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeLessThanOrEqualTo(Date value) {
            addCriterion("RESAVE_TIME <=", value, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeIn(List<Date> values) {
            addCriterion("RESAVE_TIME in", values, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeNotIn(List<Date> values) {
            addCriterion("RESAVE_TIME not in", values, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeBetween(Date value1, Date value2) {
            addCriterion("RESAVE_TIME between", value1, value2, "resaveTime");
            return (Criteria) this;
        }

        public Criteria andResaveTimeNotBetween(Date value1, Date value2) {
            addCriterion("RESAVE_TIME not between", value1, value2, "resaveTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated do_not_delete_during_merge Fri Nov 16 16:17:43 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table CMST_AIRPRESSURE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
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