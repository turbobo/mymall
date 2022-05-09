package com.turbo.mymall.order.dao;

import com.turbo.mymall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 21:35:31
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
