package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *  用户-实体类
 *@date 2019-07-21 21:14
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BasePojo {
    private String username;
    private String password;
    private String email;
    private String phone;
    private String question;
    private String answer;
    private Integer role;
}