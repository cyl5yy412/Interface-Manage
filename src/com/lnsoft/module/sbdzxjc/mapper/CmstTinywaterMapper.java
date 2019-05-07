package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.CmstTinywater;
import com.lnsoft.module.sbdzxjc.pojo.CmstTinywaterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmstTinywaterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int countByExample(CmstTinywaterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByExample(CmstTinywaterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insert(CmstTinywater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insertSelective(CmstTinywater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstTinywater> selectByExample(CmstTinywaterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    CmstTinywater selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmstTinywater record, @Param("example") CmstTinywaterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExample(@Param("record") CmstTinywater record, @Param("example") CmstTinywaterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKeySelective(CmstTinywater record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_TINYWATER
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKey(CmstTinywater record);
}