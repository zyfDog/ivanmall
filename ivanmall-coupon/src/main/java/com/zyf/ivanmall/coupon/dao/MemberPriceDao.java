package com.zyf.ivanmall.coupon.dao;

import com.zyf.ivanmall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 14:47:00
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
