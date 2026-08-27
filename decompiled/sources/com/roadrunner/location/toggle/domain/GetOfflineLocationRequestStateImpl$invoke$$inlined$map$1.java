package com.roadrunner.location.toggle.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.earnings.domain.ObserveMultiplier$invoke$$inlined$map$1$2;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1 implements Flow {
    private static int read = 0;
    private static int write = 1;
    public final /* synthetic */ int IconCompatParcelizer;
    public final /* synthetic */ GetMapScope$invoke$$inlined$map$1 RemoteActionCompatParcelizer;

    public /* synthetic */ GetOfflineLocationRequestStateImpl$invoke$$inlined$map$1(GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1, int i) {
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = getMapScope$invoke$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.IconCompatParcelizer;
        Object obj = createFromParcel.INSTANCE;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = this.RemoteActionCompatParcelizer;
        if (i2 == 0) {
            Object objCollect = getMapScope$invoke$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 28), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj;
            }
            int i3 = read + 103;
            write = i3 % Fields.SpotShadowColor;
            if (i3 % 2 != 0) {
                return objCollect;
            }
            throw null;
        }
        Object objCollect2 = getMapScope$invoke$$inlined$map$1.collect(new ObserveMultiplier$invoke$$inlined$map$1$2(flowCollector, 4), shortNewsContentCardView);
        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i4 = write + 123;
            read = i4 % Fields.SpotShadowColor;
            if (i4 % 2 != 0) {
                int i5 = 45 / 0;
            }
            obj = objCollect2;
        }
        int i6 = write + 69;
        read = i6 % Fields.SpotShadowColor;
        int i7 = i6 % 2;
        return obj;
    }
}
