package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *  购物车信息-实体类
 *@date 2019-07-21 21:16
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart extends BasePojo {
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer quantity;
    private Integer checked;
}