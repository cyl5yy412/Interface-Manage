package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.CmstSolublegasinoil;
import com.lnsoft.module.sbdzxjc.pojo.CmstSolublegasinoilExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmstSolublegasinoilMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int countByExample(CmstSolublegasinoilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByExample(CmstSolublegasinoilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insert(CmstSolublegasinoil record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insertSelective(CmstSolublegasinoil record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstSolublegasinoil> selectByExample(CmstSolublegasinoilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmstSolublegasinoil record, @Param("example") CmstSolublegasinoilExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_SOLUBLEGASINOIL
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExample(@Param("record") CmstSolublegasinoil record, @Param("example") CmstSolublegasinoilExample example);
}