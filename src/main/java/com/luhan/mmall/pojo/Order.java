package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

/**
 *  订单-实体类
 *@date 2019-07-21 21:16
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BasePojo {
    private Long orderNo;
    private Integer userId;
    private Integer shippingId;
    private BigDecimal payment;
    private Integer paymentType;
    private Integer postage;
    private Integer status;
    private Date paymentTime;
    private Date sendTime;
    private Date endTime;
    private Date closeTime;
}