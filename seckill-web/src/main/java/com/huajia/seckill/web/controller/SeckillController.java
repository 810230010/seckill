package com.huajia.seckill.web.controller;

import com.huajia.seckill.api.dto.GoodsDTO;
import com.huajia.seckill.api.service.GoodsService;
import com.huajia.seckill.common.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("seckill")
public class SeckillController {
    @Resource
    private GoodsService goodsService;

    @GetMapping("goods")
    public RestResult listGoods() {
        List<GoodsDTO> list = goodsService.list();
        return RestResult.ok(list);
    }
}
