package com.zyf.ivanmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zyf.common.utils.PageUtils;
import com.zyf.ivanmall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-21 19:09:26
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

