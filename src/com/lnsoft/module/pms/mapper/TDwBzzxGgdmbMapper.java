package com.lnsoft.module.pms.mapper;

import com.lnsoft.module.pms.pojo.TDwBzzxGgdmb;
import com.lnsoft.module.pms.pojo.TDwBzzxGgdmbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDwBzzxGgdmbMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int countByExample(TDwBzzxGgdmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByExample(TDwBzzxGgdmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insert(TDwBzzxGgdmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int insertSelective(TDwBzzxGgdmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    List<TDwBzzxGgdmb> selectByExample(TDwBzzxGgdmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    TDwBzzxGgdmb selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExampleSelective(@Param("record") TDwBzzxGgdmb record, @Param("example") TDwBzzxGgdmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByExample(@Param("record") TDwBzzxGgdmb record, @Param("example") TDwBzzxGgdmbExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKeySelective(TDwBzzxGgdmb record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_DW_BZZX_GGDMB
     *
     * @mbggenerated Fri Nov 16 15:12:59 CST 2018
     */
    int updateByPrimaryKey(TDwBzzxGgdmb record);
}