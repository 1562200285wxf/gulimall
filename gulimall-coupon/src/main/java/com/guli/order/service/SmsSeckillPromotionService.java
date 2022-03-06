package com.guli.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.order.entity.SmsSeckillPromotionEntity;

import java.util.Map;

/**
 * ??ɱ?
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-06 20:26:53
 */
public interface SmsSeckillPromotionService extends IService<SmsSeckillPromotionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

