package com.junjie.centaurus.annotation.Lock.annotation;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GetDistributedLock {
    // 分布式锁 key
    String lockKey();

    // 分布式锁 value，默认为 lockValue
    String lockValue() default "lockValue";

    // 过期时间，默认为 300秒
    int expireTime() default 300;
}
