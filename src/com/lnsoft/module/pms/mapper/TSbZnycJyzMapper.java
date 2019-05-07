package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycJyz;
import com.lnsoft.module.pms.pojo.TSbZnycJyzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycJyzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int countByExample(TSbZnycJyzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByExample(TSbZnycJyzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insert(TSbZnycJyz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insertSelective(TSbZnycJyz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    List<TSbZnycJyz> selectByExample(TSbZnycJyzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    TSbZnycJyz selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycJyz record, @Param("example") TSbZnycJyzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycJyz record, @Param("example") TSbZnycJyzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycJyz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_JYZ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKey(TSbZnycJyz record);
}