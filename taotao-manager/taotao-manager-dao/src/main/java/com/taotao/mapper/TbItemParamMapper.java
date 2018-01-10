package com.taotao.mapper;

import com.taotao.pojo.TbItemParam;

public interface TbItemParamMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbItemParam record);


    TbItemParam selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(TbItemParam record);

}