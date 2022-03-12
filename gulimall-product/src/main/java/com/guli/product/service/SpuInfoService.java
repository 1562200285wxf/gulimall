package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-08 23:43:05
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

