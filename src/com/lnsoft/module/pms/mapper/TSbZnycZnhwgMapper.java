package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycZnhwg;
import com.lnsoft.module.pms.pojo.TSbZnycZnhwgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycZnhwgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int countByExample(TSbZnycZnhwgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByExample(TSbZnycZnhwgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insert(TSbZnycZnhwg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insertSelective(TSbZnycZnhwg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    List<TSbZnycZnhwg> selectByExample(TSbZnycZnhwgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    TSbZnycZnhwg selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycZnhwg record, @Param("example") TSbZnycZnhwgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycZnhwg record, @Param("example") TSbZnycZnhwgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycZnhwg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_ZNHWG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKey(TSbZnycZnhwg record);
}