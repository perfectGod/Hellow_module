package com.nf147.dao;

import com.nf147.entity.Apiresponse;
import com.nf147.entity.ApiresponseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiresponseMapper {
    long countByExample(ApiresponseExample example);

    int deleteByExample(ApiresponseExample example);

    int deleteByPrimaryKey(String code);

    int insert(Apiresponse record);

    int insertSelective(Apiresponse record);

    List<Apiresponse> selectByExample(ApiresponseExample example);

    Apiresponse selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") Apiresponse record, @Param("example") ApiresponseExample example);

    int updateByExample(@Param("record") Apiresponse record, @Param("example") ApiresponseExample example);

    int updateByPrimaryKeySelective(Apiresponse record);

    int updateByPrimaryKey(Apiresponse record);
}