package org.smart4j.framework.annotation;

import java.lang.annotation.*;

/**
 * Author: LiTing
 * Date: 2017/7/11 23:11
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Aspect {
    Class<? extends Annotation> value();
}
