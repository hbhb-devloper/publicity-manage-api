package com.hbhb.cw.publicity.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yzc
 * @since 2021-01-05
 */
public interface PublicityApplicationApi {
    @GetMapping("/count")
    Long countNotice(@RequestParam("id") Integer id);
}
