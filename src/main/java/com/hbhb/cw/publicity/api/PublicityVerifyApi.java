package com.hbhb.cw.publicity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yzc
 * @since 2021-01-07
 */
public interface PublicityVerifyApi {
    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
