package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycDkq;
import com.lnsoft.module.pms.pojo.TSbZnycDkqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycDkqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int countByExample(TSbZnycDkqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByExample(TSbZnycDkqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insert(TSbZnycDkq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insertSelective(TSbZnycDkq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    List<TSbZnycDkq> selectByExample(TSbZnycDkqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    TSbZnycDkq selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycDkq record, @Param("example") TSbZnycDkqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycDkq record, @Param("example") TSbZnycDkqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycDkq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_DKQ
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKey(TSbZnycDkq record);
}