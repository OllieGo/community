package com.olliego.community.mapper;

import com.olliego.community.model.Question;
import com.olliego.community.model.QuestionExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface QuestionExtMapper {
    int incView(Question record);
}