package com.turbo.mymall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turbo.common.utils.PageUtils;
import com.turbo.mymall.order.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 21:35:31
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

