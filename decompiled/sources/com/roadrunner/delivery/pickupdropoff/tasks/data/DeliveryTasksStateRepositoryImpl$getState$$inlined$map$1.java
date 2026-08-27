package com.roadrunner.delivery.pickupdropoff.tasks.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.heatmap.data.HeatmapDataStore$getBoolean$$inlined$map$1;
import com.roadrunner.home.nest.divider.ObserveDivider$invoke$$inlined$map$1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class DeliveryTasksStateRepositoryImpl$getState$$inlined$map$1 implements Flow {
    private static int serializer = 1;
    private static int write;
    public final /* synthetic */ HeatmapDataStore$getBoolean$$inlined$map$1 RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ DeliveryTasksStateRepositoryImpl$getState$$inlined$map$1(HeatmapDataStore$getBoolean$$inlined$map$1 heatmapDataStore$getBoolean$$inlined$map$1, int i) {
        this.read = i;
        this.RemoteActionCompatParcelizer = heatmapDataStore$getBoolean$$inlined$map$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = write + 121;
        serializer = i2 % Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            createFromParcel createfromparcel = createFromParcel.INSTANCE;
            throw null;
        }
        int i3 = this.read;
        Object obj = createFromParcel.INSTANCE;
        HeatmapDataStore$getBoolean$$inlined$map$1 heatmapDataStore$getBoolean$$inlined$map$1 = this.RemoteActionCompatParcelizer;
        if (i3 == 0) {
            Object objCollect = heatmapDataStore$getBoolean$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 14), shortNewsContentCardView);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = objCollect;
            }
            int i4 = write + 105;
            serializer = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return obj;
        }
        Object objCollect2 = heatmapDataStore$getBoolean$$inlined$map$1.collect(new ObserveDivider$invoke$$inlined$map$1.AnonymousClass2(flowCollector, 15), shortNewsContentCardView);
        if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return obj;
        }
        int i6 = serializer + 9;
        write = i6 % Fields.SpotShadowColor;
        if (i6 % 2 != 0) {
            int i7 = 3 % 4;
        }
        return objCollect2;
    }
}
