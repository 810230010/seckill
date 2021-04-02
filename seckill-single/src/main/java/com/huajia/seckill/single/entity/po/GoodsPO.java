package com.huajia.seckill.single.entity.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_goods")
@Data
public class GoodsPO {
    @TableId
    private int id;
    private String goodsCode;
    private String goodsName;
    private int stock;
}
