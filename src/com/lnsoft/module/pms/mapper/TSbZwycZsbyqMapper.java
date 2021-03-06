package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZwycZsbyq;
import com.lnsoft.module.pms.pojo.TSbZwycZsbyqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZwycZsbyqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZwycZsbyqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZwycZsbyqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZwycZsbyq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZwycZsbyq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZwycZsbyq> selectByExample(TSbZwycZsbyqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZwycZsbyq selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZwycZsbyq record, @Param("example") TSbZwycZsbyqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZwycZsbyq record, @Param("example") TSbZwycZsbyqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZwycZsbyq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSBYQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZwycZsbyq record);
}