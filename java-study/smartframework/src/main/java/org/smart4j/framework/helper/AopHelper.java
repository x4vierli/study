package org.smart4j.framework.helper;

import org.smart4j.framework.annotation.Aspect;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * Author: LiTing
 * Date: 2017/7/11 23:47
 */
public final class AopHelper {

    private static Set<Class<?>> createTargetClassSet(Aspect aspect) throws Exception {
        Set<Class<?>> targetClassSet = new HashSet<>();
        Class<? extends Annotation> annonation = aspect.value();
        if (annonation != null && !annonation.equals(Aspect.class)) {
            targetClassSet.addAll(ClassHelper.getClassSetByAnnotation(annonation));
        }
        return targetClassSet;
    }
}
