package com.guli.product.dao;

import com.guli.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-08 23:43:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
