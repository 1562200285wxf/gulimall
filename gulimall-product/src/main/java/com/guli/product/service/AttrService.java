package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-08 23:43:04
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

