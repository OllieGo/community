package com.olliego.community.dto;

import lombok.Data;

/**
 * @Classname GithubUser
 * @Description Github返回的User信息
 * @Date 2020/3/8 15:20
 * @Created by OllieGo
 */
@Data
public class GithubUser {
    private String name;
    private Long id;
    private String bio;
    private String avatarUrl;
}