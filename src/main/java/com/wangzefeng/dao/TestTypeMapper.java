package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestType;
import com.wangzefeng.example.TestTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestTypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int countByExample(TestTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByExample(TestTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByPrimaryKey(String testTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insert(TestType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insertSelective(TestType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    List<TestType> selectByExample(TestTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    TestType selectByPrimaryKey(String testTypeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") TestType record, @Param("example") TestTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExample(@Param("record") TestType record, @Param("example") TestTypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKeySelective(TestType record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_type
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKey(TestType record);
}