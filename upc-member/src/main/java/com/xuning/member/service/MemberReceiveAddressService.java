package com.xuning.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuning.common.utils.PageUtils;
import com.xuning.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 会员收货地址
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:47:05
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

