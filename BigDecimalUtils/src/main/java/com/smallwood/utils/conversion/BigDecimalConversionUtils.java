package com.smallwood.utils.conversion;


import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;

/**
 * @Auther smallwood
 * @Date 2019/11/5
 * @Desc BigDecimal 转换工具类
 */
public class BigDecimalConversionUtils {

    /**
     * Double转化成BigDecimal
     *
     * @param money 要转化的数据
     * @return 转化后的
     */
    public static BigDecimal doubleToBigDecimal(Double money) {
        return null != money ? BigDecimal.valueOf(money) : BigDecimal.ZERO;
    }

    /**
     * String转化成BigDecimal
     *
     * @param money 要转化的数据
     * @return 转化后的
     */
    public static BigDecimal stringToBigDecimal(String money) {
        try {
            return StringUtils.isNotBlank(money) ? new BigDecimal(money) : BigDecimal.ZERO;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return BigDecimal.ZERO;
        }

    }
}
