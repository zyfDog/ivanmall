package com.zyf.ivanmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 首页轮播广告
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 14:47:00
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

