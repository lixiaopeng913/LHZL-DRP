package com.lhzl.drp.dao;

import com.lhzl.drp.model.BookValue;

import java.util.List;
import java.util.Map;

public interface BookValueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int deleteByPrimaryKey(Long valueid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int insert(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int insertSelective(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    BookValue selectByPrimaryKey(Long valueid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int updateByPrimaryKeySelective(BookValue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_book_value
     *
     * @mbggenerated Wed Mar 30 15:46:10 CST 2016
     */
    int updateByPrimaryKey(BookValue record);

    /**
     * 查询代码对应的值.
     *
     * @param map
     * @return
     */
    List<BookValue> queryBookValue(Map<String, Object> map);

    /**
     * 删除代码对应的值
     *
     * @param codeid
     */
    void deleteBookValueByCodeid(long codeid);
}