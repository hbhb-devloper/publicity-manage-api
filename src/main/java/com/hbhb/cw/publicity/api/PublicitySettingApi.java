package com.hbhb.cw.publicity.api;

import org.springframework.web.bind.annotation.PostMapping;

public interface PublicitySettingApi {

    @PostMapping("/setting")
    void addGoodsSetting();

}
