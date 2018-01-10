package com.taotao.mapper;

import com.taotao.pojo.TbOrderItem;

public interface TbOrderItemMapper {

    int deleteByPrimaryKey(String id);


    int insertSelective(TbOrderItem record);


    TbOrderItem selectByPrimaryKey(String id);


    int updateByPrimaryKeySelective(TbOrderItem record);

}