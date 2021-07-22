package com.zyf.ivanmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:36:32
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

