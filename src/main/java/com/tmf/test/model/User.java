package com.tmf.test.model;


import java.time.LocalDateTime;

/**
 * 用户信息表
 *
 * @author Charles
 * @date 2020-08-17 09:57:52
 */
public class User {

    /**
     * 平台用户id
     */
    private Integer userId;

    /**
     * 账号
     */
    private String userName;

    /**
     * 密码
     */
    private String userPass;

    /**
     * 删除标识（字典）
     */
    private Integer isDel;

    /**
     * 创建人
     */
    private String crtUser;

    /**
     * 创建时间
     */
    private LocalDateTime crtTime;

    /**
     * 更新人
     */
    private String uptUser;

    /**
     * 更新时间
     */
    private LocalDateTime uptTime;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
