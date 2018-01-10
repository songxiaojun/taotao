package com.taotao.mapper;

import com.taotao.pojo.TbOrder;

public interface TbOrderMapper {

    int deleteByPrimaryKey(String orderId);

    int insertSelective(TbOrder record);

    TbOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(TbOrder record);

}