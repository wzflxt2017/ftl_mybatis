package com.wangzefeng.dao;

import com.wangzefeng.pojo.TestProblemOption;
import com.wangzefeng.example.TestProblemOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestProblemOptionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int countByExample(TestProblemOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByExample(TestProblemOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByPrimaryKey(String testProblemOptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insert(TestProblemOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insertSelective(TestProblemOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    List<TestProblemOption> selectByExample(TestProblemOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    TestProblemOption selectByPrimaryKey(String testProblemOptionId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") TestProblemOption record, @Param("example") TestProblemOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExample(@Param("record") TestProblemOption record, @Param("example") TestProblemOptionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKeySelective(TestProblemOption record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table test_problem_option
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKey(TestProblemOption record);
}