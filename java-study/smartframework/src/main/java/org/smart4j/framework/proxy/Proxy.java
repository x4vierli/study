package org.smart4j.framework.proxy;

/**
 * Author: LiTing
 * Date: 2017/7/11 23:13
 */
public interface Proxy {
    Object doProxy(ProxyChain proxyChain) throws Throwable;
}
