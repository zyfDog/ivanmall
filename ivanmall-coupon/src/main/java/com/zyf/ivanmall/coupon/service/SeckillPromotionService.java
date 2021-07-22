package com.zyf.ivanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.coupon.entity.SeckillPromotionEntity;

import java.util.Map;

/**
 * 秒杀活动
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 14:47:00
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

