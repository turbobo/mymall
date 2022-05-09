package com.turbo.mymall.coupon.dao;

import com.turbo.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 18:03:53
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
