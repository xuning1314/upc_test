package com.xuning.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xuning.common.utils.PageUtils;
import com.xuning.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author xuning
 * @email xuning@gmail.com
 * @date 2021-12-31 09:36:40
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

