package com.huajia.seckill.api.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class GoodsDTO implements Serializable {
    private int id;
    private String goodsCode;
    private String goodsName;
    private int stock;
}
