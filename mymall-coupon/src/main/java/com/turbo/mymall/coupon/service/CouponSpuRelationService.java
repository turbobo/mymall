package com.turbo.mymall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turbo.common.utils.PageUtils;
import com.turbo.mymall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 18:03:53
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

