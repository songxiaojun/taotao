package com.taotao.mapper;

import com.taotao.pojo.TbItemDesc;

public interface TbItemDescMapper {

    int deleteByPrimaryKey(Long itemId);


    int insertSelective(TbItemDesc record);


    TbItemDesc selectByPrimaryKey(Long itemId);


    int updateByPrimaryKeySelective(TbItemDesc record);

}