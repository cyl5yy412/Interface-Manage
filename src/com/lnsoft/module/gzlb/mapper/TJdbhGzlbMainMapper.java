package com.lnsoft.module.gzlb.mapper;

import com.lnsoft.module.gzlb.pojo.TJdbhGzlbMain;
import com.lnsoft.module.gzlb.pojo.TJdbhGzlbMainExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TJdbhGzlbMainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int countByExample(TJdbhGzlbMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int deleteByExample(TJdbhGzlbMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int deleteByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int insert(TJdbhGzlbMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int insertSelective(TJdbhGzlbMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    List<TJdbhGzlbMain> selectByExample(TJdbhGzlbMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    TJdbhGzlbMain selectByPrimaryKey(BigDecimal id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int updateByExampleSelective(@Param("record") TJdbhGzlbMain record, @Param("example") TJdbhGzlbMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int updateByExample(@Param("record") TJdbhGzlbMain record, @Param("example") TJdbhGzlbMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int updateByPrimaryKeySelective(TJdbhGzlbMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_JDBH_GZLB_MAIN
     *
     * @mbggenerated Fri Nov 16 16:23:22 CST 2018
     */
    int updateByPrimaryKey(TJdbhGzlbMain record);
}