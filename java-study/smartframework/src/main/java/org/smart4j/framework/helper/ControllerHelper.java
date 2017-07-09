package org.smart4j.framework.helper;

import org.smart4j.framework.bean.Handler;
import org.smart4j.framework.bean.Request;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Author: LiTing
 * Date: 2017/7/9 22:41
 */
public final class ControllerHelper {

    private static final Map<Request, Handler> ACTION_MAP = new HashMap<>();

    static {
        Set<Class<?>> controllerClassSet = ClassHelper.getControllerClassSet();
    }
}
