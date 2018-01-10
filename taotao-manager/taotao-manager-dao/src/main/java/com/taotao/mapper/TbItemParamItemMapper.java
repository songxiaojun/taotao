package com.taotao.mapper;

import com.taotao.pojo.TbItemParamItem;

public interface TbItemParamItemMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbItemParamItem record);


    TbItemParamItem selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(TbItemParamItem record);

}