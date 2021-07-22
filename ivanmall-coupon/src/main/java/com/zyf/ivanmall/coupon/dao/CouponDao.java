package com.zyf.ivanmall.coupon.dao;

import com.zyf.ivanmall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 14:47:00
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
