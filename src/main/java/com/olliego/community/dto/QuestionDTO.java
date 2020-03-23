package com.olliego.community.dto;

import com.olliego.community.model.User;
import lombok.Data;

/**
 * @Classname QuestionDTO
 * @Description Question and User
 * @Date 2020/3/12 14:33
 * @Created by OllieGo
 */
@Data
public class QuestionDTO {
    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Long creator;
    private Long viewCount;
    private Long commentCount;
    private Long likeCount;
    private User user;
}