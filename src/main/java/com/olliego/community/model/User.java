package com.olliego.community.model;

import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/3/9 15:15
 * @Created by OllieGo
 */
@Data
public class User {
    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;
}
