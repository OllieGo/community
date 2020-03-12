package com.olliego.community.dto;

import lombok.Data;

/**
 * @Classname AccessTokenDTO
 * @Description DTO(Data Transfer Object) about AccessToken
 * 参数超过两个要封装成对象，不要作为形参放在方法上
 * @Date 2020/3/8 14:05
 * @Created by OllieGo
 */
@Data
public class AccessTokenDTO {
    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
