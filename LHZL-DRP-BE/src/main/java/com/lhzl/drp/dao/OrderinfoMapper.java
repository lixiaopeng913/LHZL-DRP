package com.lhzl.drp.dao;

import com.lhzl.drp.model.Orderinfo;

public interface OrderinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    int deleteByPrimaryKey(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    int insert(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    int insertSelective(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    Orderinfo selectByPrimaryKey(Long orderid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    int updateByPrimaryKeySelective(Orderinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbl_orderinfo
     *
     * @mbggenerated Thu Mar 24 15:33:09 CST 2016
     */
    int updateByPrimaryKey(Orderinfo record);
}