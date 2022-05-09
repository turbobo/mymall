package com.turbo.mymall.member.dao;

import com.turbo.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 20:26:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
