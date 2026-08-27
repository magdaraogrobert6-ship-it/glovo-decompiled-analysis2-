package com.roadrunner.rider.state.provider.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import com.roadrunner.map.container.context.GetMapScope$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveRiderSessionEventsImpl$invoke$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 1;
    private static int write;
    public final /* synthetic */ GetMapScope$invoke$$inlined$map$1 read;
    public final /* synthetic */ int serializer;

    public /* synthetic */ ObserveRiderSessionEventsImpl$invoke$$inlined$map$1(GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1, int i) {
        this.serializer = i;
        this.read = getMapScope$invoke$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 39;
        RemoteActionCompatParcelizer = i2 % Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.serializer;
        Object obj = createFromParcel.INSTANCE;
        GetMapScope$invoke$$inlined$map$1 getMapScope$invoke$$inlined$map$1 = this.read;
        if (i4 == 0) {
            Object objCollect = getMapScope$invoke$$inlined$map$1.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 16), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return obj;
            }
            int i5 = write + 61;
            RemoteActionCompatParcelizer = i5 % Fields.SpotShadowColor;
            int i6 = i5 % 2;
            return objCollect;
        }
        if (i4 != 1) {
            Object objCollect2 = getMapScope$invoke$$inlined$map$1.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 18), shortNewsContentCardView);
            return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : obj;
        }
        Object objCollect3 = getMapScope$invoke$$inlined$map$1.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, 2), shortNewsContentCardView);
        if (objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i7 = RemoteActionCompatParcelizer + 23;
            write = i7 % Fields.SpotShadowColor;
            if (i7 % 2 != 0) {
                throw null;
            }
            obj = objCollect3;
        }
        int i8 = write + 117;
        RemoteActionCompatParcelizer = i8 % Fields.SpotShadowColor;
        if (i8 % 2 == 0) {
            int i9 = 69 / 0;
        }
        return obj;
    }
}
