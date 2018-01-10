package com.taotao.mapper;

import com.taotao.pojo.TbContent;

public interface TbContentMapper {

    int deleteByPrimaryKey(Long id);

    int insertSelective(TbContent record);

    TbContent selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContent record);

    int updateByPrimaryKey(TbContent record);
}