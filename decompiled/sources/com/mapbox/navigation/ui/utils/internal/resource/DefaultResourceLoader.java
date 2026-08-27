package com.mapbox.navigation.ui.utils.internal.resource;

import com.mapbox.common.ReachabilityInterface;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultResourceLoader {
    public final ReachabilityInterface reachability;
    public final AtomicLong nextRequestId = new AtomicLong(0);
    public final ConcurrentHashMap cancelableMap = new ConcurrentHashMap();
    public final ConcurrentLinkedQueue observers = new ConcurrentLinkedQueue();

    public DefaultResourceLoader(ReachabilityInterface reachabilityInterface) {
        this.reachability = reachabilityInterface;
    }
}
