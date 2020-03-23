package com.olliego.community.mapper;

import com.olliego.community.model.Question;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface QuestionExtMapper {

    int incView(Question record);

    int incCommentCount(Question record);
}