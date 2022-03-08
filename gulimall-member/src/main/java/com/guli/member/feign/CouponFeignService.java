package com.guli.member.feign;

import com.guli.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author ：wang xiaofeng
 * @date ：Created in 2022/3/7 22:11
 * @description：
 */
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    @RequestMapping("/order/smscoupon/list")
    public R list(@RequestParam Map<String, Object> params);
}
