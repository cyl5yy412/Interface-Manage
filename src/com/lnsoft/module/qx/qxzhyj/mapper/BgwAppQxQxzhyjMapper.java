package com.lnsoft.module.qx.qxzhyj.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lnsoft.module.qx.qxzhyj.pojo.BgwAppQxQxzhyj;
import com.lnsoft.module.qx.qxzhyj.pojo.BgwAppQxQxzhyjExample;

public interface BgwAppQxQxzhyjMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int countByExample(BgwAppQxQxzhyjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int deleteByExample(BgwAppQxQxzhyjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int insert(BgwAppQxQxzhyj record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int insertSelective(BgwAppQxQxzhyj record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    List<BgwAppQxQxzhyj> selectByExample(BgwAppQxQxzhyjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int updateByExampleSelective(@Param("record") BgwAppQxQxzhyj record, @Param("example") BgwAppQxQxzhyjExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table BGW_APP_QX_QXZHYJ
     *
     * @mbggenerated Fri Nov 16 16:29:01 CST 2018
     */
    int updateByExample(@Param("record") BgwAppQxQxzhyj record, @Param("example") BgwAppQxQxzhyjExample example);
}