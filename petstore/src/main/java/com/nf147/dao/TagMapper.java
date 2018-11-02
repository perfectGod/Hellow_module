package com.nf147.dao;

import com.nf147.entity.Tag;
import com.nf147.entity.TagExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TagMapper {
    long countByExample(TagExample example);

    int deleteByExample(TagExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(Tag record);

    int insertSelective(Tag record);

    List<Tag> selectByExample(TagExample example);

    Tag selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    int updateByPrimaryKeySelective(Tag record);

    int updateByPrimaryKey(Tag record);
}