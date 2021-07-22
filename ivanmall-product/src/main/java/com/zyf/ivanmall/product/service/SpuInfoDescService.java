package com.zyf.ivanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-21 19:09:26
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

