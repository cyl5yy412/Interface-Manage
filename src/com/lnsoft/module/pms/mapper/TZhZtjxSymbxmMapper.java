package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TZhZtjxSymbxm;
import com.lnsoft.module.pms.pojo.TZhZtjxSymbxmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TZhZtjxSymbxmMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TZhZtjxSymbxmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TZhZtjxSymbxmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TZhZtjxSymbxm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TZhZtjxSymbxm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TZhZtjxSymbxm> selectByExample(TZhZtjxSymbxmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TZhZtjxSymbxm selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TZhZtjxSymbxm record, @Param("example") TZhZtjxSymbxmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TZhZtjxSymbxm record, @Param("example") TZhZtjxSymbxmExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TZhZtjxSymbxm record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_ZH_ZTJX_SYMBXM
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TZhZtjxSymbxm record);
}