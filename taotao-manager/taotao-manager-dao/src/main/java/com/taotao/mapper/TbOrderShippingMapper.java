package com.taotao.mapper;

import com.taotao.pojo.TbOrderShipping;

public interface TbOrderShippingMapper {

    int deleteByPrimaryKey(String orderId);


    int insertSelective(TbOrderShipping record);


    TbOrderShipping selectByPrimaryKey(String orderId);


    int updateByPrimaryKeySelective(TbOrderShipping record);

}