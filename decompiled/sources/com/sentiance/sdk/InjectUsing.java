package com.sentiance.sdk;

import com.sentiance.sdk.processguard.Guard$Type;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@DontObfuscate
public @interface InjectUsing {
    String cacheName() default "";

    String componentName() default "";

    String dataLogTag() default "";

    int executorThreads() default 1;

    Guard$Type guardType() default Guard$Type.NON_REFERENCE_COUNTED;

    String memCacheName() default "";
}
