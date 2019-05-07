package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TSbZwycDlzd;
import com.lnsoft.module.pms.pojo.TSbZwycDlzdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSbZwycDlzdMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TSbZwycDlzdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TSbZwycDlzdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TSbZwycDlzd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TSbZwycDlzd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TSbZwycDlzd> selectByExample(TSbZwycDlzdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TSbZwycDlzd selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TSbZwycDlzd record, @Param("example") TSbZwycDlzdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TSbZwycDlzd record, @Param("example") TSbZwycDlzdExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TSbZwycDlzd record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_SB_ZWYC_DLZD
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TSbZwycDlzd record);
}