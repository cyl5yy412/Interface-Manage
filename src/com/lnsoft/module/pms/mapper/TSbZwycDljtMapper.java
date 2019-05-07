package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZwycDljt;
import com.lnsoft.module.pms.pojo.TSbZwycDljtExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZwycDljtMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZwycDljtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZwycDljtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZwycDljt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZwycDljt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZwycDljt> selectByExample(TSbZwycDljtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZwycDljt selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZwycDljt record, @Param("example") TSbZwycDljtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZwycDljt record, @Param("example") TSbZwycDljtExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZwycDljt record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLJT
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZwycDljt record);
}