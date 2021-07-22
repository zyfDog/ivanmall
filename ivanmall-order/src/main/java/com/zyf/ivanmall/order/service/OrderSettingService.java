package com.zyf.ivanmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.order.entity.OrderSettingEntity;

import java.util.Map;

/**
 * 订单配置信息
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:36:32
 */
public interface OrderSettingService extends IService<OrderSettingEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

