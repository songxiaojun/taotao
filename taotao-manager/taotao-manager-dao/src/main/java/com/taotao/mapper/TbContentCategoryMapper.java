package com.taotao.mapper;

import com.taotao.pojo.TbContentCategory;

public interface TbContentCategoryMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbContentCategory record);

    TbContentCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbContentCategory record);

}