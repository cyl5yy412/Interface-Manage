package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycKgg;
import com.lnsoft.module.pms.pojo.TSbZnycKggExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycKggMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int countByExample(TSbZnycKggExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByExample(TSbZnycKggExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insert(TSbZnycKgg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insertSelective(TSbZnycKgg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    List<TSbZnycKgg> selectByExample(TSbZnycKggExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    TSbZnycKgg selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycKgg record, @Param("example") TSbZnycKggExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycKgg record, @Param("example") TSbZnycKggExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycKgg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_KGG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKey(TSbZnycKgg record);
}