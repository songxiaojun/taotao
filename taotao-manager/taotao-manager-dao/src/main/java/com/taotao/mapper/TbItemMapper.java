package com.taotao.mapper;

import com.taotao.pojo.TbItem;

public interface TbItemMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbItem record);


    TbItem selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(TbItem record);

}