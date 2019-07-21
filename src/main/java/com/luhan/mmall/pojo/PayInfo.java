package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 支付信息-实体类
 *@date 2019-07-21 21:15
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PayInfo extends BasePojo {
    private Integer id;
    private Integer userId;
    private Long orderNo;
    private Integer payPlatform;
    private String platformNumber;
    private String platformStatus;
}