package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestProblems;
import com.wangzefeng.example.TestProblemsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestProblemsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int countByExample(TestProblemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByExample(TestProblemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByPrimaryKey(String testProblemsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insert(TestProblems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insertSelective(TestProblems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    List<TestProblems> selectByExample(TestProblemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    TestProblems selectByPrimaryKey(String testProblemsId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") TestProblems record, @Param("example") TestProblemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExample(@Param("record") TestProblems record, @Param("example") TestProblemsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKeySelective(TestProblems record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problems
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKey(TestProblems record);
}