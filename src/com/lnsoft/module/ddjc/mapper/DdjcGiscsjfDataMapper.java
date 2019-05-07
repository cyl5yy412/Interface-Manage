package com.lnsoft.module.ddjc.mapper;

import com.lnsoft.module.ddjc.pojo.DdjcGiscsjfData;
import com.lnsoft.module.ddjc.pojo.DdjcGiscsjfDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcGiscsjfDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int countByExample(DdjcGiscsjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByExample(DdjcGiscsjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByPrimaryKey(String sjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insert(DdjcGiscsjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insertSelective(DdjcGiscsjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    List<DdjcGiscsjfData> selectByExample(DdjcGiscsjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    DdjcGiscsjfData selectByPrimaryKey(String sjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DdjcGiscsjfData record, @Param("example") DdjcGiscsjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExample(@Param("record") DdjcGiscsjfData record, @Param("example") DdjcGiscsjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKeySelective(DdjcGiscsjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISCSJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKey(DdjcGiscsjfData record);
}