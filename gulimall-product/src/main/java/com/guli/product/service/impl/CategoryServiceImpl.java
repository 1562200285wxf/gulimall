package com.guli.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.product.dao.CategoryDao;
import com.guli.product.entity.CategoryEntity;
import com.guli.product.service.CategoryService;

import javax.annotation.Resource;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {


    @Resource
    CategoryDao categoryDao;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> all = categoryDao.selectList(null);
        List<CategoryEntity> parents =  all.stream().filter(e ->e.getParentCid().longValue()==0)
                .map(node->{node.setChildren(getChildren(node,all));
                    return node;})
                .sorted(Comparator.comparingInt(node -> (node.getSort() == null ? 0 : node.getSort())))
                .collect(Collectors.toList());
        return parents;
    }

    public List<CategoryEntity> getChildren(CategoryEntity children,List<CategoryEntity> all){
        return all.stream().filter(e ->e.getParentCid().longValue()==children.getCatId().longValue())
                .map(node->{node.setChildren(getChildren(node,all));
                    return node;})
                .sorted(Comparator.comparingInt(node -> (node.getSort() == null ? 0 : node.getSort())))
                .collect(Collectors.toList());
    }

}
