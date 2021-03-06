package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.CmstGispartdischarge;
import com.lnsoft.module.sbdzxjc.pojo.CmstGispartdischargeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmstGispartdischargeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int countByExample(CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByExample(CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insert(CmstGispartdischarge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insertSelective(CmstGispartdischarge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstGispartdischarge> selectByExampleWithBLOBs(CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstGispartdischarge> selectByExample(CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    CmstGispartdischarge selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmstGispartdischarge record, @Param("example") CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") CmstGispartdischarge record, @Param("example") CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExample(@Param("record") CmstGispartdischarge record, @Param("example") CmstGispartdischargeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKeySelective(CmstGispartdischarge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(CmstGispartdischarge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_GISPARTDISCHARGE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKey(CmstGispartdischarge record);
}