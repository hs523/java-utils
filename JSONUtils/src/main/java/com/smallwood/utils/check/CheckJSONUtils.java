package com.smallwood.utils.check;

import com.alibaba.fastjson.JSONObject;

/**
 * @Auther smallwood
 * @Date 2019/10/30
 * @Desc
 */
public class CheckJSONUtils {

    /**
     * 验证一个字符串是否是JSON格式
     *
     * @param str 要验证的字符串
     * @return true false
     */
    public static boolean isJson(String str) {
        try {
            JSONObject jsonStr = JSONObject.parseObject(str);
            return true;
        } catch (Exception e) {
            return false;
        }

    }
}
