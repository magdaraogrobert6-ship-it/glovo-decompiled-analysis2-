package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class MapboxRenderThread$mainHandler$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxRenderThread$mainHandler$2 INSTANCE = new MapboxRenderThread$mainHandler$2();

    public MapboxRenderThread$mainHandler$2() {
        super(0);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
