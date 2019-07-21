package com.luhan.mmall.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  订单明细-实体类
 *@date 2019-07-21 21:15
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private Integer userId;
    private Long orderNo;
    private Integer productId;
    private String productName;
    private String productImage;
    private BigDecimal currentUnitPrice;
    private Integer quantity;
    private BigDecimal totalPrice;
}