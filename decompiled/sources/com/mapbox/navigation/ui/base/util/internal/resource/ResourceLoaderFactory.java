package com.mapbox.navigation.ui.base.util.internal.resource;

import com.mapbox.common.ReachabilityFactory;
import com.mapbox.common.ReachabilityInterface;
import com.mapbox.navigation.ui.utils.internal.resource.DefaultResourceLoader;
import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourceLoaderFactory {
    public static final isAdapterPositionOnScreen sharedLoader$delegate = new isAdapterPositionOnScreen(new r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0(0) { // from class: com.mapbox.navigation.ui.base.util.internal.resource.ResourceLoaderFactory$sharedLoader$2
        @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
        public final Object invoke() {
            ReachabilityInterface reachabilityInterfaceReachability = ReachabilityFactory.reachability(null);
            reachabilityInterfaceReachability.getClass();
            return new DefaultResourceLoader(reachabilityInterfaceReachability);
        }
    });
}
