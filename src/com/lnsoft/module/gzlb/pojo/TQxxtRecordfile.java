package com.lnsoft.module.gzlb.pojo;

import java.math.BigDecimal;

public class TQxxtRecordfile {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_QXXT_RECORDFILE.ID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    private BigDecimal id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_QXXT_RECORDFILE.NAME
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_QXXT_RECORDFILE.POSTFIX
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    private String postfix;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column T_QXXT_RECORDFILE.MID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    private BigDecimal mid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_QXXT_RECORDFILE.ID
     *
     * @return the value of T_QXXT_RECORDFILE.ID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_QXXT_RECORDFILE.ID
     *
     * @param id the value for T_QXXT_RECORDFILE.ID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setId(BigDecimal id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_QXXT_RECORDFILE.NAME
     *
     * @return the value of T_QXXT_RECORDFILE.NAME
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_QXXT_RECORDFILE.NAME
     *
     * @param name the value for T_QXXT_RECORDFILE.NAME
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_QXXT_RECORDFILE.POSTFIX
     *
     * @return the value of T_QXXT_RECORDFILE.POSTFIX
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public String getPostfix() {
        return postfix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_QXXT_RECORDFILE.POSTFIX
     *
     * @param postfix the value for T_QXXT_RECORDFILE.POSTFIX
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setPostfix(String postfix) {
        this.postfix = postfix == null ? null : postfix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column T_QXXT_RECORDFILE.MID
     *
     * @return the value of T_QXXT_RECORDFILE.MID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public BigDecimal getMid() {
        return mid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column T_QXXT_RECORDFILE.MID
     *
     * @param mid the value for T_QXXT_RECORDFILE.MID
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}