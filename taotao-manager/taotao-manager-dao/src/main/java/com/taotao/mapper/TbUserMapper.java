package com.taotao.mapper;

import com.taotao.pojo.TbUser;

public interface TbUserMapper {

    int deleteByPrimaryKey(Long id);


    int insertSelective(TbUser record);


    TbUser selectByPrimaryKey(Long id);


    int updateByPrimaryKeySelective(TbUser record);

}