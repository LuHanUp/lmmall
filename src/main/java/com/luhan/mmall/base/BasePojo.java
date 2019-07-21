package com.luhan.mmall.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author luHan
 * @date 2019-07-21 19:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasePojo {
    private Integer id;
    private Timestamp createTime;
    private Timestamp updateTime;
}
