package com.guli.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.Query;

import com.guli.order.dao.SmsSeckillSessionDao;
import com.guli.order.entity.SmsSeckillSessionEntity;
import com.guli.order.service.SmsSeckillSessionService;


@Service("smsSeckillSessionService")
public class SmsSeckillSessionServiceImpl extends ServiceImpl<SmsSeckillSessionDao, SmsSeckillSessionEntity> implements SmsSeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSessionEntity> page = this.page(
                new Query<SmsSeckillSessionEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSessionEntity>()
        );

        return new PageUtils(page);
    }

}
