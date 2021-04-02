package com.huajia.seckill.single.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.huajia.seckill.api.dto.GoodsDTO;
import com.huajia.seckill.api.service.GoodsService;
import com.huajia.seckill.single.dao.GoodsMapper;
import com.huajia.seckill.single.entity.po.GoodsPO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static java.util.stream.Collectors.toList;

@Slf4j
@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<GoodsDTO> list() {
        List<GoodsPO> goodsPOS = goodsMapper.selectList(null);
        log.info("goods list: {}", goodsPOS);

        return goodsPOS.stream().map(this::convertPO2DTO).collect(toList());
    }

    private GoodsDTO  convertPO2DTO(GoodsPO goodsPO) {
        GoodsDTO result = new GoodsDTO();
        BeanUtils.copyProperties(goodsPO, result);
        return result;
    }
}
