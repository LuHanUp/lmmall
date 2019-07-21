package com.luhan.mmall.pojo;

import com.luhan.mmall.base.BasePojo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *  商品分类-实体类
 *@date 2019-07-21 21:16
 *@author luHan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category extends BasePojo {
    private Integer parentId;
    private String name;
    private Boolean status;
    private Integer sortOrder;
}