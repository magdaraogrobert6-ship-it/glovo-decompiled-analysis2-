package com.mapbox.search;

import com.mapbox.search.base.utils.FormattedTimeProviderImpl;
import kotlin.jvm.internal.Lambda;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes3.dex */
public final class MapboxSearchSdk$formattedTimeProvider$2 extends Lambda implements r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 {
    public static final MapboxSearchSdk$formattedTimeProvider$2 INSTANCE;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MapboxSearchSdk$formattedTimeProvider$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    static {
        int i = 0;
        INSTANCE = new MapboxSearchSdk$formattedTimeProvider$2(i, i);
    }

    @Override // o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0
    public final Object invoke() {
        if (this.$r8$classId != 0) {
            return null;
        }
        if (MapboxSearchSdk.timeProvider != null) {
            return new FormattedTimeProviderImpl();
        }
        removeNodeAtDepth.serializer("timeProvider");
        throw null;
    }
}
