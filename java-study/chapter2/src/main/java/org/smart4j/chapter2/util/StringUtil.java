package org.smart4j.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Author: LiTing
 * Date: 2017/7/6 00:25
 */
public final class StringUtil {

    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }

        return StringUtils.isEmpty(str);
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
