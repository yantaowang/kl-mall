package com.kl.platform.manager.controller;

import com.kl.platform.common.api.CommonPage;
import com.kl.platform.common.api.CommonResult;
import com.kl.order.api.model.SmsCouponHistory;
import com.kl.order.api.service.SmsCouponHistoryService;
import com.kl.product.api.dversion.ProductApiVersion;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 优惠券领取记录管理Controller
 * Created by macro on 2018/11/6.
 */
@Controller
@Api(tags = "SmsCouponHistoryController", description = "优惠券领取记录管理")
@RequestMapping("/couponHistory")
public class SmsCouponHistoryController {
    @DubboReference(version = ProductApiVersion.VERSION_1,group = ProductApiVersion.GROUP_KL)
    private SmsCouponHistoryService historyService;

    @ApiOperation("根据优惠券id，使用状态，订单编号分页获取领取记录")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<CommonPage<SmsCouponHistory>> list(@RequestParam(value = "couponId", required = false) Long couponId,
                                                           @RequestParam(value = "useStatus", required = false) Integer useStatus,
                                                           @RequestParam(value = "orderSn", required = false) String orderSn,
                                                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        List<SmsCouponHistory> historyList = historyService.list(couponId, useStatus, orderSn, pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(historyList));
    }
}
