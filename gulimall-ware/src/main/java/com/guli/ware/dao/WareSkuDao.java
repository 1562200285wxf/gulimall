package com.guli.ware.dao;

import com.guli.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-06 20:30:54
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
