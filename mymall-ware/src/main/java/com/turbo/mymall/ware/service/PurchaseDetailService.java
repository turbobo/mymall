package com.turbo.mymall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turbo.common.utils.PageUtils;
import com.turbo.mymall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-10 15:54:18
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

