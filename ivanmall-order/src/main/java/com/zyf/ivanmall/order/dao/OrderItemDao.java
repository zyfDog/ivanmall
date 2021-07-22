package com.zyf.ivanmall.order.dao;

import com.zyf.ivanmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:36:32
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
