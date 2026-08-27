package com.roadrunner.freelancing.domain;

import androidx.compose.ui.graphics.Fields;
import androidx.work.impl.model.WorkSpecDaoKt$dedup$$inlined$map$1;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$2;
import com.roadrunner.delivery.state.StateProviderImpl$special$$inlined$map$7$2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.ShortNewsContentCardView;
import o.createFromParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class HasWorkNowOpportunityImpl$invoke$$inlined$map$1 implements Flow {
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 serializer;
    public final /* synthetic */ int write;

    public /* synthetic */ HasWorkNowOpportunityImpl$invoke$$inlined$map$1(FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, int i) {
        this.write = i;
        this.serializer = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, ShortNewsContentCardView shortNewsContentCardView) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = this.write;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = this.serializer;
        if (i3 == 0) {
            Object objCollect = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(new StateProviderImpl$special$$inlined$map$7$2(flowCollector, i), shortNewsContentCardView);
            if (objCollect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i4 = RemoteActionCompatParcelizer + 61;
            read = i4 % Fields.SpotShadowColor;
            int i5 = i4 % 2;
            return objCollect;
        }
        int i6 = 1;
        if (i3 != 1) {
            Object objCollect2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(new StateProviderImpl$special$$inlined$map$2.AnonymousClass2(flowCollector, i6), shortNewsContentCardView);
            if (objCollect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                return createfromparcel;
            }
            int i7 = read + 67;
            RemoteActionCompatParcelizer = i7 % Fields.SpotShadowColor;
            int i8 = i7 % 2;
            return objCollect2;
        }
        Object objCollect3 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(new WorkSpecDaoKt$dedup$$inlined$map$1.AnonymousClass2(flowCollector, 28), shortNewsContentCardView);
        if (objCollect3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            return createfromparcel;
        }
        int i9 = RemoteActionCompatParcelizer + 1;
        read = i9 % Fields.SpotShadowColor;
        if (i9 % 2 == 0) {
            int i10 = 8 / 0;
        }
        return objCollect3;
    }
}
