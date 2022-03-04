package com.guli.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.product.entity.SkuImagesEntity;

import java.util.Map;
import com.guli.common.utils.PageUtils;
/**
 * skuͼƬ
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-02 23:35:09
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

