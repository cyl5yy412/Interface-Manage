package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.CmstIroncoreelectricity;
import com.lnsoft.module.sbdzxjc.pojo.CmstIroncoreelectricityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmstIroncoreelectricityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int countByExample(CmstIroncoreelectricityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByExample(CmstIroncoreelectricityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insert(CmstIroncoreelectricity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insertSelective(CmstIroncoreelectricity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstIroncoreelectricity> selectByExample(CmstIroncoreelectricityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    CmstIroncoreelectricity selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmstIroncoreelectricity record, @Param("example") CmstIroncoreelectricityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExample(@Param("record") CmstIroncoreelectricity record, @Param("example") CmstIroncoreelectricityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKeySelective(CmstIroncoreelectricity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_IRONCOREELECTRICITY
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKey(CmstIroncoreelectricity record);
}