package com.turbo.mymall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.turbo.common.utils.PageUtils;
import com.turbo.mymall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author turbobo
 * @email 735567435@qq.com
 * @date 2022-05-09 20:26:18
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

