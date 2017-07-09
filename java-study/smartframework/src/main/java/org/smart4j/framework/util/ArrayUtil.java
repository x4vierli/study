package org.smart4j.framework.util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Author: LiTing
 * Date: 2017/7/9 22:35
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtil.isEmpty(array);
    }

    public static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
