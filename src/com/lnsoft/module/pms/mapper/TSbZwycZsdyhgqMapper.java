package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZwycZsdyhgq;
import com.lnsoft.module.pms.pojo.TSbZwycZsdyhgqExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZwycZsdyhgqMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZwycZsdyhgqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZwycZsdyhgqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZwycZsdyhgq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZwycZsdyhgq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZwycZsdyhgq> selectByExample(TSbZwycZsdyhgqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZwycZsdyhgq selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZwycZsdyhgq record, @Param("example") TSbZwycZsdyhgqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZwycZsdyhgq record, @Param("example") TSbZwycZsdyhgqExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZwycZsdyhgq record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_ZSDYHGQ
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZwycZsdyhgq record);
}