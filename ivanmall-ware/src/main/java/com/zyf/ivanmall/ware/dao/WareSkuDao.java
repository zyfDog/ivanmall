package com.zyf.ivanmall.ware.dao;

import com.zyf.ivanmall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:42:25
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
