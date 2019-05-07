package com.lnsoft.module.sbdzxjc.mapper;

import com.lnsoft.module.sbdzxjc.pojo.CmstPhysicsdevice;
import com.lnsoft.module.sbdzxjc.pojo.CmstPhysicsdeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CmstPhysicsdeviceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int countByExample(CmstPhysicsdeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByExample(CmstPhysicsdeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int deleteByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insert(CmstPhysicsdevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int insertSelective(CmstPhysicsdevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    List<CmstPhysicsdevice> selectByExample(CmstPhysicsdeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    CmstPhysicsdevice selectByPrimaryKey(String objId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExampleSelective(@Param("record") CmstPhysicsdevice record, @Param("example") CmstPhysicsdeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByExample(@Param("record") CmstPhysicsdevice record, @Param("example") CmstPhysicsdeviceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKeySelective(CmstPhysicsdevice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table CMST_PHYSICSDEVICE
     *
     * @mbggenerated Fri Nov 16 16:17:43 CST 2018
     */
    int updateByPrimaryKey(CmstPhysicsdevice record);
}