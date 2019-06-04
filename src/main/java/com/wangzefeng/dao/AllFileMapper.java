package com.wangzefeng.dao;

import com.wangzefeng.pojo.AllFile;
import com.wangzefeng.example.AllFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int countByExample(AllFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByExample(AllFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int deleteByPrimaryKey(String fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insert(AllFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int insertSelective(AllFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    List<AllFile> selectByExample(AllFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    AllFile selectByPrimaryKey(String fileId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExampleSelective(@Param("record") AllFile record, @Param("example") AllFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByExample(@Param("record") AllFile record, @Param("example") AllFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKeySelective(AllFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table all_file
     *
     * @mbggenerated Tue Jun 04 14:35:00 CST 2019
     */
    int updateByPrimaryKey(AllFile record);
}