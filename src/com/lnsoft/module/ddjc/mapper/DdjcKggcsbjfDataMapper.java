package com.lnsoft.module.ddjc.mapper;

import com.lnsoft.module.ddjc.pojo.DdjcKggcsbjfData;
import com.lnsoft.module.ddjc.pojo.DdjcKggcsbjfDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdjcKggcsbjfDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int countByExample(DdjcKggcsbjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByExample(DdjcKggcsbjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int deleteByPrimaryKey(String sjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insert(DdjcKggcsbjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int insertSelective(DdjcKggcsbjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    List<DdjcKggcsbjfData> selectByExample(DdjcKggcsbjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    DdjcKggcsbjfData selectByPrimaryKey(String sjid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExampleSelective(@Param("record") DdjcKggcsbjfData record, @Param("example") DdjcKggcsbjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByExample(@Param("record") DdjcKggcsbjfData record, @Param("example") DdjcKggcsbjfDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKeySelective(DdjcKggcsbjfData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DDJC_KGGCSBJF_DATA
     *
     * @mbggenerated Fri Nov 16 16:13:35 CST 2018
     */
    int updateByPrimaryKey(DdjcKggcsbjfData record);
}