package com.mapbox.navigation.core.internal;

import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReachabilityService {
    public static final ReachabilityInterface reachabilityInterface;

    static {
        ReachabilityInterface reachabilityInterfaceReachability = ReachabilityFactory.reachability(null);
        reachabilityInterfaceReachability.getClass();
        reachabilityInterface = reachabilityInterfaceReachability;
    }
}
