package com.hbhb.cw.publicitymanage.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wangxiaogang
 */
public interface PrintNoticeApi {
    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
