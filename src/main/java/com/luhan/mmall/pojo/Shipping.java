package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 *  收件地址-实体类
 *@date 2019-07-21 21:14
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shipping extends BasePojo{
    private Integer userId;
    private String receiverName;
    private String receiverPhone;
    private String receiverMobile;
    private String receiverProvince;
    private String receiverCity;
    private String receiverDistrict;
    private String receiverAddress;
    private String receiverZip;
}