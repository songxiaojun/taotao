package com.taotao.mapper;

import com.taotao.pojo.TbItemCat;

public interface TbItemCatMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbItemCat record);


    TbItemCat selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(TbItemCat record);

}