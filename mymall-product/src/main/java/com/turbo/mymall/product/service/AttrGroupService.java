package com.turbo.mymall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turbo.common.utils.PageUtils;
import com.turbo.mymall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-08 21:30:00
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

