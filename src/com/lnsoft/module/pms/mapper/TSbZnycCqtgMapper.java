package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZnycCqtg;
import com.lnsoft.module.pms.pojo.TSbZnycCqtgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZnycCqtgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int countByExample(TSbZnycCqtgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByExample(TSbZnycCqtgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insert(TSbZnycCqtg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int insertSelective(TSbZnycCqtg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    List<TSbZnycCqtg> selectByExample(TSbZnycCqtgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    TSbZnycCqtg selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZnycCqtg record, @Param("example") TSbZnycCqtgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByExample(@Param("record") TSbZnycCqtg record, @Param("example") TSbZnycCqtgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZnycCqtg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZNYC_CQTG
     *
     * @mbggenerated Fri Nov 16 15:13:00 CST 2018
     */
    int updateByPrimaryKey(TSbZnycCqtg record);
}