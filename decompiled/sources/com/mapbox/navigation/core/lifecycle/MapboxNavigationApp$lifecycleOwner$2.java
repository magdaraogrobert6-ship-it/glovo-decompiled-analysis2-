package com.mapbox.navigation.core.lifecycle;

import com.mapbox.navigation.core.internal.lifecycle.CarAppLifecycleOwner;
import kotlin.jvm.internal.Lambda;
import o.accessisRenderNodeCompatiblecp;
import o.isAdapterPositionOnScreen;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxNavigationApp$lifecycleOwner$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxNavigationApp$lifecycleOwner$2 INSTANCE;
    public static final MapboxNavigationApp$lifecycleOwner$2 INSTANCE$1;
    public static final MapboxNavigationApp$lifecycleOwner$2 INSTANCE$2;
    public static final MapboxNavigationApp$lifecycleOwner$2 INSTANCE$3;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxNavigationApp$lifecycleOwner$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new MapboxNavigationApp$lifecycleOwner$2(i, i);
        INSTANCE$1 = new MapboxNavigationApp$lifecycleOwner$2(i, 1);
        INSTANCE$2 = new MapboxNavigationApp$lifecycleOwner$2(i, 2);
        INSTANCE$3 = new MapboxNavigationApp$lifecycleOwner$2(i, 3);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        int i = this.$r8$classId;
        if (i == 0) {
            isAdapterPositionOnScreen isadapterpositiononscreen = MapboxNavigationApp.mapboxNavigationAppDelegate$delegate;
            return (accessisRenderNodeCompatiblecp) MapboxNavigationApp.getMapboxNavigationAppDelegate().lifecycleOwner$delegate.MediaSessionCompatResultReceiverWrapper();
        }
        if (i != 1) {
            return i != 2 ? new MapboxNavigationOwner() : new CarAppLifecycleOwner();
        }
        return new MapboxNavigationAppDelegate();
    }
}
