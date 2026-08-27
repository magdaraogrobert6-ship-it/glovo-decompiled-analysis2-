package com.mapbox.maps.extension.style.sources.generated;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;

/* JADX INFO: loaded from: classes2.dex */
public final class GeoJsonSource$mainHandler$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final GeoJsonSource$mainHandler$2 INSTANCE;
    public static final GeoJsonSource$mainHandler$2 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GeoJsonSource$mainHandler$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new GeoJsonSource$mainHandler$2(i, i);
        INSTANCE$1 = new GeoJsonSource$mainHandler$2(i, 1);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        return this.$r8$classId != 0 ? new Handler(GeoJsonSource.workerThread.getLooper()) : new Handler(Looper.getMainLooper());
    }
}
