package com.luhan.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  商品-实体类
 *@date 2019-07-21 21:15
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer categoryId;
    private String name;
    private String subtitle;
    private String mainImage;
    private String subImages;
    private String detail;
    private BigDecimal price;
    private Integer stock;
    private Integer status;
}