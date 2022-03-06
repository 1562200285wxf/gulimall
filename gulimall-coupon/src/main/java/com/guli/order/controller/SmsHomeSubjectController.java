package com.guli.order.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.guli.order.entity.SmsHomeSubjectEntity;
import com.guli.order.service.SmsHomeSubjectService;
import com.guli.common.utils.PageUtils;
import com.guli.common.utils.R;



/**
 * ??ҳר??????jd??ҳ?????ܶ?ר?⣬ÿ??ר???????µ?ҳ?棬չʾר????Ʒ??Ϣ??
 *
 * @author wangxiaofeng
 * @email 1562200285@qq.com
 * @date 2022-03-06 20:26:52
 */
@RestController
@RequestMapping("order/smshomesubject")
public class SmsHomeSubjectController {
    @Autowired
    private SmsHomeSubjectService smsHomeSubjectService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = smsHomeSubjectService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SmsHomeSubjectEntity smsHomeSubject = smsHomeSubjectService.getById(id);

        return R.ok().put("smsHomeSubject", smsHomeSubject);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.save(smsHomeSubject);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SmsHomeSubjectEntity smsHomeSubject){
		smsHomeSubjectService.updateById(smsHomeSubject);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		smsHomeSubjectService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
