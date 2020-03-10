## 论坛社区
基于SpringBoot实现的论坛项目

前端 bootstrap

## 资料
spring官网
https://spring.io/guides

Bootstrap
https://www.bootcss.com/

github授权登录
https://developer.github.com/apps/building-oauth-apps/authorizing-oauth-apps/
## mysql数据库脚本
```sql
CREATE TABLE USER(
    ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);
```