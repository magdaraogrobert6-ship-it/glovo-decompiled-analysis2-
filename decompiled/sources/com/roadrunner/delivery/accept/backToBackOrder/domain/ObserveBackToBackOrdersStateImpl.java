package com.roadrunner.delivery.accept.backToBackOrder.domain;

import androidx.compose.ui.graphics.Fields;
import com.roadrunner.delivery.accept.backToBackOrder.data.BackToBackOrdersDataRepositoryImpl;
import com.roadrunner.heatmap.data.HeatmapDataStore$get$$inlined$map$1;
import com.roadrunner.heatmap.presentation.HeatmapMapLayerUiModelImpl$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import o.TextMotionSaverlambda0;
import o.r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveBackToBackOrdersStateImpl implements r8lambdaKLUglSIfRlmIAl3gbMulFwcpk84 {
    private static int read = 1;
    private static int write;
    public final TextMotionSaverlambda0 IconCompatParcelizer;
    public final BackToBackOrdersDataRepositoryImpl RemoteActionCompatParcelizer;
    public final GetBackToBackOrdersDataImpl serializer;

    public ObserveBackToBackOrdersStateImpl(GetBackToBackOrdersDataImpl getBackToBackOrdersDataImpl, BackToBackOrdersDataRepositoryImpl backToBackOrdersDataRepositoryImpl, TextMotionSaverlambda0 textMotionSaverlambda0) {
        this.serializer = getBackToBackOrdersDataImpl;
        this.RemoteActionCompatParcelizer = backToBackOrdersDataRepositoryImpl;
        this.IconCompatParcelizer = textMotionSaverlambda0;
    }

    public final FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 read() {
        int i = 2 % 2;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new HeatmapMapLayerUiModelImpl$1(this, null, 2), new HeatmapDataStore$get$$inlined$map$1(this.serializer.write(), this, 8));
        int i2 = read + 27;
        write = i2 % Fields.SpotShadowColor;
        if (i2 % 2 != 0) {
            int i3 = 44 / 0;
        }
        return flowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
    }
}
