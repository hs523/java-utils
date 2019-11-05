package com.smallwood.utils.result;

import lombok.Getter;

/**
 * @Auther smallwood
 * @Date 2019/11/5
 * @Desc 结果状态
 */
public class ResultCode {

    ResultCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Getter
    private String code;
    @Getter
    private String message;
}
