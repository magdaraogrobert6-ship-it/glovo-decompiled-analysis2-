package com.mapbox.common.module;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public final class NetworkIdGenerator {
    public static final NetworkIdGenerator INSTANCE = new NetworkIdGenerator();
    private static final AtomicLong counter = new AtomicLong(0);

    private NetworkIdGenerator() {
    }

    public final long newId() {
        return counter.incrementAndGet();
    }
}
