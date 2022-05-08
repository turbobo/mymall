package com.turbo.mymall.product.dao;

import com.turbo.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-08 21:30:00
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
