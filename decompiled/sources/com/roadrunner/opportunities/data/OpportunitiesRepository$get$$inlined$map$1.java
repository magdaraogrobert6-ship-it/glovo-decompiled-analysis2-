package com.roadrunner.opportunities.data;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class OpportunitiesRepository$get$$inlined$map$1 implements Flow {
    private static int IconCompatParcelizer = 1;
    private static int read;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 serializer;

    public /* synthetic */ OpportunitiesRepository$get$$inlined$map$1(FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1, int i) {
        this.RemoteActionCompatParcelizer = i;
        this.serializer = flowKt__ZipKt$combine$$inlined$unsafeFlow$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2 % 2;
        int i2 = this.RemoteActionCompatParcelizer;
        Object obj = createFromParcel.INSTANCE;
        FlowKt__ZipKt$combine$$inlined$unsafeFlow$1 flowKt__ZipKt$combine$$inlined$unsafeFlow$1 = this.serializer;
        if (i2 != 0) {
            Object objCollect = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 3), shortNewsContentCardView);
            return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : obj;
        }
        Object objCollect2 = flowKt__ZipKt$combine$$inlined$unsafeFlow$1.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, 13), shortNewsContentCardView);
        if (objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
            int i3 = IconCompatParcelizer + 15;
            read = i3 % Fields.SpotShadowColor;
            int i4 = i3 % 2;
            obj = objCollect2;
        }
        int i5 = IconCompatParcelizer + 109;
        read = i5 % Fields.SpotShadowColor;
        int i6 = i5 % 2;
        return obj;
    }
}
