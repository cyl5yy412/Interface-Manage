package com.lnsoft.module.ddjc.mapper;

import com.lnsoft.module.ddjc.pojo.DdjcGistgpjfBase;
import com.lnsoft.module.ddjc.pojo.DdjcGistgpjfBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcGistgpjfBaseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int countByExample(DdjcGistgpjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByExample(DdjcGistgpjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByPrimaryKey(String ysjlId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insert(DdjcGistgpjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insertSelective(DdjcGistgpjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    List<DdjcGistgpjfBase> selectByExample(DdjcGistgpjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    DdjcGistgpjfBase selectByPrimaryKey(String ysjlId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DdjcGistgpjfBase record, @Param("example") DdjcGistgpjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExample(@Param("record") DdjcGistgpjfBase record, @Param("example") DdjcGistgpjfBaseExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKeySelective(DdjcGistgpjfBase record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_GISTGPJF_BASE
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKey(DdjcGistgpjfBase record);
}