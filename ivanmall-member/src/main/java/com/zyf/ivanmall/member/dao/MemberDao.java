package com.zyf.ivanmall.member.dao;

import com.zyf.ivanmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author zhanyifan
 * @email mrzhanyf@163.com
 * @date 2021-07-22 15:00:21
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
