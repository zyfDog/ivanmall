package com.zyf.ivanmall.member.dao;

import com.zyf.ivanmall.member.entity.IntegrationChangeHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 积分变化历史记录
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:00:21
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {
	
}
